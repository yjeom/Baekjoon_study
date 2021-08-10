import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10872 {
    public static int fac(int n){
        if(n==1||n==0){
            return 1;
        }else{
            return n*fac(n-1);
        }
    }
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        System.out.println(fac(n));
    }
}
