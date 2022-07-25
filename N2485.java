import java.util.Scanner;

public class N2485 {
    static int GCD=Integer.MAX_VALUE;
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int arr[]=new int[N];
        int dis[]=new int[N-1];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
            if(i>=1){
                dis[i-1]=arr[i]-arr[i-1];
            }
        }
        for(int i=1;i<(N-1);i++){
            calGCD(dis[i],dis[i-1]);
        }
        int count=0;
        for(int i=0;i<(N-1);i++){
            count+=dis[i]/GCD-1;
        }
        System.out.println(count);
    }
    static void calGCD(int m,int r){
        if(r==0){
            GCD=Math.min(GCD,m);
            return;
        }
        calGCD(r,m%r);
    }
}
