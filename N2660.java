import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class N2660 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int map[][]=new int [num+1][num+1];
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==j) map[i][j]=0;
                else map[i][j]=999999;
            }
        }
        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            if(i==-1 && j==-1) break;
            map[i][j]=1;
            map[j][i]=1;
        }

        for(int k=1;k<=num;k++){
            for(int i=1;i<=num;i++){
                for(int j=1;j<=num;j++){
                    map[i][j]=Math.min(map[i][j],map[i][k]+map[k][j]);
                }
            }
        }
        int dis[]=new int[num+1];
        for(int i=1;i<=num;i++){
            int max=Integer.MIN_VALUE;
            for(int j=1;j<=num;j++){
                max=Math.max(max,map[i][j]);
            }
            dis[i]=max;
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=num;i++){
            min=Math.min(min,dis[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=num;i++){
            if(dis[i]==min){
                list.add(i);
            }
        }
        Collections.sort(list);

        System.out.println(min+" "+list.size());
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}
