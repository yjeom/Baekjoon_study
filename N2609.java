import java.util.Scanner;

public class N2609 {
    static int GCD,LCM;
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        if(a>b){
            calGCD(a,b);
        }else{
            calGCD(b,a);
        }
        LCM=GCD*(a/GCD)*(b/GCD);
        System.out.println(GCD+" "+LCM);

    }
    public static void calGCD(int m,int n){
        if(n==0) {
            GCD=m;
            return;
        }
        calGCD(n,m%n);
    }
}
