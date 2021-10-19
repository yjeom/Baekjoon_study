import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11053 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(br.readLine());
        int values[]=new int[size+1];
        int d[]=new int[size+1];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=1;i<=size;i++){
            values[i]=Integer.parseInt(st.nextToken());
        }
        d[1]=1;
        for(int i=2;i<=size;i++){
           d[i]=1;
           for(int j=1;j<i;j++){
               if(values[j]<values[i]){
                   d[i]=Math.max(d[i],d[j]+1);
               }
           }
        }
        int max=0;
        for(int i=1;i<=size;i++){
            max=Math.max(max,d[i]);
        }
        System.out.println(max);
    }
}
