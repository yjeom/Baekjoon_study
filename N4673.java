import java.util.HashSet;
import java.util.Set;

public class N4673 {
	public static void main(String[]args) {
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<10000;i++){
			int n=d(i);
			set.add(n);
			
		}
		for(int i=1;i<10000;i++) {
			if(!(set.contains(i)))
					System.out.println(i);
		}
	}

	static int d(int n) {
		int sum=n;
		while(n!=0) {
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}
}
