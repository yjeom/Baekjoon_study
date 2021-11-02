import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9251 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input1= br.readLine();
        String input2= br.readLine();
        int d[][]=new int[input1.length()+1][input2.length()+1];
        char [] arr1=input1.toCharArray();
        char [] arr2=input2.toCharArray();
        for(int i=1;i<=input1.length();i++){
            for(int j=1;j<=input2.length();j++){
                if(arr1[i-1]==arr2[j-1]){
                    d[i][j]=d[i-1][j-1]+1;
                }else{
                    d[i][j]=Math.max(d[i-1][j],d[i][j-1]);
                }
            }
        }
        System.out.println(d[input1.length()][input2.length()]);
    }
}
