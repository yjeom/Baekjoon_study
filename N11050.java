import java.io.*;
import java.util.StringTokenizer;

public class N11050 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        bw.write( func(N,K)+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
    static int func(int n,int k){
        if(n==k || k==0) {
            return 1;
        }else{
            return func(n-1,k)+func(n-1,k-1);
        }

    }
}
