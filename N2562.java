import java.util.Scanner;

public class N2562 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		int []arr=new int[9];
		int max=0;
		int max_index=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			if(arr[i]>max) {
				max=arr[i];
				max_index=i;
			}
		}
		System.out.println(max+"\n"+(max_index+1));
	}

}
