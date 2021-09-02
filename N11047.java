import java.io.*;
import java.util.StringTokenizer;

public class N11047 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        int []values=new int[N];
        for(int i=0;i<N;i++){
            values[i]=Integer.parseInt(br.readLine());
        }
        int count=0;
        for(int i=N-1;i>=0;i--){
            if(K==0)break;
            else if(K>=values[i]){
                count+=K/values[i];
                K=K-((K/values[i])*values[i]);
            }
        }
        bw.write(count+"\n");
        bw.flush();
        bw.close();
    }
}
