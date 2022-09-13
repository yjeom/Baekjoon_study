import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2004 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());
        int result2=func2(N)-func2(M)-func2(N-M);
        int result5=func5(N)-func5(M)-func5(N-M);
        System.out.println(Math.min(result2,result5));
    }
    static int func2(int n){
        int count=0;
        while(n>=2)
        {
            count+=n/2;
            n=n/2;
        }
        return count;
    }
    static int func5(int n){
        int count=0;
        while(n>=5)
        {
            count+=n/5;
            n=n/5;
        }
        return count;
    }
}
