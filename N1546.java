import java.util.Scanner;
import java.util.StringTokenizer;

public class N1546 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		
		double score[]=new double[n];
		
		double total=0.0;
		double max=0.0;
		String input=scan.nextLine();
		StringTokenizer token=new StringTokenizer(input, " ");
		for(int i=0;i<score.length;i++) {
			score[i]=Integer.parseInt(token.nextToken());
			if(max<score[i])
				max=score[i];
		}
		
		double change[]=new double[n];
		for(int j=0;j<change.length;j++) {
			change[j]=score[j]/max*100;
			total+=change[j];
		}
		
		System.out.println(total/n);
	}

}
