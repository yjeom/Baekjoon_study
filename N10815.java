import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class N10815 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        HashSet<Integer> set=new HashSet<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        int M=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int t=Integer.parseInt(st.nextToken());
            if(set.contains(t)){
                bw.write(1+" ");
            }else{
                bw.write(0+" ");
            }
        }
        bw.flush();
        bw.close();

    }
}
