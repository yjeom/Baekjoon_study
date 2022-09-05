import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class N9375 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int test=Integer.parseInt(br.readLine());
        while(test-->0){
            HashMap<String,Integer> map=new HashMap<>();
            int n=Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++){
                StringTokenizer st=new StringTokenizer(br.readLine());
                st.nextToken();
                String type= st.nextToken();
                if(map.containsKey(type)){
                    map.replace(type,map.get(type),map.get(type)+1);
                }else{
                   map.put(type,1);
                }
            }
            Iterator<String> iter=map.keySet().iterator();
            int count=1;
            while (iter.hasNext()){
                count=count*(map.get(iter.next())+1);
            }
            bw.write(count-1+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
