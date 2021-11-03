import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2293 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int values[]=new int[n];
        int d[]=new int[k+1];
        for(int i=0;i<n;i++){
            values[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=k;j++){
                if(values[i]==j){
                    d[j]+=1;
                }else if(values[i]<j){
                    d[j]+=d[j-values[i]];
                }
            }
        }
        System.out.println(d[k]);
    }
}
