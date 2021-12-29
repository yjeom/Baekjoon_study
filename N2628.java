import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class N2628 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int w=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        ArrayList<Integer> xList=new ArrayList<>();
        ArrayList<Integer> yList=new ArrayList<>();
        int k=Integer.parseInt(br.readLine());
        for(int i=0;i<k;i++){
            st=new StringTokenizer(br.readLine());
            int d=Integer.parseInt(st.nextToken());
            int temp=Integer.parseInt(st.nextToken());
            if(d==0){
                xList.add(temp);
            }else{
                yList.add(temp);
            }
        }
        xList.add(0);
        xList.add(h);
        yList.add(0);
        yList.add(w);
        Collections.sort(xList);
        Collections.sort(yList);
        int maxX=0;
        int maxY=0;
       for(int i=0;i<xList.size()-1;i++){
           maxX=Math.max(maxX,xList.get(i+1)-xList.get(i));
       }
        for(int i=0;i<yList.size()-1;i++){
            maxY=Math.max(maxY,yList.get(i+1)-yList.get(i));
        }
        System.out.println(maxX*maxY);
    }

}
