import java.util.Scanner;

public class N10844 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        long d[][]=new long[n+1][10];
        for(int i=1;i<=9;i++){
            d[1][i]=1;
        }
        if(n>1){
            for(int i=2;i<=n;i++){
                for(int j=0;j<=9;j++){
                    if(j==0) d[i][j]=d[i-1][1]%1000000000;
                    else if(j==9) d[i][j]=d[i-1][j-1]%1000000000;
                    else d[i][j]=(d[i-1][j-1]+d[i-1][j+1])%1000000000;
                }
            }
        }
        long sum=0;
        for(int i=0;i<=9;i++){
            sum+=d[n][i];
        }
        System.out.println(sum%1000000000);
    }
}
