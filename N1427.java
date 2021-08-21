import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class N1427 {
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        ArrayList<Integer> arr=new ArrayList<>();
        while(N!=0){
            arr.add(N%10);
            N=N/10;
        }
        for(int i=1;i<arr.size();i++){
            int temp=arr.get(i);
            int j=i-1;
            while((j>=0)&&(arr.get(j)<temp)){
                arr.set(j+1,arr.get(j));
                j--;
            }
            arr.set(j+1,temp);
        }
        for(int i=0;i<arr.size();i++){
            bw.write(arr.get(i)+"");
        }
        bw.flush();
        bw.close();
    }
}
