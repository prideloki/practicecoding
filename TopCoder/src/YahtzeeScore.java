public class YahtzeeScore {

	public int maxPoints(int[] toss) {
		int maxPoints=0;
		
		/*sol 1 O(n^2)
		for(int i=0;i<toss.length;i++){
			int chosen=toss[i];
			int sum=0;
			for(int j=0;j<toss.length;j++){
				if(chosen==toss[j]){
					sum+=chosen;
				}
			}
			if(sum>maxPoints)maxPoints=sum;
		}
		*/
		//sol 2 O(6*n)
		int[] sum=new int[6];
		for(int i=0;i<toss.length;i++){
			sum[toss[i]-1]++;
		}
		for(int i=0;i<sum.length;i++){
			int totalPoint=sum[i]*(i+1);
			if(totalPoint>maxPoints)maxPoints=totalPoint;
		}
		
		return maxPoints;
	}

}
