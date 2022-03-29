import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N6603 {
    static int k;
    static int s[];
    static boolean isVisited[];
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String input= br.readLine();
            if(input.equals("0")) break;
            StringTokenizer st=new StringTokenizer(input);
            k=Integer.parseInt(st.nextToken());
            s=new int[k];
            isVisited=new boolean[k];
            for(int i=0;i<k;i++){
                s[i]=Integer.parseInt(st.nextToken());
            }
            search(0,0);
            System.out.println();
        }
    }
    public static void search(int num,int start){
        if(num==6){
            for(int i=0;i<k;i++){
                if(isVisited[i]) System.out.print(s[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=start;i<k;i++){
            if(!isVisited[i]){
                isVisited[i]=true;
                search(num+1,i+1);
                isVisited[i]=false;
            }
        }
    }
}
