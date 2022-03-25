import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class N1158 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        Queue<Integer>queue=new ArrayDeque<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        boolean isvisited[]=new boolean[N+1];
        for(int i=1;i<=N;i++){
            queue.add(i);
        }
        sb.append("<");
        int num=0;
        while(num<N){
            int index=1;
          while(index<=K){
              int temp=queue.remove();
              if(!isvisited[temp]){
                  if(index==K){
                      sb.append(temp+", ");
                      num++;
                      isvisited[temp]=true;
                  }
                  index++;
              }
              queue.add(temp);
          }
        }
        sb.delete(sb.length()-2,sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}
