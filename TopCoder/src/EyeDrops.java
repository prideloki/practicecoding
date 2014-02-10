
public class EyeDrops {
	public static double closest(int sleepTime, int k){
		double optimal=(24*60.0)/k;
		if(24/k<sleepTime){
			return (24-sleepTime)*60.0/(k-1);
		}
		return optimal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
