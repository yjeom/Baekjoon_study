import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class N10814 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        String[][]arr=new String[N][3];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=st.nextToken();
            arr[i][1]=st.nextToken();
            arr[i][2]=String.valueOf(i);
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(Integer.parseInt(o1[0])==Integer.parseInt(o2[0])){
                    return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
                }else{
                    return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
                }
            }
        });
        for(int i=0;i<N;i++){
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }
        bw.flush();
        bw.close();

    }
}
