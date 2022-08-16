import java.util.Scanner;

public class N1010 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int testCase=scanner.nextInt();
        int result[]=new int[testCase];
        for(int t=0;t<testCase;t++){
            int N=scanner.nextInt();
            int M=scanner.nextInt();
            int dp[][]=new int[N+1][M+1];
            for(int i=1;i<=M;i++){
                dp[1][i]=i;
            }
            if(N>1) {
                for (int i = 2; i <= N; i++) {
                    for (int j = i; j <= M; j++) {
                        dp[i][j] = dp[i-1][j-1]+dp[i][j-1];
                    }
                }
            }
            result[t]=dp[N][M];
        }
        for(int i=0;i<testCase;i++){
            System.out.println(result[i]);
        }
    }
}
