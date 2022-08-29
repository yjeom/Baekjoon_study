import java.io.*;
import java.util.StringTokenizer;

public class N1004 {
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int test=Integer.parseInt(br.readLine());
        while(test-- >0){
            int count=0;
            int start[]=new int[2];
            int dest[]=new int[2];
            StringTokenizer st=new StringTokenizer(br.readLine());
            start[0]=Integer.parseInt(st.nextToken());
            start[1]=Integer.parseInt(st.nextToken());
            dest[0]=Integer.parseInt(st.nextToken());
            dest[1]=Integer.parseInt(st.nextToken());
            int circleNum=Integer.parseInt(br.readLine());
            int circle[][]=new int[circleNum][3];
            for(int i=0;i<circleNum;i++){
                st=new StringTokenizer(br.readLine());
                circle[i][0]=Integer.parseInt(st.nextToken());
                circle[i][1]=Integer.parseInt(st.nextToken());
                circle[i][2]=Integer.parseInt(st.nextToken());
            }
            for(int i=0;i<circleNum;i++){
                int cx=circle[i][0];
                int cy=circle[i][1];
                int r=circle[i][2];
                boolean startCheck=includeCircle(start[0],start[1],cx,cy,r);
                boolean destCheck=includeCircle(dest[0],dest[1],cx,cy,r);
                if((startCheck || destCheck)&& !(startCheck && destCheck)) count++;
            }
            bw.write(count+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static boolean includeCircle(int x,int y,int cx,int cy,int r){
        return Math.sqrt(Math.pow(x-cx,2)+Math.pow(y-cy,2)) <r;
    }
}
