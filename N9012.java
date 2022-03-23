import java.io.*;
import java.util.Stack;

public class N9012 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            Stack<Character> stack=new Stack<>();
            char inputs[]=br.readLine().toCharArray();
            boolean noVPS=false;
            for(int j=0;j<inputs.length;j++){
                if(inputs[j]=='('){
                    stack.push(inputs[j]);
                }else{
                    if(stack.isEmpty()){
                        noVPS=true;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            if(noVPS || !(stack.isEmpty())){
                bw.write("NO\n");
            }else{
                bw.write("YES\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
