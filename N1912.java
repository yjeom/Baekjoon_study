import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1912 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int values[]=new int[n+1];
        int d[]=new int[n+1];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            values[i]=Integer.parseInt(st.nextToken());
        }
        d[1]=values[1];
        for(int i=2;i<=n;i++){
            d[i]=values[i];
            d[i]=Math.max(d[i],d[i-1]+values[i]);
        }
        int max=-1001;
        for(int i=1;i<=n;i++){
            max=Math.max(max,d[i]);
        }
        System.out.println(max);
    }
}
