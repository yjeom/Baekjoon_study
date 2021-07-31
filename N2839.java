import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2839 {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=0;
        while(n>0){
            if(n%5==0){
                count+=n/5;
                n=n-(n*5);
            }else if(n>=3){
                n=n-3;
                count++;
            }else{
                count=-1;
                break;
            }

        }
        System.out.println(count);
    }
}
