public class BettingMoney {

	public int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult) {
		int gains=0;
		int loses=0;
		for(int i=0;i<amounts.length;i++){
			if(i==finalResult){
				loses=centsPerDollar[i]*amounts[i];
			}else{
				gains+=amounts[i];
			}
		}
		
		return gains*100-loses;
	}

}
