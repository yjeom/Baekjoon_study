import java.util.Scanner;

public class N15953 {
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		int T=Integer.parseInt(scan.nextLine());
		String input[]=new String[T];
		for(int i=0;i<T;i++) {
			input[i]=scan.nextLine();
		}
		for(int i=0;i<T;i++) {
			String arr[]=input[i].split(" ");
			System.out.println(one(Integer.parseInt(arr[0]))+two(Integer.parseInt(arr[1])));
		}
		
	}
 static int one(int score) {
	 int price=0;
	 if(score==1)
		 price=5000000;
	 else if(score>=2 && score<=3)
		 price=3000000;
	 else if(score>=4 && score<=6)
		 price=2000000;
	 else if(score>=7 && score<=10)
		 price=500000;
	 else if(score>=11 && score<=15)
		 price=300000;
	 else if(score>=16 && score<=21)
		 price=100000;
	 
	 return price;
 }
 static int two(int score) {
	 int price=0;
	 if(score==1)
		 price=5120000;
	 else if(score>=2 && score<=3)
		 price=2560000;
	 else if(score>=4 && score<=7)
		 price=1280000;
	 else if(score>=8 && score<=15)
		 price=640000;
	 else if(score>=16 && score<=31)
		 price=320000;
	
	 
	 return price;
 }
}
