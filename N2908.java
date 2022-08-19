import java.util.Scanner;

public class N2908 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        StringBuilder sb=new StringBuilder(a+"");
        int reversA=Integer.parseInt(sb.reverse().toString());
        sb=new StringBuilder(b+"");
        int reversB=Integer.parseInt(sb.reverse().toString());
        System.out.println(reversA>reversB?reversA:reversB);
    }
}
