import java.io.*;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;

public class N1406 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> left=new Stack<>();
        Stack<Character> right=new Stack<>();
        char[] inputs=br.readLine().toCharArray();
        for(int i=0;i<inputs.length;i++){
            left.push(inputs[i]);
        }
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String command= st.nextToken();
            if(command.equals("L")){
                if(!left.empty()) right.push(left.pop());
            }else if(command.equals("D")){
                if(!right.empty()) left.push(right.pop());
            }else if(command.equals("B")){
                if(!left.empty()) left.pop();
            }else if(command.equals("P")){
                left.push(st.nextToken().charAt(0));
            }
        }
        Iterator<Character> iter=left.iterator();
        while(iter.hasNext()){
            bw.write(iter.next());
        }
        while(!right.empty()){
            bw.write(right.pop());
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
