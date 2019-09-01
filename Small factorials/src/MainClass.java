import java.math.BigInteger;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=0;
		BigInteger fact;
		for(int i=0;i<n;i++) {
		    k=in.nextInt();
		    fact=new BigInteger("1");
		    for(int j=k;j>0;j--){
		        fact=fact.multiply(new BigInteger(((Integer)j).toString()));
		    }
		    System.out.println(fact);
		}
	}

}
