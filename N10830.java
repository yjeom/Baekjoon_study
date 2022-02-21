import java.io.*;
import java.util.StringTokenizer;

public class N10830 {
    static final int P=1000;
    static int n;
    static long B;
    static long a[][];
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        B=Long.parseLong(st.nextToken());
        a=new long[n][n];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                a[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        long result[][]=funcPow(a,B);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                bw.write(result[i][j]%P+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    public static long[][] matrixMultiply(long a[][],long b[][]){
        long multi[][]=new long[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                for(int k=0;k<n;k++){
                    sum+=a[i][k]*b[k][j];
                }
                multi[i][j]=sum%P;
            }
        }
        return multi;
    }
    public static long[][] funcPow(long C[][],long num){
        if(num==1)
            return C;
        else{
            long x[][]=funcPow(C,num/2);
            if(num%2==0){
                return matrixMultiply(x,x);
            }else{
                long temp[][]=matrixMultiply(x,x);
                return matrixMultiply(temp,C);
            }
        }
    }
}
