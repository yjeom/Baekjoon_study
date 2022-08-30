import java.io.*;
import java.util.StringTokenizer;

public class N1358 {
    static int W,H,X,Y;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        W=Integer.parseInt(st.nextToken());
        H=Integer.parseInt(st.nextToken());
        X=Integer.parseInt(st.nextToken());
        Y=Integer.parseInt(st.nextToken());
        int P=Integer.parseInt(st.nextToken());
        int count=0;
        for(int i=0;i<P;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            if(includeRectangle(x,y))count++;
            else if(includeCircle(x,y))count++;
        }
        bw.write(count+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
    static boolean includeRectangle(int x,int y){
        return (X<=x && x<= (X+W))&&(Y<=y &&y<=(Y+H));
    }
    static boolean includeCircle(int x,int y){
        if(Math.sqrt(Math.pow(x-X,2)+Math.pow(y-(Y+(H/2)),2)) <=(H/2)){
            return true;
        }else if(Math.sqrt(Math.pow(x-(X+W),2)+Math.pow(y-(Y+(H/2)),2)) <=(H/2)){
            return true;
        }
        return false;
    }
}
