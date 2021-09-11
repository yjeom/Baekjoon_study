import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N1697 {
    static int[] dx={-1,1,2};
    static int []visited;
    public static void number1697(int n,int k){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(n);
        while(!queue.isEmpty()){
            int  index=queue.poll();
            for(int i=0;i<3;i++){
                int next=index+dx[i];
                if(dx[i]==2){
                    next=index*2;
                }
                if(next<0||k<0||next>100000)continue;
                if(visited[next]==0){
                    visited[next]=visited[index]+1;
                    queue.add(next);
                }
            }
        }//end while
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        visited=new int[100001];
        number1697(N,K);
        visited[N]=0;
        bw.write(visited[K]+"\n");
        bw.flush();
        bw.close();
    }
}
