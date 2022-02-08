import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class N2468 {
    static class Posisiotn{
        int x,y;

        public Posisiotn(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static int n;
    public static int map[][];
    public static int high=1;
    public static boolean isVisited[][];
    public static Queue<Posisiotn> aroundCheck(Queue<Posisiotn> queue, int oriX, int oriY){
        if(oriX+1<n){
            if(!isVisited[oriX+1][oriY] && map[oriX+1][oriY]>high){
                isVisited[oriX+1][oriY]=true;
                queue.add(new Posisiotn(oriX+1,oriY) );
            }
        }
        if(oriX-1>=0){
            if(!isVisited[oriX-1][oriY] && map[oriX-1][oriY]>high){
                isVisited[oriX-1][oriY]=true;
                queue.add(new Posisiotn(oriX-1,oriY) );
            }
        }
        if(oriY+1<n){
            if(!isVisited[oriX][oriY+1] && map[oriX][oriY+1]>high) {
                isVisited[oriX][oriY+1] = true;
                queue.add(new Posisiotn(oriX, oriY + 1));
            }
        }
        if(oriY-1>=0){
            if(!isVisited[oriX][oriY-1] && map[oriX][oriY-1]>high) {
                isVisited[oriX][oriY - 1] = true;
                queue.add(new Posisiotn(oriX, oriY - 1));
            }
        }
        return queue;
    }

    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n=Integer.parseInt(br.readLine());
        map=new int[n][n];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        int maxCount=1;
        while(high<=100){
            int count=0;
            isVisited=new boolean[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(map[i][j]>high && !isVisited[i][j]){
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
            if(maxCount<count) maxCount=count;
            high++;
        }

        System.out.println(maxCount);
    }
}
