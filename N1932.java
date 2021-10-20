import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1932 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int values[][]=new int[n+1][n+1];
        int d[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=1;j<=i;j++){
                values[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        d[1][1]=values[1][1];
        if(n>1){
            d[2][1]=values[1][1]+values[2][1];
            d[2][2]=values[1][1]+values[2][2];
            for(int i=3;i<=n;i++){
                for(int j=1;j<=i;j++){
                    d[i][j]=Math.max(d[i-1][j-1]+values[i][j],d[i-1][j]+values[i][j]);
                }
            }
        }
        int max=0;
        for(int i=1;i<=n;i++){
            max=Math.max(max,d[n][i]);
        }
        System.out.println(max);
    }
}
