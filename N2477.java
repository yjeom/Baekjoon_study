import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2477 {
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int EWMax=Integer.MIN_VALUE;
        int SNMax=Integer.MIN_VALUE;
        int arr[][]=new int[7][2];
        int K=Integer.parseInt(br.readLine());
        for(int i=0;i<6;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int direction= Integer.parseInt(st.nextToken());
            int length=Integer.parseInt(st.nextToken());
            if(direction ==1 || direction ==2){
                if(length>EWMax) EWMax=length;
            }else{
                if(length>SNMax) SNMax=length;
            }
            arr[i][0]=direction;
            arr[i][1]=length;
        }
        arr[6][0]=arr[0][0];
        arr[6][1]=arr[0][1];
        int minusArea=0;
        for(int i=0;i<6;i++){
            int a=arr[i][0];
            int b=arr[i+1][0];
            if((a==1&&b==3)||(a==4&&b==1)||(a==2&&b==4)||(a==3&&b==2)){
                minusArea=arr[i][1]*arr[i+1][1];
            }
        }
        int area=(EWMax*SNMax)-minusArea;
        System.out.println(area*K);
    }
}
