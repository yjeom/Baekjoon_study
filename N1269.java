import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class N1269 {
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> A=new HashSet<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int numA= Integer.parseInt(st.nextToken());
        int numB= Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<numA;i++){
            A.add(Integer.parseInt(st.nextToken()));
        }
        int diffCount=0;
        int eqCount=0;
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<numB;i++){
          int value=Integer.parseInt(st.nextToken());
          if(!A.contains(value)) diffCount++;
          else eqCount++;
        }
        System.out.println(diffCount+(A.size()-eqCount));

    }
}
