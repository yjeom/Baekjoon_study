import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class N1655 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> rightQueue=new PriorityQueue<>();
        PriorityQueue<Integer> leftQueue=new PriorityQueue<>(Comparator.reverseOrder());
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int input=Integer.parseInt(br.readLine());
            if(leftQueue.size()==rightQueue.size()){
                leftQueue.add(input);
            }else{
                rightQueue.add(input);
            }
            if(!leftQueue.isEmpty()&&!rightQueue.isEmpty()){
                if(leftQueue.peek()>rightQueue.peek()){
                    int temp=leftQueue.poll();
                    leftQueue.add(rightQueue.poll());
                    rightQueue.add(temp);
                }
            }
            bw.write(leftQueue.peek()+"\n");
        }
        bw.flush();
        bw.close();
    }
}
