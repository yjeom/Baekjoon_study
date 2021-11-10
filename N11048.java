import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11048 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int inputs[][]=new int[n+1][m+1];
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=m;j++){
                inputs[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        dp[1][1]=inputs[1][1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j-1>0)
                    dp[i][j]=Math.max(dp[i][j],dp[i][j-1]+inputs[i][j]);
                if(i-1>0)
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j]+inputs[i][j]);
                if(i-1>0&&j-1>0)
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-1]+inputs[i][j]);

            }
        }
        System.out.println(dp[n][m]);
    }
}
