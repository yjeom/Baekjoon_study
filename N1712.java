import java.util.Scanner;
import java.util.StringTokenizer;

public class N1712 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        StringTokenizer inputTokens=new StringTokenizer(input," ");
        int A=Integer.parseInt(inputTokens.nextToken());
        int B=Integer.parseInt(inputTokens.nextToken());
        int C=Integer.parseInt(inputTokens.nextToken());

        if(B>=C){
            System.out.println(-1);
        }else{
            int num=(A/(C-B))+1;
            System.out.println(num);
        }
    }
}