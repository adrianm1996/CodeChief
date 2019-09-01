import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int T;
		Scanner read = new Scanner(System.in);
		 T = read.nextInt();
		    while(T --> 0) {
		       int n =  read.nextInt();
		       int m =  read.nextInt();
		       int ans = (n - 1) * (m - 1);
		       System.out.println(ans);
		    }
	}

}
