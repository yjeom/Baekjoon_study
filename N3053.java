import java.util.Scanner;

public class N3053 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        double n= scan.nextInt();
        System.out.println(String.format("%.6f",Math.pow(n,2)*Math.PI));
        System.out.println(String.format("%.6f",Math.pow(n,2)*2));
    }
}
