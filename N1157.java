import java.util.*;

public class N1157 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        char [] inputs=scan.nextLine().toUpperCase(Locale.ROOT).toCharArray();
        int []arr=new int [26];
        Integer []sort=new Integer[26];
        for(int i=0;i<sort.length;i++){
            sort[i]=i;
            arr[i]=0;
        }
        for(int i=0;i<inputs.length;i++){
            int num=(int)inputs[i]-65;
            arr[num]++;
        }
       Arrays.sort(sort,new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return arr[o2]-arr[o1];
           }
       });
        if(arr[sort[0]]==arr[sort[1]]){
            System.out.println("?");
        }else{
            System.out.println((char)(sort[0]+65));
        }
    }
}
