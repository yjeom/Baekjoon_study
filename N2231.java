import java.io.*;

public class N2231 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int input=Integer.parseInt(br.readLine());
        int result=0;
        int ten=0;
        for(int i = 1; i < input;i++){
            if(i>=Math.pow(10,ten)){
                ten++;
            }
            int sum=i;
            int num=i;
            for(int j=ten-1;j>=0;j--){
                sum+=num/Math.pow(10,j);
                num=(int)(num%Math.pow(10,j));
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
