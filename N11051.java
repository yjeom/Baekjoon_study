import java.util.Scanner;

public class N11051 {
    static int dp[][];
    static int num11051(int n,int k){
        if(dp[n][k]>0) return dp[n][k];
        if(k==0||n==k) return dp[n][k]=1;
        return dp[n][k]=(num11051(n-1,k-1)+num11051(n-1,k))%10007;
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int k= scan.nextInt();
        dp=new int [n+1][k+1];
        System.out.println(num11051(n,k));
    }
}
