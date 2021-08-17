import java.io.*;

public class N10989 {
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        int []arr=new int[N];
        int []counting=new int[10001];
        int []result=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<N;i++){
            counting[arr[i]]++;
        }
        for(int i=1;i<counting.length;i++){
            counting[i]+=counting[i-1];
        }
        for(int i=arr.length-1;i>=0;i--){
            counting[arr[i]]-=1;
            result[counting[arr[i]]]=arr[i];
        }
        for(int i=0;i<result.length;i++){
            bw.write(result[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
