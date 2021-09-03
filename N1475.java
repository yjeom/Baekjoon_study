import java.io.*;
import java.util.StringTokenizer;

public class N1475 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int []numbers=new int[9];
        char []inputs=br.readLine().toCharArray();
        for(int i=0;i<inputs.length;i++){
            int num=Integer.parseInt(String.valueOf(inputs[i]));
            if(num==9){
                numbers[6]++;
            }else{
                numbers[num]++;
            }
        }//end for
        int max=0;
        for(int i=0;i<numbers.length;i++){
            if(i==6){
                int num=numbers[i]%2==1?(numbers[i]/2)+1 : (numbers[i]/2);
                if( max < num) {
                    max = num;
                }
            }else if(max<numbers[i]){
                max=numbers[i];
            }
        }
        bw.write(max+"\n");
        bw.flush();
        bw.close();
    }
}
