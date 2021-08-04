import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class N4948 {
    public static int countPrime(int n){
        int []num=new int[(2*n)+1];
        int count=0;
        for(int i=2;i<=2*n;i++){
            num[i]=i;
        }
        for(int i=2;i<=2*n;i++){
            if(num[i]!=0){
                for(int j=i+i;j<=2*n;j+=i){
                    num[j]=0;
                }
            }
        }
        for(int i=2;i<=2*n;i++){
            if((num[i]!=0)&&(num[i]>n)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        Vector<Integer> result=new Vector<>();
        do{
            n=Integer.parseInt(br.readLine());
            if(n!=0){
                result.add(countPrime(n));
            }
        }while(n!=0);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }

}
