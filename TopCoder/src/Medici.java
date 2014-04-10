public class Medici {

	public int winner(int[] fame, int[] fortune, int[] secrets) {
		int winner=-1;
		int max = 0;
		for (int i = 0; i < fame.length; i++) {
			int min = Integer.MAX_VALUE;
			if (fame[i] < min)
				min = fame[i];
			if (fortune[i] < min)
				min = fortune[i];
			if (secrets[i] < min)
				min = secrets[i];
			System.out.println(min);
			if(min>max){
				max=min;
				winner=i;
			}else if(min==max){
				winner=-1;
			}
		}
		return winner;
	}

}
