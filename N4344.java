import java.util.Scanner;
import java.util.StringTokenizer;

public class N4344 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int c=Integer.parseInt(scan.nextLine());
		String input[]=new String[c];
		for(int i=0;i<input.length;i++) {
			input[i]=scan.nextLine();
		}
		for(int i=0;i<input.length;i++) {
			System.out.println(String.format("%.3f", avg(input[i]))+"%");
		}
	}

	static double avg(String str) {
		double total=0;
		double avg=0;
		double n=0;
		double count=0;
		String[]arr=str.split(" ");
		n=Double.parseDouble(arr[0]);
		for(int i=1;i<arr.length;i++) {
			total+=Double.parseDouble(arr[i]);
		}
		avg=total/n;
		for(int i=1;i<arr.length;i++) {
			if(Double.parseDouble(arr[i])>avg)
				count++;
		}
		return count/n*100;
	}
}
