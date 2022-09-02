import java.io.*;
import java.util.StringTokenizer;

public class N3036 {
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        int arr[]=new int[N];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<N;i++){
            int LCM=getLCM(arr[0],arr[i]);
            bw.write(arr[0]/LCM+"/"+arr[i]/LCM+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static int getLCM(int a,int b){
        if(b==0) return a;
        else return getLCM(b,a%b);
    }
}
