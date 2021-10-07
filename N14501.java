import java.io.*;
import java.util.StringTokenizer;

public class N14501 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        int [][]arr=new int[N+2][2];
        int []dp=new int[N+2];
        int max=0;
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            arr[i+1][0]=Integer.parseInt(st.nextToken());
            arr[i+1][1]=Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<=N+1;i++){
            int t=arr[i][0];
            max=Math.max(max,dp[i]);
            if(i+t<=N+1){
                dp[i+t]=Math.max(dp[i+t],max+arr[i][1]);
            }

        }
        bw.write(max+"\n");
        bw.flush();
        bw.close();
        br.close();
    }


}
