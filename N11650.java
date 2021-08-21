import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class N11650 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        int [][]arr=new int[N][2];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }else{
                    return o1[0]-o2[0];
                }
            }
        });
//        for(int i=1;i<N;i++){
//            int temp_x=arr[i][0];
//            int temp_y=arr[i][1];
//            int j=i-1;
//            while((j>=0)&&(arr[j][0]>=temp_x)){
//                if(arr[j][0]==temp_x){
//                    if(arr[j][1]>temp_y){
//                        arr[j+1][0]=arr[j][0];
//                        arr[j+1][1]=arr[j][1];
//                    }
//                }else{
//                    arr[j+1][0]=arr[j][0];
//                    arr[j+1][1]=arr[j][1];
//                }
//                j--;
//            }
//            arr[j+1][0]=temp_x;
//            arr[j+1][1]=temp_y;
//        }
        for(int i=0;i<N;i++){
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
