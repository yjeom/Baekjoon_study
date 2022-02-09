import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class N7569 {
  static class Position{
        int x,y,z;

       public Position(int x, int y, int z) {
           this.x = x;
           this.y = y;
           this.z = z;
       }
   }
   public static int map[][][];
   public static int m,n,h;
   public static Queue<Position> aroundCheck(Queue<Position> queue,int x,int y,int z){
       if(x+1<m){
           if(map[x+1][y][z]==0){
               map[x+1][y][z]=map[x][y][z]+1;
               System.out.println((x+1)+","+y+","+z+" : "+ map[x+1][y][z]);
               queue.add(new Position(x+1,y,z));
           }
       }
       if(y+1<n){
           if( map[x][y+1][z]==0){
               map[x][y+1][z]=map[x][y][z]+1;
               System.out.println(x+","+(y+1)+","+z+" : "+ map[x][y+1][z]);
               queue.add(new Position(x,y+1,z));
           }
       }
       if(z+1<h){
           if(map[x][y][z+1]==0){
               map[x][y][z+1]=map[x][y][z]+1;
               System.out.println(x+","+y+","+(z+1)+" : "+ map[x][y][z+1]);
               queue.add(new Position(x,y,z+1));
           }
       }
       if(x-1>=0){
           if(map[x-1][y][z]==0){
               map[x-1][y][z]=map[x][y][z]+1;
               System.out.println((x-1)+","+y+","+z+" : "+ map[x-1][y][z]);
               queue.add(new Position(x-1,y,z));
           }
       }
       if(y-1>=0){
           if(map[x][y-1][z]==0){
               map[x][y-1][z]=map[x][y][z]+1;
               System.out.println(x+","+(y-1)+","+z+" : "+ map[x][y-1][z]);
               queue.add(new Position(x,y-1,z));
           }
       }
       if(z-1>=0){
           if(map[x][y][z-1]==0){
               map[x][y][z-1]=map[x][y][z]+1;
               System.out.println(x+","+y+","+(z-1)+" : "+ map[x][y][z-1]);
               queue.add(new Position(x,y,z-1));
           }
       }
       return queue;
   }
   public static void main(String[]args)throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st=new StringTokenizer(br.readLine());
       m=Integer.parseInt(st.nextToken());
       n=Integer.parseInt(st.nextToken());
       h=Integer.parseInt(st.nextToken());

       map=new int[m][n][h];
       Queue<Position> queue=new ArrayDeque<>();
       for(int i=0;i<h;i++){
           for(int j=0;j<n;j++){
               st=new StringTokenizer(br.readLine());
               for(int k=0;k<m;k++){
                   map[k][j][i]=Integer.parseInt(st.nextToken());
                   if(map[k][j][i]==1) queue.add(new Position(k,j,i));
                  
               }
           }
       }

       while (!queue.isEmpty()){
           Position p= queue.poll();
           queue=aroundCheck(queue, p.x, p.y, p.z);
       }
       int days=1;
       boolean noFlag=false;
       for(int i=0;i<h;i++){
           if(noFlag)break;
           for(int j=0;j<n;j++){
               if(noFlag)break;
               for(int k=0;k<m;k++){
                   if(map[k][j][i]==0){
                       noFlag=true;
                       break;
                   }
                   if(map[k][j][i]!=-1){
                       days=Math.max(days,map[k][j][i]);
                   }
               }
           }
       }
       if (noFlag) {
           System.out.println(-1);
       }else{
           System.out.println(days-1);
       }

   }
}
