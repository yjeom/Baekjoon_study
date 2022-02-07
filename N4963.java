import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Posisiotn{
    int x,y;

    public Posisiotn(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class N4963 {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static int LAND=1;
    public static int SEA=0;
    public static int w;
    public static int h;
    public static int map[][];
    public static boolean isVisited[][];

    public static void inputMapInfo() throws IOException{
        map=new int[h][w];
        isVisited=new boolean[h][w];

        for(int i=0;i< h;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<w;j++){
                map[i][j]= Integer.parseInt(st.nextToken());
            }
        }
    }
    public static Queue<Posisiotn> aroundCheck(Queue<Posisiotn> queue,int oriX,int oriY){
        if(oriX+1<h){
            if(!isVisited[oriX+1][oriY] && map[oriX+1][oriY]==LAND){
                isVisited[oriX+1][oriY]=true;
                queue.add(new Posisiotn(oriX+1,oriY) );
            }
        }
        if(oriX-1>=0){
            if(!isVisited[oriX-1][oriY] && map[oriX-1][oriY]==LAND){
                isVisited[oriX-1][oriY]=true;
                queue.add(new Posisiotn(oriX-1,oriY) );
            }
        }
        if(oriY+1<w){
            if(!isVisited[oriX][oriY+1] && map[oriX][oriY+1]==LAND) {
                isVisited[oriX][oriY+1] = true;
                queue.add(new Posisiotn(oriX, oriY + 1));
            }
        }
        if(oriY-1>=0){
            if(!isVisited[oriX][oriY-1] && map[oriX][oriY-1]==LAND) {
                isVisited[oriX][oriY - 1] = true;
                queue.add(new Posisiotn(oriX, oriY - 1));
            }
        }
        if(oriX+1<h && oriY+1<w){
            if(!isVisited[oriX+1][oriY+1] && map[oriX+1][oriY+1]==LAND) {
                isVisited[oriX + 1][oriY + 1] = true;
                queue.add(new Posisiotn(oriX + 1, oriY + 1));
            }
        }
        if(oriX-1>=0 && oriY-1>=0 ){
            if(!isVisited[oriX-1][oriY-1]&& map[oriX-1][oriY-1]==LAND) {
                isVisited[oriX - 1][oriY - 1] = true;
                queue.add(new Posisiotn(oriX - 1, oriY - 1));
            }
        }
        if(oriX-1>=0 && oriY+1<w){
            if(!isVisited[oriX-1][oriY+1] && map[oriX-1][oriY+1]==LAND) {
                isVisited[oriX - 1][oriY + 1] = true;
                queue.add(new Posisiotn(oriX - 1, oriY + 1));
            }
        }
        if(oriX+1<h && oriY-1>=0){
            if(!isVisited[oriX+1][oriY-1]&& map[oriX+1][oriY-1]==LAND) {
                isVisited[oriX + 1][oriY - 1] = true;
                queue.add(new Posisiotn(oriX + 1, oriY - 1));
            }
        }
        return queue;
    }
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            st=new StringTokenizer(br.readLine());
            w= Integer.parseInt(st.nextToken());
            h= Integer.parseInt(st.nextToken());
            if(w==0 && h==0) break;
            inputMapInfo();
            int count=0;
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(map[i][j]==LAND && !isVisited[i][j]){
                        count++;
                        Queue<Posisiotn> queue=new ArrayDeque<>();
                        queue.add(new Posisiotn(i,j) );
                        while (!queue.isEmpty()){
                            Posisiotn p= queue.poll();
                            int oriX=p.x;
                            int oriY=p.y;
                            isVisited[oriX][oriY]=true;
                            queue=aroundCheck(queue,oriX,oriY);
                        }
                    }
                }
            }
            System.out.println(count);
        }

    }
}
