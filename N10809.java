import java.util.Scanner;

public class N10809 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		s=s.toLowerCase();
		char arr[]=s.toCharArray();
		for(int i=97;i<123;i++) {
			if(s.contains((char)i+"")) {
				System.out.print(s.indexOf((char)i+"")+" ");
			}
			else {
				System.out.print("-1 ");
			}
		}
	}

}
