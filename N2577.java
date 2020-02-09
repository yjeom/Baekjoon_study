import java.util.Scanner;

public class N2577 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		int []arr={0,0,0,0,0,0,0,0,0,0};
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		
		int num=n1*n2*n3;
		
		while(num!=0) {
			int index=num%10;
			num=num/10;
			
			arr[index]=arr[index]+1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
