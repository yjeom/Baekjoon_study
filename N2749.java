import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2749 {
    static final int pisano=1500000;
    static final int R=1000000;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long N= Long.parseLong(br.readLine());
        long fibonacci[]=new long[pisano];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for(int i=2;i<pisano;i++){
            fibonacci[i]=(fibonacci[i-1]+fibonacci[i-2])%R;
        }
        System.out.println(fibonacci[(int)(N%pisano)]);

    }

}
