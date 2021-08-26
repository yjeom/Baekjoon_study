import java.io.*;
import java.util.StringTokenizer;

public class N15649 {
    public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

    public static void findNumber (int N,int M,int index,boolean[] isUse,int[]arr)
    throws IOException{
        if(index==M){
            for(int i=0;i<M;i++){
                bw.write(arr[i]+" ");
            }
            bw.write("\n");
            return;
        }
        for(int i=0;i<N;i++){
            if(!isUse[i]){
                arr[index]=i+1;
                isUse[i]=true;
                findNumber(N,M,index+1,isUse,arr);
                isUse[i]=false;
            }
        }


    }
    public static void main(String[]args) throws IOException{
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int []arr=new int[M];
        boolean [] isUse=new boolean[N];
        int index=0;
        findNumber(N,M,index,isUse,arr);
        bw.flush();
        bw.close();
    }
}
