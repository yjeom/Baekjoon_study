import java.util.Scanner;

public class N11720 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		
		String in=scan.nextLine();
		int sum=0;
		for(int i=0;i<in.length();i++) {
			String num=in.substring(i, i+1);
			sum+=Integer.parseInt(num);
		}
		System.out.println(sum);
	}

}
