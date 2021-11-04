import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N12865 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int arr[][]=new int[n+1][2];
        int d[][]=new int[n+1][k+1];
        for(int i=1;i<=n;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(arr[i][0]>j){
                    d[i][j]=d[i-1][j];
                }else{
                    d[i][j]=Math.max(d[i-1][j],d[i-1][j-arr[i][0]]+arr[i][1]);
                }
            }
        }
        System.out.println(d[n][k]);
    }
}
