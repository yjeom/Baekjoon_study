import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10250 {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        String [] inputs=new String[T];
        for(int i=0;i<T;i++){
            inputs[i]=br.readLine();
        }
        for(int i=0;i<T;i++){
            StringTokenizer st=new StringTokenizer(inputs[i]," ");
            int H=Integer.parseInt(st.nextToken());
            int W=Integer.parseInt(st.nextToken());
            int N=Integer.parseInt(st.nextToken());
            int Y=N%H;
            int X=(N/H)+1;
            if(Y==0){
                Y=H;
                X=N/H;
            }
            System.out.println(String.format("%d%02d",Y,X));
        }
    }
}
