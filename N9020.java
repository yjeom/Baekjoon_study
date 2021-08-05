import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9020 {
    public static int findMaxPrime(int n){
        int max=2;
        for(int i=n;i>=2;i--){
            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                if(i>max){
                    max=i;
                    break;
                }
            }
        }
        return max;
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
            int j=0;
            int a=findMaxPrime((inputs[i]/2)-j);
            int b=findMaxPrime(inputs[i]-((inputs[i]/2)-j));
            while(a+b!=inputs[i]){
                j++;
                a=findMaxPrime((inputs[i]/2)-j);
                b=findMaxPrime(inputs[i]-((inputs[i]/2)-j));

            }
            System.out.println(a+" "+b);
        }
    }
}
