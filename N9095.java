import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9095 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int input[]=new int[T];
        int d[]=new int [12];
        for(int i=0;i<T;i++){
            input[i]=Integer.parseInt(br.readLine());
        }
        d[1]=1;
        d[2]=2;
        d[3]=4;
        for(int i=4;i<d.length;i++){
            d[i]=d[i-1]+d[i-2]+d[i-3];
        }
        for(int i=0;i<input.length;i++){
            System.out.println(d[input[i]]);
        }
    }
}
