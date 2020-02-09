import java.util.Scanner;

public class N3052 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		int n[]=new int[10];
		int mod[]=new int[10];
		int count=0;
		for(int i=0;i<n.length;i++) {
			n[i]=scan.nextInt();
			mod[i]=n[i]%42;
		}
		
		for(int i=0;i<mod.length;i++) {
			for(int j=i+1;j<mod.length;j++) {
				if(mod[i]==mod[j])
					mod[i]=-1;
			}
		}
		for(int i=0;i<mod.length;i++) {
			if(mod[i]>-1) 
				count++;
		}
		System.out.println(count);
	}

}
