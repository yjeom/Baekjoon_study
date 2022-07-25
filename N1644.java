import java.util.ArrayList;
import java.util.Scanner;

public class N1644 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        boolean arr[]=new boolean[N+1];
        ArrayList<Integer> prime=new ArrayList<>();
        for(int i=2;(i*i)<=N;i++){
            if(!arr[i]) {
                for (int j = i * i; j <= N; j += i) {
                    arr[j] = true;
                }
            }
        }
        for(int i=2;i<=N;i++){
            if(!arr[i]) prime.add(i);
        }
        int count=0;
        for(int i=0;i< prime.size();i++){
            int sum=0;
            for(int j=i;j< prime.size();j++){
                sum+= prime.get(j);
                if(sum==N){
                    count++;
                    break;
                }else if(sum>N){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
