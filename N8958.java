import java.util.Scanner;

public class N8958 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		
		String str[]=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=scan.nextLine();
		}
		for(int i=0;i<n;i++) {
			System.out.println(total(str[i]));
		}
		
	}
	  static int total(String str) {
		int total=0;
		int up=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='o'||str.charAt(i)=='O') {
				total+=up;
				up++;
			}
			if(str.charAt(i)=='x'||str.charAt(i)=='X') {
				up=1;
			}
		}
		return total;
	}
}
