import java.util.ArrayList;
import java.util.Scanner;

public class N17780 {
    static int N,K;
    static int map [][];
    static Horse horse[];
    static ArrayList<Integer> horses[][];
    static int moveX []=new int[]{0,0,0,-1,1};
    static int moveY []=new int[]{0,1,-1,0,0};
    static final int WHITE = 0, RED = 1, BLUE = 2;
    static class Horse{
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getDirection() {
            return direction;
        }

        public void setDirection(int direction) {
            this.direction = direction;
        }

        int x,y,direction;
        Horse(int x,int y,int direction){
            this.x=x;
            this.y=y;
            this.direction=direction;
        }
    }//end Horse class
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        K=scanner.nextInt();
        map=new int[N+1][N+1];
        horse=new Horse[K+1];
        horses=new ArrayList[N+1][N+1];
        boolean check=false;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                map[i][j]=scanner.nextInt();
                horses[i][j]=new ArrayList<>();
            }
        }

        for(int i=1;i<=K;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int direction=scanner.nextInt();
            Horse h=new Horse(x,y,direction);
            horse[i]=h;
            horses[x][y].add(i);
        }
        int count;
        for(count=1;count<=1000;count++){
            for(int k=1;k<=K;k++){
                Horse h=horse[k];
                int oriX=h.getX();
                int oriY=h.getY();
                if(horses[oriX][oriY].get(0)!=k) continue;
                int nextX=oriX+moveX[h.getDirection()];
                int nextY=oriY+moveY[h.getDirection()];
                if(nextX>N || nextX <1 || nextY >N || nextY <1
                        ||map[nextX][nextY]==BLUE){
                    h.setDirection(reverseDirection(h.getDirection()));
                    nextX=oriX+moveX[h.getDirection()];
                    nextY=oriY+moveY[h.getDirection()];
                }if(nextX>N || nextX <1 || nextY >N || nextY <1
                        ||map[nextX][nextY]==BLUE){
                    continue;
                }
                else if(map[nextX][nextY]==RED){
                    for(int i=horses[oriX][oriY].size()-1;i>=0;i--){
                        int num=horses[oriX][oriY].get(i);
                        horses[nextX][nextY].add(num);
                        horse[num].setX(nextX);
                        horse[num].setY(nextY);
                    }
                    horses[oriX][oriY].clear();
                }else if(map[nextX][nextY]==WHITE){
                    for(int i=0;i<horses[oriX][oriY].size();i++){
                        int num=horses[oriX][oriY].get(i);
                        horses[nextX][nextY].add(num);
                        horse[num].setX(nextX);
                        horse[num].setY(nextY);
                    }
                    horses[oriX][oriY].clear();
                }
                if(horses[nextX][nextY].size()>=4){
                    check=true;
                }
            }
            if(check) break;
        }
        if(check){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
    }

    public static int reverseDirection(int d){
        int nextD=d;
        if(d==2 || d==4){
            nextD=d-1;
        }else{
            nextD=d+1;
        }
        return nextD;
    }
}
