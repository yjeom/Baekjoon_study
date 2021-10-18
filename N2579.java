import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2579 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int values[]=new int[n+1];
        int d[]=new int[n+1];
        int sum=0;
        for(int i=0;i<n;i++){
            values[i+1]=Integer.parseInt(br.readLine());
        }
        d[1]=values[1];
        if(n>=2) {
            d[2] = values[1] + values[2];
            for (int i = 3; i <= n; i++) {
                d[i] = Math.max(d[i - 3] + values[i - 1] + values[i], d[i - 2] + values[i]);
            }
        }
        System.out.println(d[n]);
    }
}
