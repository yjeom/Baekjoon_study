import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N10816 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer,Integer> card=new HashMap<>();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int num=Integer.parseInt(st.nextToken());
            if(card.containsKey(num)){
                int oldValue=card.get(num);
                card.replace(num,oldValue+1 );
            }else{
                card.put(num,1);
            }
        }
        int M=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int num=Integer.parseInt(st.nextToken());
            bw.write((card.get(num)==null?0: card.get(num))+" ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
