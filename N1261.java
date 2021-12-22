import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Position implements Comparable<Position>{
    int x,y,count;

    public Position(int x,int y,int count){
        this.x=x;
        this.y=y;
        this.count=count;
    }
    @Override
    public int compareTo(Position o) {
        return this.count-o.count;
    }
}
public class N1261 {
    public static int map[][];
    public static int M;
    public static int N;
    public static int counts[][];
    public static PriorityQueue<Position> queue;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        M=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());
        map=new int[N+1][M+1];
        for(int i=1;i<=N;i++){
           char arr[]=br.readLine().toCharArray();
            for(int j=1;j<=M;j++){
                map[i][j]=arr[j-1]-'0';
            }
        }
        dijkstra();

    }
    public static  void setCounts(int x,int y){
        if(x-1>=1 && counts[x-1][y]>counts[x][y]+map[x-1][y]){
            counts[x-1][y]=counts[x][y]+map[x-1][y];
            queue.add(new Position(x-1,y,counts[x-1][y]));
        }
        if(y-1>=1 && counts[x][y-1]>counts[x][y]+map[x][y-1]){
            counts[x][y-1]=counts[x][y]+map[x][y-1];
            queue.add(new Position(x,y-1,counts[x][y-1]));
        }
        if(x+1<=N && counts[x+1][y]>counts[x][y]+map[x+1][y]){
            counts[x+1][y]=counts[x][y]+map[x+1][y];
            queue.add(new Position(x+1,y,counts[x+1][y]));
        }
        if(y+1<=M && counts[x][y+1]>counts[x][y]+map[x][y+1]){
            counts[x][y+1]=counts[x][y]+map[x][y+1];
            queue.add(new Position(x,y+1,counts[x][y+1]));
        }
    }
    public static void dijkstra(){
        queue=new PriorityQueue<>();
        boolean visited[][]=new boolean[N+1][M+1];
        counts=new int[N+1][M+1];

        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                counts[i][j]=Integer.MAX_VALUE;
            }
        }

        queue.add(new Position(1,1,0));
        counts[1][1]=0;
        while (!queue.isEmpty()){
            Position cur=queue.poll();

            if(!visited[cur.x][cur.y]){
                visited[cur.x][cur.y]=true;
                setCounts(cur.x,cur.y);
            }
        }

        System.out.println(counts[N][M]);
    }
}
