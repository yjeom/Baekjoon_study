import java.util.Scanner;

public class N2675 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int T=Integer.parseInt(scan.nextLine());
		
		String S[]=new String[T];
		for(int i=0;i<S.length;i++) {
			 S[i]=scan.nextLine();
			 
		}
		for(int i=0;i<S.length;i++) {
			String test[]=S[i].split(" ");
			int repeat=Integer.parseInt(test[0]);
			String output="";
			for(int j=0;j<test[1].length();j++) {
				for(int z=0;z<repeat;z++) {
					output=output+test[1].charAt(j)+"";
				}
			}
			System.out.println(output);
		}
	}

}
