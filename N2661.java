import java.util.Scanner;

public class N2661 {
    static int N;
    static boolean end=false;
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        backtracking("");
    }
    static void backtracking(String str){
        if(end) return;
        if(str.length()==N){
            System.out.println(str);
            end=true;
            return;
        }
        for(int i=1;i<=3;i++){
            if(check(str+i)){
                backtracking(str+i);
            }
        }
    }
    static boolean check(String str){
        int len=str.length();
        for(int i=1;i<=len/2;i++) {
            String front = str.substring(len-i,len);
            String back = str.substring(len-i-i, len-i);
            if (front.equals(back)) {
                return false;
            }
        }
        return true;
    }
}
