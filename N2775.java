import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2775 {
    public static int countPeople(int k,int n){
        if(k==0){
            return n;
        }
        else if(n==1){
            return 1;
        }
        else{
            return countPeople(k,n-1)+countPeople(k-1,n);
        }
    }

    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int k[]=new int[T];
        int n[]=new int[T];
        for(int i=0;i<T;i++){
            k[i]=Integer.parseInt(br.readLine());
            n[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<T;i++){
            if(n[i]>14){
                System.out.println("정수 n은 14이하입니다.");
                n[i]=Integer.parseInt(br.readLine());
            }
            if(k[i]<1){
                System.out.println("정수 k는 1이상입니다.");
                k[i]=Integer.parseInt(br.readLine());
            }
           System.out.println(countPeople(k[i],n[i]));

        }
    }
}
