import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N11399 {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int sum=0;
        int result=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
            result+=sum;
        }
        bw.write(result+"\n");
        bw.flush();
        bw.close();
    }
}
