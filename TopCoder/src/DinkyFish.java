
public class DinkyFish {
	/*public static int monthsUntilCrowded(int tankVolume, int maleNum, int femaleNum) {
		int couples = Math.min(maleNum, femaleNum);
		int rem = (maleNum + femaleNum - 2 * couples);
		int months = -1;
		while ((couples + rem+1)/2 <= tankVolume){
			couples *= 2;
			months++;
		}
		return Math.max(0,months);
	}*/
	public static int monthsUntilCrowded(int tankVolume, int maleNum, int femaleNum){
		
		return 0;
		
	}
/*	public static int monthsUntilCrowded(int tankVolume, int maleNum, int femaleNum){
		int limit=tankVolume*2;
		double numOfFish=maleNum+femaleNum;
		if(numOfFish==limit)return 1;
		if(numOfFish>limit)return 0;
		
		int count=0;
		while(numOfFish<limit){
			
			numOfFish=Math.pow(2,Math.min(maleNum, femaleNum)+count);
			
			count++;
		}
		return count;
	}*/
	public static void main(String[] args) {
		int[] tankVolume={10,100,5,4,1000000,431131};
		int[] maleNum={4,4,6,6,3,764};
		int[] femaleNum={6,6,4,4,2,249};
		System.out.println(monthsUntilCrowded(431131,764,249));
		/*for(int i=0;i<tankVolume.length;i++){
			System.out.println(monthsUntilCrowded(tankVolume[i], maleNum[i], femaleNum[i]));
		}*/
	}

}
