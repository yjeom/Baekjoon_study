import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class N1011 {
    public static void main(String[]args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Vector<Integer> result=new Vector<>();

        for(int i=0;i<T;i++){
            String input=br.readLine();
            StringTokenizer st=new StringTokenizer(input," ");
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            int length=y-x;
            int max=(int)Math.sqrt(length);
            if(max!=Math.sqrt(length)){
                if(length>((max*max)+max)){
                    result.add((2*max)+1);
                }else{
                    result.add((2*max));
                }
            }else{
                result.add((2*max)-1);
            }
        }
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }

    }
}
