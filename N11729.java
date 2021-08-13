import java.io.*;

public class N11729 {
    public static void hanoi(int start,int to,int temp,int N,BufferedWriter bw) throws IOException {
        if(N==1){
            bw.write(start+" "+to+"\n");
        }else{
            hanoi(start,temp,to,N-1,bw);
            bw.write(start+" "+to+"\n");
            hanoi(temp,to,start,N-1,bw);
        }

    }
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        double N=Double.parseDouble(br.readLine());
        int K=0;
        bw.write((int)Math.pow(2,N)-1+"\n");
        hanoi(1,3,2,(int)N,bw);
        bw.flush();
        bw.close();
    }
}
