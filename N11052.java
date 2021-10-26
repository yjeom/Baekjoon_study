import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11052 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int value[]=new int[n+1];
        int d[]=new int[n+1];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            value[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                d[i]=Math.max(d[i],d[i-j]+value[j]);
            }
        }
        System.out.println(d[n]);
    }
}
