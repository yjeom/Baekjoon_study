import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class N2606 {
    static LinkedList<LinkedList<Integer>> list;
    static boolean[] visited;
    public static int virus(int number,int count){
        LinkedList<Integer>factor=list.get(number);
        if(factor.size()<=0) {
            return count;
        }
        else{
            for (int i=0;i< factor.size();i++){
                if(!visited[factor.get(i)]&& factor.get(i)!=1) {
                    count++;
                    visited[factor.get(i)] = true;
                    count = virus(factor.get(i), count);
                }
            }
            return count;
        }
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int computerCount=Integer.parseInt(br.readLine());
        visited=new boolean[computerCount+1];
        int n=Integer.parseInt(br.readLine());
        list=new LinkedList<>();
        for(int i=0;i<=computerCount;i++){
            list.add(new LinkedList<>());
        }
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            LinkedList<Integer> factor=list.get(x);
            LinkedList<Integer> factor2=list.get(y);
            factor.add(y);
            factor2.add(x);
            list.set(x,factor);
            list.set(y,factor2);
        }
        int count=virus(1,0);
        bw.write(count+"\n");
        bw.flush();
        bw.close();


    }
}
