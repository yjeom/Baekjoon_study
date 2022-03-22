import java.io.*;
import java.util.*;

public class N10867 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list=new ArrayList<>();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int input=Integer.parseInt(st.nextToken());
            if(!list.contains(input)){
                list.add(input);
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            bw.write(list.get(i)+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
