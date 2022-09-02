import java.io.*;
import java.util.*;

public class N2981 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        int input[]=new int[N];
        for(int i=0;i<N;i++){
            input[i]=Integer.parseInt(br.readLine());
        }
        int GCM=Math.abs(input[0]-input[1]);
        for(int i=2;i<N;i++){
            GCM=getGCM(GCM,Math.abs(input[i]-input[i-1]));
        }
        for(int i=2;i<=GCM;i++){
          if(GCM%i==0) bw.write(i+" ");
        }

        bw.write("\n");
        bw.close();
        bw.close();
        br.close();
    }
    static int getGCM(int a,int b){
        if(a%b==0) {
           return b;
        }else{
          return getGCM(b,a%b);
        }
    }


}
