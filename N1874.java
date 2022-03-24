import java.io.*;
import java.util.Stack;

public class N1874 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        char result[]=new char[n*2];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack=new Stack<>();
        int num=1;
        int arrIndex=0;
        int resultIndex=0;
        boolean check=true;

        stack.push(num);
        result[resultIndex]='+';
        resultIndex++;
        num++;
        while (check && arrIndex<n){
            if(!stack.isEmpty()){
                if(stack.peek()==arr[arrIndex]){
                    stack.pop();
                    result[resultIndex]='-';
                    resultIndex++;
                    arrIndex++;
                }else if(stack.peek()<arr[arrIndex]){
                    stack.push(num);
                    num++;
                    result[resultIndex]='+';
                    resultIndex++;
                }else{
                    check=false;
                }
            }else{
                if(num<=n){
                    stack.push(num);
                    num++;
                    result[resultIndex]='+';
                    resultIndex++;
                }else{
                    check=false;
                }
            }
        }
        if(check){
            for(int i=0;i<result.length;i++){
                bw.write(result[i]+"\n");
            }
        }else{
            bw.write("NO\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
