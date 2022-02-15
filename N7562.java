import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class N7562 {
    static int aroundX[]={1,2,2,1,-1,-2,-2,-1};
    static int aroundY[]={-2,-1,1,2,2,1,-1,-2};
    static int mapSize;
    static int map[][];
    static boolean isVisited[][];
    static int startX,startY,endX,endY;

    public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[]args)throws IOException{
        int testCount=Integer.parseInt(br.readLine());
        for(int i=0;i<testCount;i++){
            mapSearch(i);
        }

    }
    public static void mapSearch(int n)throws IOException{
        mapSize=Integer.parseInt(br.readLine());
        map=new int[mapSize][mapSize];
        isVisited=new boolean[mapSize][mapSize];
        StringTokenizer st=new StringTokenizer(br.readLine());
        startX=Integer.parseInt(st.nextToken());
        startY=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        endX=Integer.parseInt(st.nextToken());
        endY=Integer.parseInt(st.nextToken());

        bfs(startX,startY);
        isVisited[startX][startY]=true;

    }
    public static void bfs(int x,int y){
        Queue<Point> queue=new ArrayDeque<>();
        queue.add(new Point(x,y));
        while(!queue.isEmpty()){
            Point p= queue.poll();
            if(p.x==endX && p.y==endY){
                System.out.println(map[p.x][p.y]);
                return;
            }
            for(int i=0;i<8;i++){
                int dx=p.x+aroundX[i];
                int dy=p.y+aroundY[i];
                if(dx<mapSize && dy<mapSize && dx>=0 && dy >=0 && !isVisited[dx][dy]){
                    isVisited[dx][dy]=true;
                    map[dx][dy]=map[p.x][p.y]+1;
                    queue.add(new Point(dx,dy));
                }
            }

        }
    }

}
