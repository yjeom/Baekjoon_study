import java.io.*;
import java.util.StringTokenizer;

public class N1934 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int test=Integer.parseInt(br.readLine());
        while(test-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int LCM=0;
            if (a>b) LCM=getLCM(a,b);
            else LCM=getLCM(b,a);
            bw.write((a*b)/LCM+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static int getLCM(int a,int b){
        if(a%b==0) {
            return b;
        }
        return getLCM(b,a%b);
    }
}
