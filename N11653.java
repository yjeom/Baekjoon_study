import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11653 {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        boolean flag=true;
        while(flag&&N>2){
            for(int i=2;i<N;i++){
                if(N%i==0){
                    System.out.println(i);
                    N=N/i;
                    break;
                }else if(i+1==N){
                        flag=false;
                        break;
                }
            }
        }
        if(N!=1){
            System.out.println(N);
        }

    }
}
