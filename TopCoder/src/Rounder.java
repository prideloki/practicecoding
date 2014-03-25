public class Rounder {

	public int round(int n, int b) {
		
		int q=n/b;
		int result =(Math.abs(n-b*q)<Math.abs(n-b*(q+1)))?b*q:b*(q+1);
		
		
		return result;
	}

}
