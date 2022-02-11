import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1987 {
    public static int R,C;
    public static char map[][];
    public static int aroundX[]={1,-1,0,0};
    public static int aroundY[]={0,0,1,-1};
    public static boolean isVisited[]=new boolean[26];
    public static int max=1;
    public static boolean isInBound(int x,int y){
        if(x>=R || y>=C || x<0 || y<0) return false;
        return true;
    }
    public static void search(int x,int y,int count){
        for(int i=0;i<4;i++){
            int dx=x+aroundX[i];
            int dy=y+aroundY[i];
            if(isInBound(dx,dy)){
                int alpha=map[dx][dy]-65;
                if(!isVisited[alpha]){
                    isVisited[alpha]=true;
                    max=Math.max(max,count+1);
                    search(dx,dy,count+1);
                    isVisited[alpha]=false;
                }
            }
        }
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        R=Integer.parseInt(st.nextToken());
        C=Integer.parseInt(st.nextToken());
        map=new char[R][C];

        for(int i=0;i<R;i++){
            char arr[]=br.readLine().toCharArray();
            for(int j=0;j<C;j++){
                map[i][j]=arr[j];
            }
        }
        isVisited[map[0][0]-65]=true;
        search(0,0,1);
        System.out.println(max);
    }

}
