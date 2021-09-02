import java.io.*;
import java.util.StringTokenizer;

public class N1541 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine(),"-");
        int sum=Integer.MAX_VALUE;
        while(st.hasMoreTokens()){
            StringTokenizer st2=new StringTokenizer(st.nextToken(),"+");
            int temp=0;
            while (st2.hasMoreTokens()){
                temp+=Integer.parseInt(st2.nextToken());
            }
            if(sum==Integer.MAX_VALUE){
                sum=temp;
            }else{
                sum-=temp;
            }

        }
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
    }
}
