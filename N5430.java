import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class N5430 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result=new StringBuilder();
        int test=Integer.parseInt(br.readLine());
        for(int t=0;t<test;t++){
            StringBuilder sb=new StringBuilder();
            char func[]=br.readLine().toCharArray();
            int arrLength=Integer.parseInt(br.readLine());
            String inputs= br.readLine();
            inputs=inputs.replace("[","");
            inputs=inputs.replace("]","");
            StringTokenizer st=new StringTokenizer(inputs,",");
            Deque<Integer> deque=new ArrayDeque<>();
            for(int i=0;i<arrLength;i++){
                int num=Integer.parseInt(st.nextToken());
                deque.add(num);
            }
            boolean frontPointer=true;
            boolean isError=false;
            for(int i=0;i< func.length;i++){
                if(func[i]=='R'){
                    if(frontPointer){
                        frontPointer=false;
                    }else{
                        frontPointer=true;
                    }
                }else{
                    if(deque.isEmpty()){
                        isError=true;
                        break;
                    }else{
                        if(frontPointer){
                            deque.pollFirst();
                        }else{
                            deque.pollLast();
                        }
                    }
                }
            }
            if(isError){
               sb.append("error");
            }else{
                if(frontPointer){
                    while(!deque.isEmpty()){
                       sb.append(deque.pollFirst()+",");
                    }
                }else{
                    while(!deque.isEmpty()){
                        sb.append(deque.pollLast()+",");
                    }
                }

            }
            if(!isError&&sb.length()!=0){
                sb.delete(sb.length()-1,sb.length());
            }
            if(isError){
                result.append(sb+"\n");
            }else{
                result.append("["+sb+"]\n");
            }

        }
        System.out.println(result);
        br.close();
    }
}
