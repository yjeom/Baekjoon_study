import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9020 {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int inputs[]=new int[T];
        String [] result=new String[T];
        for(int i=0;i<inputs.length;i++){
            inputs[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<inputs.length;i++){
            int a=inputs[i]/2;
            int b=inputs[i]-a;
            while(!isPrime(a)||!isPrime(b)){
                a--;
                b++;
            }
            System.out.println(a+" "+b);
        }
    }
}
