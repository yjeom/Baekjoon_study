import java.io.*;

public class N5585 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int []coins={500,100,50,10,5,1};
        int price=Integer.parseInt(br.readLine());
        price=1000-price;
        int count=0;
        for(int i=0;i<coins.length;i++){
            if(price==0) break;
            else if(price>=coins[i]){
                count+=price/coins[i];
                price-=(price/coins[i])*coins[i];
            }
        }
        bw.write(count+"\n");
        bw.flush();
        bw.close();
    }
}
