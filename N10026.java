import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class N10026 {
    static class Position{
        int x,y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static char map[][];
    public static int n;
    public static boolean isVisited[][];
    public static int aroundX[]={0,0,1,-1};
    public static int aroundY[]={1,-1,0,0};
    public static Queue<Position> queue=new ArrayDeque<>();

    public static boolean isInMap(int x,int y){
        if(x>=n||y>=n||x<0||y<0)
            return false;
        return true;
    }
    public static void divideMap(int x,int y,char type,boolean isColor){
        for(int i=0;i<4;i++){
            int dx=x+aroundX[i];
            int dy=y+aroundY[i];
            if(isInMap(dx,dy)){
                if(isColor&& type=='R'){
                    if((map[dx][dy]==type|| map[dx][dy]=='G') && !isVisited[dx][dy]){
                        isVisited[dx][dy]=true;
                        queue.add(new Position(dx,dy));
                    }
                }else if(isColor&& type=='G') {
                    if((map[dx][dy]==type|| map[dx][dy]=='R') && !isVisited[dx][dy]){
                        isVisited[dx][dy]=true;
                        queue.add(new Position(dx,dy));
                    }
                }else {
                    if(map[dx][dy]==type && !isVisited[dx][dy]){
                        isVisited[dx][dy]=true;
                        queue.add(new Position(dx,dy));
                    }
                }

            }
        }
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        map=new char[n][n];
        for(int i=0;i<n;i++){
            char inputs[]=br.readLine().toCharArray();
            for(int j=0;j<n;j++){
                map[i][j]=inputs[j];
            }
        }
        int result[]=new int[2];
        boolean isColor[]={false,true};

        for(int k=0;k<2;k++){
            isVisited=new boolean[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(!isVisited[i][j]){
                        result[k]++;
                        queue.add(new Position(i,j));
                        while (!queue.isEmpty()){
                            Position p= queue.poll();
                            isVisited[p.x][p.y]=true;
                            divideMap(p.x,p.y,map[p.x][p.y],isColor[k]);
                        }
                    }
                }
            }
        }

        System.out.println(result[0]+" "+result[1]);
    }
}
