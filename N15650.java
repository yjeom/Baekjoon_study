import java.io.*;
import java.util.StringTokenizer;

public class N15650 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    static int[]arr;
    static boolean[] isUse;

    public static void findNumber(int N,int M,int index)throws IOException{
        if(index==M){
            for(int i=0;i<M;i++){
                bw.write(arr[i]+" ");
            }
            bw.write("\n");
            return;
        }
        for(int i=0;i<N;i++){
            if(!isUse[i]){
                if(index==0){
                    arr[index]=i+1;
                    isUse[i]=true;
                    findNumber(N,M,index+1);
                    isUse[i]=false;
                }
                else if(arr[index-1]<i+1){
                    arr[index]=i+1;
                    isUse[i]=true;
                    findNumber(N,M,index+1);
                    isUse[i]=false;
                }

            }
        }
    }
    public static void main(String[]args)throws IOException{
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        arr=new int[M];
        isUse=new boolean[N];
        findNumber(N,M,0);
        bw.flush();
        bw.close();
    }
}
