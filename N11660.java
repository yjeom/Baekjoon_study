import java.util.Scanner;

public class N11660 {
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder();
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int sum[][]=new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                int input=scanner.nextInt();
                if(j==1) sum[i][j]=input;
                else sum[i][j]=sum[i][j-1]+input;
            }
        }
        for(int i=0;i<M;i++){
            int x1=scanner.nextInt();
            int y1=scanner.nextInt();
            int x2=scanner.nextInt();
            int y2=scanner.nextInt();
            int result=0;
            for(int j=x1;j<=x2;j++){
                result+=sum[j][y2]-sum[j][y1-1];
            }
            sb.append(result+"\n");
        }
        System.out.print(sb);
    }
}
