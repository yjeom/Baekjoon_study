import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N7576 {
    static int M;
    static int N;
    static int[][]map;
    static int[][]visited;
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,1,-1};
    static Queue<int[]> queue=new LinkedList<>();
    public static int tomato(int days){
        while (!queue.isEmpty()){
            int []arr=queue.poll();
            for(int i=0;i<4;i++){
                int nextX=arr[0]+dx[i];
                int nextY=arr[1]+dy[i];
                if(nextX<0 || nextY <0 || nextX >=N|| nextY >=M) continue;
                if(map[nextX][nextY]!=1&&
                        map[nextX][nextY]!=-1
                        &&visited[nextX][nextY]==0){
                    visited[nextX][nextY]=1;
                    queue.add(new int[]{nextX,nextY});
                    map[nextX][nextY]=map[arr[0]][arr[1]]+1;
                    days=map[nextX][nextY];
                }
            }
        }
        return days;
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        M=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());
        map=new int[N][M];
        visited=new int[N][M];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int j=0;
            while(st.hasMoreTokens()){
                map[i][j]=Integer.parseInt(st.nextToken());
                if(map[i][j]==-1)visited[i][j]=-1;
                j++;
            }
        }

        boolean zero=false;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                int temp=map[i][j];
                if(temp==1){
                    queue.add(new int[]{i,j});
                    visited[i][j]=1;
                }
                if(temp==0)zero=true;
            }
        }
        int days=tomato(0);
        boolean endFlag=false;
        for(int i=0;i<N;i++){
            if(endFlag) break;
            for(int j=0;j<M;j++){
                if(visited[i][j]==0){
                    endFlag=true;
                    break;
                }
            }
        }
        if(!zero) bw.write("0\n");
        else if(endFlag) bw.write("-1\n");
        else bw.write(days-1+"\n");
        bw.flush();
        bw.close();
    }
}
