import java.util.Scanner;
import java.util.StringTokenizer;

public class N10818 {
	
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		String input=scan.nextLine();
		
		int []arr=new int[n];
		StringTokenizer st=new StringTokenizer(input," ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println(min+" "+max);
	}

}
