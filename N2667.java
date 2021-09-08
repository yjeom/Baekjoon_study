import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class N2667 {
    static int [][]map;
    static int N;
    static boolean[][] visited;
    public static int scopeDanji(int x,int y,int count){
        if(x<0 || y<0 || x>=N || y>=N) return count;
        if(!visited[x][y]&& map[x][y]==1){
            visited[x][y]=true;
            count++;
            count=scopeDanji(x,y+1,count);
            count=scopeDanji(x+1,y,count);
            count=scopeDanji(x,y-1,count);
            count=scopeDanji(x-1,y,count);
            return count;
        }
        return count;
    }
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        N=Integer.parseInt(br.readLine());
        map=new int[N][N];
        visited=new boolean[N][N];
        for(int i=0;i<N;i++){
            char[] line=br.readLine().toCharArray();
            for(int j=0;j< line.length;j++){
                map[i][j]=Integer.parseInt(String.valueOf(line[j]));
            }
        }
        int danji=0;
        ArrayList<Integer> count=new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int temp=scopeDanji(i,j,0);
                if(temp>0){
                    danji++;
                    count.add(temp);
                }
            }
        }
        bw.write(danji+"\n");
        Collections.sort(count);
        for(int i=0;i<count.size();i++){
            bw.write(count.get(i)+"\n");
        }
        bw.flush();
        bw.close();

    }
}
