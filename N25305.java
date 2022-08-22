import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class N25305 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int K=scanner.nextInt();
        Integer arr[]=new Integer[N];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[K-1]);
    }
}
