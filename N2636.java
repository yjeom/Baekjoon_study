import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N2636 {
    static int map[][];
    static int moveX[]={-1,1,0,0};
    static int moveY[]={0,0,-1,1};
    static boolean visited[][];
    static int X,Y;
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        X=scanner.nextInt();
        Y=scanner.nextInt();
        map=new int[X][Y];

        int total=0;
        for(int i=0;i<X;i++){
            for(int j=0;j<Y;j++){
                map[i][j]= scanner.nextInt();
                if(map[i][j]==1) total++;
            }
        }
        int time=0;
        int minusCount=0;
        while (total !=0){
            visited=new boolean[X][Y];
            time++;
            minusCount=bfs();
            total-=minusCount;
        }
        System.out.println(time);
        System.out.println(minusCount);

    }
    static int bfs(){
        int minusCount=0;
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0,0});

        while (!queue.isEmpty()){
            int [] node=queue.poll();
            visited[node[0]][node[1]]=true;

            for(int i=0;i<4;i++){
                int nextX=node[0]+moveX[i];
                int nextY=node[1]+moveY[i];
                if(nextX>=0&&nextY>=0&&nextX<X&&nextY<Y){
                    if(!visited[nextX][nextY]) {
                        visited[nextX][nextY] = true;
                        if (map[nextX][nextY] == 1) {
                            map[nextX][nextY] = 0;
                            minusCount++;
                        } else {
                            queue.add(new int[]{nextX, nextY});
                        }
                    }
                }
            }
        }
        return minusCount;
    }
}
