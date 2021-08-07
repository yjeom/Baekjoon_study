import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N4153 {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> inputs=new ArrayList<>();
        StringTokenizer st;
        String input;
        do{
             input=br.readLine();
            if(!(input.contains("0 0 0"))){
                inputs.add(input);
            }
        }while(!(input.contains("0 0 0")));
        for(int i=0;i< inputs.size();i++){
            st=new StringTokenizer(inputs.get(i)," ");
            int []num=new int [3];
            num[0]=Integer.parseInt(st.nextToken());
            num[1]=Integer.parseInt(st.nextToken());
            num[2]=Integer.parseInt(st.nextToken());
            int max=num[0];
            int maxIndex=0;
            for(int j=0;j<num.length;j++){
                if(max<num[j]){
                    max=num[j];
                    maxIndex=j;
                }
            }
            if(maxIndex==0){
                if((num[0]*num[0])==((num[1]*num[1])+(num[2]*num[2]))){
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            }else if(maxIndex==1){
                if((num[1]*num[1])==((num[0]*num[0])+(num[2]*num[2]))){
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            }else{
                if((num[2]*num[2])==((num[0]*num[0])+(num[1]*num[1]))){
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            }
        }
    }
}
