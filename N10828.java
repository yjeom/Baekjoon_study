import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class N10828 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack=new Stack<>();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String type= st.nextToken();
            if(type.equals("push")){
                int num=Integer.parseInt(st.nextToken());
                stack.push(num);
            }else if(type.equals("pop")){
                if(stack.empty()){
                    bw.write(-1+"\n");
                }else{
                    bw.write(stack.pop()+"\n");
                }

            }else if(type.equals("size")){
                bw.write(stack.size()+"\n");
            }else if(type.equals("empty")){
                if(stack.empty()){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
            }else if(type.equals("top")){
                if(stack.empty()){
                    bw.write(-1+"\n");
                }else{
                    bw.write(stack.peek()+"\n");
                }
            }else{

            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
