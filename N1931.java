import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class N1931 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st;
        int [][]values=new int[N][2];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            values[i][0]=Integer.parseInt(st.nextToken());
            values[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(values, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) return o1[0]-o2[0];
                else return o1[1]-o2[1];
            }
        });
//        check arrays sort
        bw.write("-----------------------\n");
        for(int i=0;i<N;i++){
            bw.write(values[i][0]+" "+values[i][1]+"\n");
        }
        bw.write("-----------------------\n");
        int count=0;
        int time=0;
        for(int i=0;i<N;i++){
           if(time<=values[i][0]){
               count++;
               time=values[i][1];
//             check selected time
               bw.write(values[i][0]+" "+values[i][1]+"\n");
           }
        }
        bw.write(count+"\n");
        bw.flush();
        bw.close();
    }
}
