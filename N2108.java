import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class N2108 {
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        int []inputs=new int[N];
        int []frequent=new int[N];
        int []arr=new int[8001];
        for(int i=0;i<N;i++){
            inputs[i]=Integer.parseInt(br.readLine());
            arr[inputs[i]+4000]++;
        }
        Arrays.sort(inputs);
        double sum=0;
        int middle=0;
        for(int i=0;i<N;i++){
            sum+=inputs[i];
            if(i==N/2){
                middle=inputs[i];
            }
        }
        bw.write(Math.round(sum/N)+"\n");
        bw.write(middle+"\n");
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                frequent[index]=i;
                index++;
            }
        }
        for(int i=1;i<frequent.length;i++){
            if(frequent[i-1]==0) continue;
            int temp=frequent[i];
            int j=i-1;
            while(j>=0&&(arr[frequent[j]]<arr[temp])){
                frequent[j+1]=frequent[j];
                j--;
            }
            frequent[j+1]=temp;

        }
        if(N==1){
            bw.write(frequent[0]-4000+"\n");
        }else{
            if(arr[frequent[0]]==arr[frequent[1]]){
                bw.write(((frequent[0]-4000)>(frequent[1]-4000)?frequent[0]-4000 : frequent[1]-4000)+"\n" );
            }else{
                bw.write(frequent[0]-4000+"\n");
            }
        }
        bw.write(inputs[N-1]-inputs[0]+"\n");
        bw.flush();
        bw.close();
    }
}
