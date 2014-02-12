import java.util.Arrays;

public class Swimmers {
	public static int[] getSwimTimes(int[] distances, int[] speeds, int current) {
		int[] times = new int[speeds.length];
		for (int i = 0; i < speeds.length; i++) {
			double vGo = speeds[i] + current;
			double vBack = speeds[i] - current;
			double tGo = 0;
			double tBack = 0;
			if (vGo > 0 && vBack > 0) {
				tGo = distances[i] / vGo;
				tBack = distances[i] / vBack;
				times[i] = (int) (tGo + tBack);
			} else if (distances[i] == 0) {
				times[i] = 0;
			}

			else if (vBack <= 0) {
				times[i] = -1;
			}

		}
		return times;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] distances = {
				{ 300, 300, 300 },
				{ 500, 500 },
				{ 0, 0 },
				{ 0, 1 },
				{ 7507, 7517, 7523, 7529, 7537, 7541, 7547, 7549, 7559, 7561,
						7573, 7577, 7583, 7589, 7591, 7603, 7607, 7621, 7639,
						7643, 7649, 7669, 7673, 7681, 7687, 7691, 7699, 7703,
						7717, 7723, 7727, 7741, 7753, 7757, 7759, 7789, 7793,
						7817, 7823, 7829, 7841, 7853, 7867, 7873, 7877, 7879,
						7883, 7901, 7907, 7919 } };
		int[][] speeds = {
				{ 1, 2, 3 },
				{ 4, 5 },
				{ 1, 2 },
				{ 0, 0 },
				{ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
						59, 61, 67, 71, 73, 79, 83, 89, 97, 99, 4, 6, 8, 10,
						12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38,
						40, 42, 44, 46, 48, 51 } };
		int[] current = { 2, 2, 1, 0, 6 };
		for (int i = 0; i < distances.length; i++) {
			System.out.println(Arrays.toString(getSwimTimes(distances[i],
					speeds[i], current[i])));
		}

	}

}
