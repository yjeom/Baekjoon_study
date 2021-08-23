import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N18870 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int []arr=new int[N];
        int []arr_copy=new int[N];
        HashMap<Integer,Integer> map=new HashMap<>();
        int index=0;
       while (st.hasMoreTokens()){
           arr[index]=Integer.parseInt(st.nextToken());
           arr_copy[index]=arr[index];
           index++;
       }
        Arrays.sort(arr_copy);
       index=0;
        for(int i=0;i<N;i++){
            if(i!=0){
                if(arr_copy[i]!=arr_copy[i-1]){
                    if(!map.containsKey(arr_copy[i])){
                        map.put(arr_copy[i],index);
                        index++;
                    }
                }
            }else{
                map.put(arr_copy[i],index);
                index++;
            }

        }
        for(int i=0;i<N;i++){
            bw.write(map.get(arr[i])+" ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
