import java.io.*;

public class N2750 {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        int []arr=new int [N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<N;i++){
            bw.write(arr[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
