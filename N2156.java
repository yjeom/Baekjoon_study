import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2156 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int values[]=new int [n+1];
        int d[]=new int [n+1];
        for(int i=1;i<=n;i++){
            values[i]=Integer.parseInt(br.readLine());
        }
        d[1]=values[1];
        if(n>1){
            d[2]=values[1]+values[2];
            for(int i=3;i<=n;i++){
                d[i]=Math.max(d[i-3]+values[i-1]+values[i],d[i-2]+values[i]);
                d[i]=Math.max(d[i],d[i-1]);
            }
        }
        System.out.println(d[n]);
    }
}
