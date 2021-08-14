import java.io.*;
import java.util.StringTokenizer;

public class N7568 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int T=Integer.parseInt(br.readLine());
        int [][]people=new int[T][3];
        StringTokenizer st;
        for(int i=0;i<T;i++){
            st=new StringTokenizer(br.readLine());
            people[i][0]=Integer.parseInt(st.nextToken());
            people[i][1]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<T;i++){
            int rank=1;
            for(int j=0;j<T;j++){
                if(people[i][0]<people[j][0]){
                    if(people[i][1]<people[j][1]){
                        rank++;
                    }else{
                        people[i][2]=people[j][2];
                    }
                }
            }
            people[i][2]=rank;
        }
        for(int i=0;i<T;i++){
            bw.write(people[i][2]+" ");
        }
        bw.flush();
        bw.close();
    }
}
