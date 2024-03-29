import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class N14425 {
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        HashSet<String> hashSet=new HashSet<>();
        int result=0;
        for(int i=0;i<N;i++){
            hashSet.add(br.readLine());
        }
        for(int i=0;i<M;i++){
            String input= br.readLine();
            if(hashSet.contains(input)) result++;
        }
        System.out.println(result);
        br.close();
    }
}
