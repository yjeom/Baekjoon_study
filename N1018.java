import java.util.Scanner;
import java.util.StringTokenizer;

public class N1018 {
    static int min=Integer.MAX_VALUE;
    static int map[][];
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        StringTokenizer st=new StringTokenizer(scanner.nextLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        map=new int[N][M];
        for(int i=0;i<N;i++){
            String line=scanner.nextLine();
            char divLine[]=line.toCharArray();
            for(int j=0;j<M;j++){
                if(divLine[j]=='B') map[i][j]=0;
                else map[i][j]=1;
            }
        }
        for(int i=0;i<=(N-8);i++){
            for(int j=0;j<=(M-8);j++){
                func(i,j,0);
                func(i,j,1);
            }
        }
        System.out.println(min);
    }
    static void func(int x,int y,int start){
        int count=0;
        for(int i=x;i<(x+8);i++){
            for(int j=y;j<(y+8);j++){
                if(i%2==1){
                    if(j%2==1 && map[i][j]!=start) count++;
                    else if(j%2==0 && map[i][j] ==start) count++;
                }else{
                    if(j%2==1 && map[i][j]==start) count++;
                    else if(j%2==0 &&map[i][j] !=start) count++;
                }
            }
        }
        min=Math.min(min,count);
    }

}
