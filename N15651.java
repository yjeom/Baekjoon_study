import java.io.*;
import java.util.StringTokenizer;

public class N15651 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    static int[]arr;
    public static void findNumbers(int N,int M,int index) throws IOException{
        if(index==M){
            for(int i=0;i<M;i++){
                bw.write(arr[i]+" ");
            }
            bw.write("\n");
            return;
        }

        for(int i=0;i<N;i++){
            arr[index]=i+1;
            findNumbers(N,M,index+1);
        }
    }
    public static void main(String[]args)throws IOException{
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        arr=new int[M];
        findNumbers(N,M,0);
        bw.flush();
        bw.close();
    }
}
