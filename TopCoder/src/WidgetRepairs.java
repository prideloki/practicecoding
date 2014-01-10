public class WidgetRepairs {
	public static int days(int[] arrivals, int numPerDay) {
		int days = 0;
		int total = 0;
		for (int i = 0; i < arrivals.length; i++) {
			total += arrivals[i];
			if (total != 0) {
				total -= numPerDay;
				if (total < 0)
					total = 0;
				days++;
			}

		}
		while (total > 0) {
			days++;
			total -= numPerDay;
		}
		return days;
	}
}
	/*public static void main(String[] args) {
		int[][] example = { { 10, 0, 0, 4, 20 }, { 0, 0, 0 }, { 100, 100 },
				{ 27, 0, 0, 0, 0, 9 },
				{ 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6 } };
		int[] days = { 8, 10, 10, 9, 3 };
		for (int i = 0; i < example.length; i++) {
			System.out.println(days(example[i], days[i]));
		}
	}
}*/
