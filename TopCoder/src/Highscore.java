import java.util.ArrayList;
import java.util.Arrays;

public class Highscore {

	public int getRank(int[] scores, int newscore, int places) {
		int rank = -1;
		/*
		 * if(scores.length==0)return 1; for (int i = 0; i < scores.length; i++)
		 * { int score = scores[i]; if (newscore >= score) {
		 * if(i+1==places&&newscore==score){ return -1; }else{ return i+1; } } }
		 */
		if(scores.length==0)return 1;
		int[] ranks = new int[places];
		ranks[0] = 1;
		for (int i = 1, k = 1; i < scores.length; i++) {
			int current = scores[i];
			int prev = scores[i - 1];
			if (current < prev) {
				ranks[i] = ++k;
			} else if (current == prev) {
				ranks[i] = ranks[i - 1];
			}
			
			if(newscore>current){
				System.out.println(ranks[i-1]);
				return ranks[i];
			}else if(newscore==current){
				return ranks[i];
			}
			
		}
		//System.out.println(Arrays.toString(scores));
		//System.out.println(Arrays.toString(ranks));
		//System.out.println();
		return rank;
	}

}
