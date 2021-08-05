import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N3009 {
    public static int getXY(int[][]inputs,int n){
        int xy=0;
        if(inputs[0][n]==inputs[1][n]){
            xy=inputs[2][n];
        }else if(inputs[0][n]==inputs[2][n]){
            xy=inputs[1][n];
        }else if(inputs[1][n]==inputs[2][n]){
            xy=inputs[0][n];
        }
        return xy;
    }
    public static void main(String[]args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=0;
        int y=0;
        int inputs[][]=new int[3][2];
        for(int i=0;i<3;i++){
            String[]inputStr=br.readLine().split("\\s");
            inputs[i][0]=Integer.parseInt(inputStr[0]);
            inputs[i][1]=Integer.parseInt(inputStr[1]);
        }
        x=getXY(inputs,0);
        y=getXY(inputs,1);
        System.out.println(x+" "+y);
    }
}
