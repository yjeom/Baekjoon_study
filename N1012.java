import java.io.*;
import java.util.StringTokenizer;

public class N1012 {
    public static boolean groupingCabbage(int[][]map,int[][]visited,int M,int N,int x,int y){
        if(x<0 || y<0 || x>=M || y>=N) return false;
        else{
            if(map[x][y]==1 && visited[x][y]!=1){
                visited[x][y]=1;
                groupingCabbage(map,visited,M,N,x-1,y);
                groupingCabbage(map,visited,M,N,x,y-1);
                groupingCabbage(map,visited,M,N,x+1,y);
                groupingCabbage(map,visited,M,N,x,y+1);
                return true;
            }else{
                return false;
            }
        }

    }
    public static int groupCounting(int[][]map,int[][]visited,int M,int N){
        int count=0;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(groupingCabbage(map,visited,M,N,i,j)==true) count++;
            }
        }
        return count;
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        int[]result=new int[T];
        for(int i=0;i<T;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int M=Integer.parseInt(st.nextToken());
            int N=Integer.parseInt(st.nextToken());
            int K=Integer.parseInt(st.nextToken());
            int [][] map=new int[M][N];
            int [][] visited=new int[M][N];
            for(int j=0;j<K;j++){
                st=new StringTokenizer(br.readLine());
                int x=Integer.parseInt(st.nextToken());
                int y=Integer.parseInt(st.nextToken());
                map[x][y]=1;
            }
            result[i]=groupCounting(map,visited,M,N);
        }
        for(int i=0;i<T;i++){
            bw.write(result[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
