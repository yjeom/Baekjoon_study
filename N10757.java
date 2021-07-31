import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class N10757 {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        char [] inputA= st.nextToken().toCharArray();
        char [] inputB=st.nextToken().toCharArray();
        Stack <Integer> stackA=new Stack<>();
        Stack <Integer> stackB=new Stack<>();
        for(int i=0;i<inputA.length;i++){
            stackA.push(Integer.parseInt(String.valueOf(inputA[i])));
        }
        for(int i=0;i<inputB.length;i++){
            stackB.push(Integer.parseInt(String.valueOf(inputB[i])));
        }
        Stack <Integer>result=new Stack<>();
        int up=0;
        while(stackA.isEmpty()==false||stackB.isEmpty()==false){
            int a=0;
            int b=0;
            if(stackA.isEmpty()==false){
                a=stackA.pop();
            }
            if(stackB.isEmpty()==false){
                b=stackB.pop();
            }
            if((a+b+up)>=10){
                result.push((a+b+up)%10);
                up=1;
            }else{
                result.push((a+b+up)%10);
                up=0;
            }
        }
        if(up==1){
            result.push(up);
        }
        while(result.isEmpty()==false){
            System.out.print(result.pop());
        }
    }
}
