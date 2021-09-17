import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Bead{
    int redX;
    int redY;
    int blueX;
    int blueY;
    int count;

    public Bead(){}
    public Bead(int redX,int redY,int blueX,int blueY,int count){
        this.redX=redX;
        this.redY=redY;
        this.blueX=blueX;
        this.blueY=blueY;
        this.count=count;
    }
}
public class N13460 {
    static int N;
    static int M;
    static char [][]board;
    static int [][][][]visited;
    static int[] positionHole;

    public static boolean redFirst(int i,int rx,int ry,int bx,int by){
        boolean redFirst=false;
        if(i==0){
            if(rx<=bx)redFirst=true;
        }else if(i==1){
            if(rx>=bx)redFirst=true;
        }else if(i==2){
            if(ry>=by)redFirst=true;
        }else{
            if(ry<=by)redFirst=true;
        }
        return redFirst;
    }
    public static int number13460(Bead bead) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        Queue<Bead> queue = new LinkedList<>();
        queue.add(bead);
        int count=0;
        boolean blueHole=false;
        boolean redHole=false;
        while (!queue.isEmpty()) {
            Bead index = queue.poll();
            int rX = index.redX;
            int rY = index.redY;
            int bX = index.blueX;
            int bY = index.blueY;
            count=index.count;
            if(count>10)return -1;
            for (int i = 0; i < 4; i++) {
                int redNextX = rX + dx[i];
                int blueNextX = bX + dx[i];
                int redNextY = rY + dy[i];
                int blueNextY = bY + dy[i];
                boolean blueMove=false;
                boolean redMove=false;
                blueHole=false;
                redHole=false;
                boolean redFirst=redFirst(i,rX,rY,bX,bY);
                if(redNextX<0 || redNextX>=N || redNextY <0 ||redNextY >=M)continue;
//                if(board[redNextX][redNextY]=='#')continue;
                while(board[blueNextX][blueNextY]!='#'){
                    blueMove=true;
                    if(board[blueNextX][blueNextY]=='O')blueHole=true;
                    if(board[blueNextX+dx[i]][blueNextY+dy[i]]=='#')break;
                    blueNextX+=dx[i];
                    blueNextY+=dy[i];
                }
                if(!blueMove){
                    blueNextX=bX;
                    blueNextY=bY;
                }
                while (board[redNextX][redNextY] != '#') {
                    redMove=true;
                    if(board[redNextX][redNextY]=='O')redHole=true;
                    if(board[redNextX+dx[i]][redNextY+dy[i]]=='#')break;
                    redNextX+=dx[i];
                    redNextY+=dy[i];
                }
                if(!redMove){
                    redNextX=rX;
                    redNextY=rY;
                }
                if(redNextX==blueNextX&&redNextY==blueNextY){
                    if(redFirst){
                        blueNextX-=dx[i];
                        blueNextY-=dy[i];
                    }else{
                        redNextX-=dx[i];
                        redNextY-=dy[i];
                    }
                }
                if(blueHole)continue;
                else if(redHole)return count;
                if(visited[redNextX][redNextY][blueNextX][blueNextY]==0){
                    visited[redNextX][redNextY][blueNextX][blueNextY]=1;
                    queue.add(new Bead(redNextX,redNextY,blueNextX,blueNextY,count+1));
                }
            }//for end
        }//while end
        return -1;
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        board=new char[N][M];
        visited=new int[N][M][N][M];
        Bead bead=new Bead();
        for(int i=0;i<N;i++){
            char[] line=br.readLine().toCharArray();
            for(int j=0;j< line.length;j++){
                board[i][j]=line[j];
                if(line[j]=='#'){
                }else if(line[j]=='B'){
                    bead.blueX=i;
                    bead.blueY=j;
                }else if(line[j]=='R'){
                    bead.redX=i;
                    bead.redY=j;
                }else if(line[j]=='O'){
                    positionHole=new int[]{i,j};
                }
            }
        }//for end
        bead.count=1;
        visited[bead.redX][bead.redY][bead.blueX][bead.blueY]=1;
        int result=number13460(bead);
        if(result==-1 || result>10){
            bw.write("-1\n");
        }
        else{
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
    }
}
