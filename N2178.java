import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N2178 {
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,1,-1};
    static int[][] map;
    public static void findMaze(int[][] inputs,boolean[][]visited,
                               int N,int M,int count){
        Queue<int[]> queue=new LinkedList<>();
        visited[0][0]=true;
        count++;
        queue.add(new int[]{0,0});

        while(!queue.isEmpty()){
            int[] index= queue.poll();
            int x=index[0];
            int y=index[1];

            for(int i=0;i<4;i++){
                int next_x=x+dx[i];
                int next_y=y+dy[i];
                if(next_x<0||next_y<0||next_x>=N||next_y>=M) continue;
                if(map[next_x][next_y]==0) continue;
                if(!visited[next_x][next_y]){
                    visited[next_x][next_y]=true;
                    map[next_x][next_y]=map[x][y]+1;
                    queue.add(new int[]{next_x,next_y});
                }
            }
        }

    }
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int [][]inputs=new int[N][M];
        boolean [][]visited=new boolean[N][M];
        map=new int[N][M];
        for(int i=0;i<N;i++){
            char[] line=br.readLine().toCharArray();
            for(int j=0;j<line.length;j++){
                inputs[i][j]=Integer.parseInt(String.valueOf(line[j]));
                if(line[j]=='1'){
                    map[i][j]=1;
                }
            }
        }

        findMaze(inputs,visited,N,M,0);
        System.out.println(map[N-1][M-1]);
    }
}
