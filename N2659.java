import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N2659 {
    public static ArrayList<Integer> list=new ArrayList<>();
    public static void n2659(){
        for(int i=1111;i<=9999;i++){
            String str=String.valueOf(i);
            if(!str.contains("0")){
                String input[]=str.split("");
                String numbers[]=new String[4];
                numbers[0]=input[0]+input[1]+input[2]+input[3];
                numbers[1]=input[1]+input[2]+input[3]+input[0];
                numbers[2]=input[2]+input[3]+input[0]+input[1];
                numbers[3]=input[3]+input[0]+input[1]+input[2];

                int min=Integer.parseInt(numbers[0]);
                for(int n=1;n<4;n++){
                    min=Math.min(min,Integer.parseInt(numbers[n]));
                }
                if(!list.contains(min)){
                    list.add(min);
                }


            }
        }
    }
    public static void main(String[]args)throws IOException{
        n2659();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        String input[]=new String[4];
        for(int i=0;i<4;i++){
            input[i]=st.nextToken();
        }
        String numbers[]=new String[4];
        numbers[0]=input[0]+input[1]+input[2]+input[3];
        numbers[1]=input[1]+input[2]+input[3]+input[0];
        numbers[2]=input[2]+input[3]+input[0]+input[1];
        numbers[3]=input[3]+input[0]+input[1]+input[2];

        int min=Integer.parseInt(numbers[0]);

        for(int i=1;i<4;i++){
            min=Math.min(min,Integer.parseInt(numbers[i]));
        }
        int count=0;
        for(int i:list){
            if(i==min) {
                count++;
                break;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
