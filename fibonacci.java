package college;
import java.math.BigInteger;
public class fibonacci {
	public static BigInteger fibonacciSeries(int val) {
		BigInteger f1= new BigInteger ("0");
		BigInteger f2 =new BigInteger ("1");
		BigInteger f3 =new BigInteger ("0");
		for (int i=2 ; i<val+1 ; i++ ) {
			f3=f1.add(f2);
			f1=f2;
			f2=f3;
		}
	    return f3;
	}
}
