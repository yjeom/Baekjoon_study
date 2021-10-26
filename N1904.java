import java.util.Scanner;

public class N1904 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        long d[]=new long[n+1];
        d[1]=1;
        if(n>1){
            d[2]=2;
            for(int i=3;i<=n;i++){
                d[i]=(d[i-1]+d[i-2])%15746;
            }
        }
        System.out.println(d[n]);
    }
}
