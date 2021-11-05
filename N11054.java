import java.util.Scanner;

public class N11054 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int inputs[]=new int[n];
        int dp_l[]=new int[n];
        int dp_r[]=new int[n];
        for(int i=0;i<n;i++){
            inputs[i]= scan.nextInt();
        }
        for(int i=0;i<n;i++){
            dp_l[i]=1;
            for(int j=0;j<i;j++){
                if(inputs[i]>inputs[j]){
                    dp_l[i]=Math.max(dp_l[i],dp_l[j]+1);
                }
            }

        }
        for(int i=n-1;i>=0;i--){
            dp_r[i]=1;
            for(int j=n-1;j>i;j--){
                if(inputs[i]>inputs[j]){
                    dp_r[i]=Math.max(dp_r[i],dp_r[j]+1);
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,dp_l[i]+dp_r[i]-1);
        }
        System.out.println(max);
    }
}
