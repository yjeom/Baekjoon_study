import java.util.Scanner;

public class N2449 {
    static int input[];
    static int dp[][];
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int K=scanner.nextInt();
        input=new int[N];
        dp=new int[N][N];
        for(int i=0;i<N;i++){
            input[i]=scanner.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        System.out.println(div(0,N-1));
    }
    static int div(int left,int right){
        if(left==right)return 0;
        if(dp[left][right] != Integer.MAX_VALUE) return dp[left][right];
        for(int i=left;i<right;i++){
            int l=div(left,i);
            int r=div(i+1,right);
            if(input[left] == input[i+1]){
                dp[left][right]=Math.min(dp[left][right],l+r);
            }else{
                dp[left][right]=Math.min(dp[left][right],l+r+1);
            }
        }
        return dp[left][right];
    }
}
