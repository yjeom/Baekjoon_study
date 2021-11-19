import java.util.Scanner;

public class N2294 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int k= scan.nextInt();
        int inputs[]=new int[n];
        int dp[]=new int[k+1];
        for(int i=0;i<n;i++){
            inputs[i]= scan.nextInt();
        }
        for(int i=0;i<n;i++) {
            for (int j = inputs[i]; j <= k; j++) {
                if (j == inputs[i]) {
                    dp[j] = 1;
                } else {
                    if (dp[j - inputs[i]] != 0) {
                        if (dp[j] == 0) {
                            dp[j] = dp[inputs[i]] + dp[j - inputs[i]];
                        } else {
                            dp[j] = Math.min(dp[j], dp[inputs[i]] + dp[j - inputs[i]]);
                        }
                    }
                }
            }
        }
        if(dp[k]==0){
            System.out.println(-1);
        }else{
            System.out.println(dp[k]);
        }

    }
}
