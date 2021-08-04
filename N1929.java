import java.io.IOException;
import java.util.Scanner;

public class N1929 {
    public static void main(String[]args) throws IOException {
        Scanner scan=new Scanner(System.in);
        int M=scan.nextInt();
        int N=scan.nextInt();
        int []num=new int[N+1];
        for(int i=2;i<=N;i++){
            num[i]=i;
        }
        for(int i=2;i<=N;i++){
            if(num[i]!=0){
                for(int j=i+i;j<=N;j+=i){
                    num[j]=0;
                }
            }
        }
        for(int i=2;i<=N;i++){
            if((num[i]!=0)&&(num[i]>=M)){
                System.out.print(num[i]+"\n");
            }
        }

    }
}
