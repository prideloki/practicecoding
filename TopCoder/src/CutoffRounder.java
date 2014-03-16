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

	private static double parseDouble(String d) {
		double result = 0.0;
		int pointPos = d.indexOf(".");
		//Positive num
		if (pointPos > 0) {
			int fracLeng = d.length() - (pointPos + 1);

			for (int i = 0; i < fracLeng; i++) {

				result += (Character
						.getNumericValue(d.charAt(pointPos + 1 + i)))
						* Math.pow(10, -i - 1);

			}
		}
		for (int i = 0; i < pointPos; i++) {
			result += (Character.getNumericValue(d.charAt(i)))
					* Math.pow(10, pointPos - 1 - i);

		}
		return result;
	}

	public static void main(String[] args) {
		String d = "0";
		System.out.println(parseDouble(d));
	}
}
