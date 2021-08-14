import java.io.*;
import java.util.StringTokenizer;

public class N2798 {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int []card=new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            card[i]=Integer.parseInt(st.nextToken());
        }
        int max=card[0];
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    if((card[i]+card[j]+card[k])>max
                            &&(card[i]+card[j]+card[k])<=M) max=card[i]+card[j]+card[k];
                }
            }
        }
        bw.write(max+"\n");
        bw.flush();
        bw.close();
    }
}
