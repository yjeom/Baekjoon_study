import java.util.HashSet;
import java.util.Scanner;

public class N1764 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        HashSet<String> noListen=new HashSet<>();
        HashSet<String>result=new HashSet<>();
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<N;i++){
            noListen.add(scanner.nextLine());
        }
        for(int i=0;i<M;i++){
            String name= scanner.nextLine();
            if(noListen.contains(name)){
                result.add(name);
            }
        }
        System.out.println(result.size());
        result.stream().sorted().forEach(System.out::println);
    }
}
