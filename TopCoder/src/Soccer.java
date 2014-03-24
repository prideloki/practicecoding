public class Soccer {

	public int maxPoints(int[] wins, int[] ties) {
		int[] points = new int[wins.length];
		int max=0;
		for(int i=0;i<points.length;i++){
			points[i]=3*wins[i]+ties[i];
			if(max<points[i])max=points[i];
		}
		return max;
	}

}
