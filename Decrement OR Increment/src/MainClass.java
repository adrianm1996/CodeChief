import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		int n;
		Scanner odczyt = new Scanner(System.in);
		n = odczyt.nextInt();
		
		if(n % 4 == 0)
			n++;
		else
			n--;
		
		System.out.println(n);
	}

}
