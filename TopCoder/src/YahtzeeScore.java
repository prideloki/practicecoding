
public class YahtzeeScore {
	public int maxPointsFirst(int[] toss){
		int max=toss[0];
		int sum=0;
		for(int i=1;i<toss.length;i++){
			if(toss[i]>max)max=toss[i];
		}
		for(int i=0;i<toss.length;i++){
			if(toss[i]==max)sum+=toss[i];
		}
		return sum;
	}
	public int maxPoints(int[] toss){
		int sum=toss[0];
		int max=toss[0];
		for(int i=1;i<toss.length;i++){
			if(toss[i]>max){
				max=toss[i];
				sum=toss[i];
			}
			else if(toss[i]==max){
				sum+=toss[i];
			}
		}
		return sum;
	}

}
