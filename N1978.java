import java.util.Scanner;
import java.util.StringTokenizer;

public class N1978 {
    public static void main(String[]args)  {
        Scanner scan=new Scanner(System.in);
        int N=Integer.parseInt(scan.nextLine());
        int count=0;
        for(int i=0;i<N;i++){
            int input=scan.nextInt();
            boolean flag=false;
            if(input==1){
                flag=true;
            }
            for(int j=2;j<input;j++){
                if(input%j==0){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                count++;
            }
        }
        System.out.println(count);
    }
}
