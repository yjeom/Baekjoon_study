import java.util.Scanner;

public class N1699 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int dp[]=new int[n+1];

        for(int i=0;i<=n;i++){
            dp[i]=100001;
        }
        for(int i=1;i<=n;i++){
            int target=(int)Math.pow(i,2);
            for( int j=target;j<=n;j++ ){
                if(j%target==0){
                    dp[j]=Math.min(dp[j],j/target);
                }else{
                    dp[j]=Math.min(dp[j],dp[j-target]+1);
                }
            }
        }
        System.out.println(dp[n]);
    }
}
