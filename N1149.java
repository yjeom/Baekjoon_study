import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1149 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int arr[][]=new int[N+1][3];
        int d[][]=new int [N+1][3];
        for(int i=2;i<d.length;i++){
            d[i][0]=Integer.MAX_VALUE;
            d[i][1]=Integer.MAX_VALUE;
            d[i][2]=Integer.MAX_VALUE;
        }
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            arr[i+1][0]=Integer.parseInt(st.nextToken());
            arr[i+1][1]=Integer.parseInt(st.nextToken());
            arr[i+1][2]=Integer.parseInt(st.nextToken());
        }
        d[1]=arr[1];
        for(int i=2;i<=N;i++) {
            for (int j = 0; j < 3; j++) {
                if(j==0){
                    d[i][j] = Math.min(d[i][j], d[i - 1][1] + arr[i][j]);
                    d[i][j] = Math.min(d[i][j], d[i - 1][2] + arr[i][j]);
                }else if(j==1){
                    d[i][j] = Math.min(d[i][j], d[i - 1][0] + arr[i][j]);
                    d[i][j] = Math.min(d[i][j], d[i - 1][2] + arr[i][j]);
                }else{
                    d[i][j] = Math.min(d[i][j], d[i - 1][0] + arr[i][j]);
                    d[i][j] = Math.min(d[i][j], d[i - 1][1] + arr[i][j]);
                }
            }
        }

        int result=Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            result=Math.min(result,d[N][i]);
        }
        System.out.println(result);
    }

}
