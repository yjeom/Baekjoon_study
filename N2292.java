import java.util.Scanner;

public class N2292 {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());

        int count=1;
        if(input==1){
            System.out.println(count);
        }else{
            int room=1;
            while(input>room){
                room+=6*count;
                count++;
            }
            System.out.println(count);
        }
    }
}
