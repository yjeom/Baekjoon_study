import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class N1966 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int test=Integer.parseInt(br.readLine());
        for(int i=0;i<test;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            Queue<Integer> queue=new ArrayDeque<>();
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=n;j++){
                int value=Integer.parseInt(st.nextToken());
                queue.offer(value);
            }
            int count=1;
            boolean check=false;
            int valueCount=9;
            int dm=m;
            while (!check){
                boolean searchMaxValue=false;
                while (!searchMaxValue){
                    if(queue.contains(valueCount)){
                        searchMaxValue=true;
                    }else{
                        valueCount--;
                    }
                }
               boolean removeMaxValue=false;
                while (!removeMaxValue){
                    int temp=queue.poll();
                    if(temp==valueCount){
                        removeMaxValue=true;
                        if(dm==0){
                            check=true;
                            bw.write(count+"\n");
                        }else{
                            count++;
                        }
                    }else{
                        queue.offer(temp);
                    }
                    if(dm==0){
                        dm=queue.size()-1;
                    }else{
                        dm--;
                    }
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
