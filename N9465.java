import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N9465 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        ArrayList<int[][]> inputs=new ArrayList<>();
        for(int i=0;i<T;i++){
            int n=Integer.parseInt(br.readLine());
            int arr[][]=new int[2][n];
            for(int j=0;j<2;j++){
                StringTokenizer st=new StringTokenizer(br.readLine());
                for(int k=0;k<n;k++){
                    arr[j][k]=Integer.parseInt(st.nextToken());
                }
            }
            inputs.add(arr);
        }
        for(int i=0;i<inputs.size();i++){
            int arr[][]=inputs.get(i);
            int d[][]=arr;
            int max=Math.max(d[0][0],d[1][0]);
            for(int j=1;j<arr[0].length;j++){
              if(j==1){
                  d[0][1]=d[1][0]+arr[0][1];
                  d[1][1]=d[0][0]+arr[1][1];
              }else{
                  d[0][j]=Math.max(arr[0][j]+d[1][j-1],arr[0][j]+d[1][j-2]);
                  d[1][j]=Math.max(arr[1][j]+d[0][j-1],arr[1][j]+d[0][j-2]);
              }
                max=Math.max(d[0][j],d[1][j]);
            }
            System.out.println(max);
        }
    }
}
