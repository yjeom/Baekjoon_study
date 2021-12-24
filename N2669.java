import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2669 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean map[][]=new boolean[101][101];
        StringTokenizer st;
        for(int i=0;i<4;i++){
            st=new StringTokenizer(br.readLine());
            int x_start=Integer.parseInt(st.nextToken());
            int y_start=Integer.parseInt(st.nextToken());
            int x_end=Integer.parseInt(st.nextToken());
            int y_end=Integer.parseInt(st.nextToken());
            for(int x=x_start;x<x_end;x++){
                for(int y=y_start;y<y_end;y++){
                    if(!map[x][y]) map[x][y]=true;
                }
            }
        }
        int result=0;
        for(int i=0;i<=100;i++){
            for(int j=0;j<=100;j++){
                if(map[i][j]) result++;
            }
        }
        System.out.println(result);
    }
}
