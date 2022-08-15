import java.util.Scanner;

public class N2616 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
        }
        int capacity=scanner.nextInt();
        int sum[]=new int[N+1];
        for(int i=1;i<=N;i++){
            sum[i]=sum[i-1]+arr[i-1];
        }
        int dp[][]=new int[3+1][N+1];
        for(int i=1;i<=3;i++){
            for(int j=1;j<=N;j++){
                if(j>=capacity)
                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j-capacity]+(sum[j]-sum[j-capacity]));
            }
        }
        System.out.println(dp[3][N]);
    }

}
