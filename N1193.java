import java.util.Scanner;

public class N1193 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        int group=1;
        int A=group;
        for(int i=1;i<input;i++){
            if(A==1){
                group++;
                A=group;
            }else{
                A=A-1;
            }
        }
        if(group%2==1){
            System.out.println(A+"/"+(group-A+1));
        }else{
            System.out.println((group-A+1)+"/"+A);
        }
    }
}
