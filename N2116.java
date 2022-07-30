import java.util.Scanner;

public class N2116 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int dices[][]=new int[N][6];
        for(int i=0;i<N;i++){
            for(int j=0;j<6;j++){
                dices[i][j]= scanner.nextInt();
            }
        }
        int result=0;
        for(int i=0;i<6;i++){
            int sum=0;
            int bottomIndex=i;
            for(int j=0;j<N;j++){
                int topIndex=getPair(bottomIndex);
                int max=0;
                for(int k=0;k<6;k++){
                    if(k!=bottomIndex && k!=topIndex){
                        max=Math.max(max,dices[j][k]);
                    }
                }
                sum+=max;
                if(j<N-1){
                    for(int k=0;k<6;k++){
                        if(dices[j+1][k]==dices[j][topIndex]){
                            bottomIndex=k;
                        }
                    }
                }
            }
            result=Math.max(result,sum);
        }
        System.out.println(result);
    }
    static int getPair(int n){
        int pair=0;
        if(n==0) pair=5;
        else if(n==1||n==2) pair=n+2;
        else if(n==3|| n==4) pair=n-2;
        else pair=0;
        return pair;
    }
}
