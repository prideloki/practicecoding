import java.awt.Point;

public class CutoffRounder {

	public int round(String num, String cutoff) {
		double frac = Double.parseDouble(num);
		int result = (int) Math.floor(frac);
		frac -= result;
		double cutoff_num = Double.parseDouble(cutoff);
		if (frac > cutoff_num)
			result += 1;
		return result;
	}

	private double parseDouble(String d) {
		double result=0.0;
		int pointPos=d.indexOf(".");
		if(pointPos>0){
			for(int i=0;i<pointPos;i++){
				//result+=
			}
		}
		return 0.0;
	}
}
