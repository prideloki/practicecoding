
public class DinkyFish {
	
	public static int monthsUntilCrowded(int tankVolume, int maleNum, int femaleNum){
		int couple =(maleNum<=femaleNum)?maleNum:femaleNum;
		int lonelyfish=(maleNum+femaleNum)-couple*2;
		int month=-1;
		// fish 1 water 1/2 lt
		// n fish water n/2 lt
		while((couple+lonelyfish+1)/2<=tankVolume){
			couple*=2;
			month++;
		}
		return month;
	}
	public static void main(String[] args) {
		int[] tankVolume={10,100,5,4,1000000,431131};
		int[] maleNum={4,4,6,6,3,764};
		int[] femaleNum={6,6,4,4,2,249};
		//System.out.println(monthsUntilCrowded(431131,764,249));
		for(int i=0;i<tankVolume.length;i++){
			System.out.println(monthsUntilCrowded(tankVolume[i], maleNum[i], femaleNum[i]));
		}
	}

}
