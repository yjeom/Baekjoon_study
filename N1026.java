import java.io.*;
import java.util.*;

public class N1026 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a.add(Integer.parseInt(st.nextToken()));
        }
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            b.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(a);
        Collections.sort(b);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a.get(i)*b.get(n-1-i);
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
