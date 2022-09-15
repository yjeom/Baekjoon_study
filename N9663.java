import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9663 {
    static int N;
    static int count=0;
    static int arr[];
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        arr=new int[N];
        nQueen(0);
        System.out.println(count);
    }
    static void nQueen(int number){
        if(number==N){
            count++;
            return;
        }
        for(int i=0;i<N;i++){
            arr[number]=i;
           if(check(number)){
               nQueen(number+1);
           }
        }
    }
    static boolean check(int col){
        for(int j=0;j<col;j++){
            if(arr[j]==arr[col] ||
                    (Math.abs(j-col)==Math.abs(arr[j]-arr[col]))
            ) return false;

        }
        return true;
    }
}
