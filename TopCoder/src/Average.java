public class Average {

	public int belowAvg(int[] math, int[] verbal) {
		double avg=0.0;
		int count=0;
		for(int i=0;i<math.length;i++){
			avg+=math[i]+verbal[i];
		}
		avg/=math.length;
		for(int i=0;i<math.length;i++){
			int score=math[i]+verbal[i];
			if(score<avg)count++;
		}
		return count;
	}

}
