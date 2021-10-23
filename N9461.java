import java.util.Scanner;

public class N9461 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        int inputs[]=new int[t];
        for(int i=0;i<t;i++){
            inputs[i]= scan.nextInt();
        }
        long d[]=new long[101];
        for(int i=1;i<=100;i++){
            if(i==1||i==2||i==3) d[i]=1;
            else d[i]=d[i-2]+d[i-3];
        }
        for(int i=0;i<inputs.length;i++){
            System.out.println(d[inputs[i]]);
        }
    }
}
