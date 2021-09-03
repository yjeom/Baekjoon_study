import javax.print.DocFlavor;
import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class N1009 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        String[]inputs=new String[T];
        StringTokenizer st;
        for(int i=0;i<T;i++){
            inputs[i]= br.readLine();
        }
        for(int i=0;i<T;i++){
           st=new StringTokenizer(inputs[i]);
           int a=Integer.parseInt(st.nextToken());
           int b=Integer.parseInt(st.nextToken());
           b=b%4==0?4:b%4;
           int value=(int)Math.pow(a,b);
           if(value==0){
               bw.write(10+"\n");
           }
           else if(value<=10){
               bw.write(value+"\n");
           }else{
               if(value%10==0){
                   bw.write(10+"\n");
               }else{
                   bw.write(value%10+"\n");
               }

           }
        }
        bw.flush();
        bw.close();
    }
}
