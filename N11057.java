import java.util.Scanner;

public class N11057 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int values[][]=new int[n+1][10];
        for(int i=0;i<10;i++){
            values[1][i]=1;
        }
        for(int i=2;i<=n;i++){
            for(int j=9;j>=0;j--){
                if(j==9){
                    values[i][j]=1%10007;
                }else{
                    values[i][j]=(values[i-1][j]+values[i][j+1])%10007;
                }
            }
        }
        int sum=0;
        for(int i=0;i<10;i++){
            sum+=values[n][i];
        }
        System.out.println(sum%10007);
    }
}
