public class Stairs {
	public static int designs(int maxHeight, int minWidth, int totalHeight,
			int totalWidth) {
		int count = 0;
		int i = 1;
		while (true) {
			if (totalHeight / (i + 1) <= maxHeight)
				if (totalWidth / i >= minWidth) {
					if (totalHeight % (i + 1) == 0 && totalWidth % i == 0)
						count++;

				} else {
					break;
				}
			i++;
		}
		return count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] maxHeight = { 22, 25, 1000 };
		int[] minWidth = { 25, 25, 1 };
		int[] totalHeight = { 100, 60, 600 };
		int[] totalWidth = { 100, 100, 600 };
		for (int i = 0; i < maxHeight.length; i++) {
			System.out.println(designs(maxHeight[i], minWidth[i],
					totalHeight[i], totalWidth[i]));
		}
	}

}
