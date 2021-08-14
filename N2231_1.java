import java.io.*;

public class N2231_1 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int input=Integer.parseInt(br.readLine());
        int result=0;
        for(int i = 1; i < input;i++){
            int sum=i;
            int num=i;
            while(num!=0){
                sum+=num%10;
                num=num/10;
            }
            if(sum==input){
                result=i;
                break;
            }
        }
        bw.write(result+"\n");
        bw.flush();
        bw.close();
    }
}
