public class GolfScore {
	public static int tally(int[] parValues, String[] scoreSheet) {
		// more than +1 under -1
		int score = 0;

		for (int i = 0; i < parValues.length; i++) {
			int stroke;
			switch (scoreSheet[i]) {
			case "triple bogey":
				stroke = 3;
				break;
			case "double bogey":
				stroke = 2;
				break;
			case "bogey":
				stroke = 1;
				break;
			case "par":
				stroke = 0;
				break;
			case "birdie":
				stroke = -1;
				break;
			case "eagle":
				stroke = -2;
				break;
			case "albatross":
				stroke = -3;
				break;
			case "hole in one":
				stroke = -1*(parValues[i]-1);
				break;
			default:
				stroke = Integer.MIN_VALUE;
			}
			score += parValues[i] + stroke;
		}
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] parValues = {
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 5, 5, 5, 5, 5, 5 },
				{ 3, 2, 4, 2, 2, 1, 1, 1, 3, 2, 4, 4, 4, 2, 3, 1, 3, 2 },
				{ 3, 2, 4, 2, 2, 1, 1, 1, 3, 2, 4, 4, 4, 2, 3, 1, 3, 2 },
				{ 4, 1, 3, 3, 4, 4, 1, 4, 2, 3, 3, 5, 4, 1, 4, 4, 2, 1 },
				{ 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 } };
		String[][] scoreSheet = {
				{ "bogey", "bogey", "bogey", "bogey", "bogey", "bogey",
						"bogey", "bogey", "bogey", "eagle", "eagle", "eagle",
						"eagle", "eagle", "eagle", "eagle", "eagle", "eagle" },
				{ "bogey", "double bogey", "par", "double bogey",
						"double bogey", "triple bogey", "triple bogey",
						"triple bogey", "bogey", "double bogey", "par", "par",
						"par", "double bogey", "bogey", "triple bogey",
						"bogey", "double bogey" },
				{ "eagle", "birdie", "albatross", "birdie", "birdie", "par",
						"hole in one", "par", "eagle", "birdie", "albatross",
						"albatross", "albatross", "birdie", "eagle",
						"hole in one", "eagle", "birdie" },
				{ "triple bogey", "triple bogey", "bogey", "par",
						"triple bogey", "double bogey", "triple bogey",
						"triple bogey", "par", "eagle", "bogey", "bogey",
						"birdie", "par", "triple bogey", "eagle",
						"triple bogey", "triple bogey" },
				{ "eagle", "birdie", "albatross", "birdie", "birdie", "par",
						"hole in one", "par", "eagle", "birdie", "albatross",
						"albatross", "albatross", "birdie", "eagle",
						"hole in one", "eagle", "birdie" } };
		for (int i = 0; i < parValues.length; i++) {
			System.out.println(tally(parValues[i], scoreSheet[i]));
			//56
		}
	}

}
