import java.util.Arrays;

//srm 165 div2
public class BritishCoins {
	public static int[] coins(int pence){
		int[] coins=new int[3];
		coins[0]=pence/(12*20);
		pence=pence%(12*20);
		coins[1]=pence/12;
		pence=pence%12;
		coins[2]=pence;
				
		return coins;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pences={533,0,6,4091,10000};
		
		for(int i=0;i<pences.length;i++){
			System.out.println(Arrays.toString(coins(pences[i])));
		}
	}

}
