import java.util.Arrays;


public class RPG {
	public static int[] dieRolls(String[] dice){
		int[] values=new int[3];
		for(int i=0;i<dice.length;i++){
			int indexOfD=dice[i].indexOf("d");
			int numberOfDices=Integer.parseInt(dice[i].substring(0,indexOfD));
			int max=Integer.parseInt(dice[i].substring(indexOfD+1));
			values[0]+=numberOfDices;
			values[1]+=max*numberOfDices;
			values[2]+=(1+max)*numberOfDices;
		}
		values[2]/=2;
		return values;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] dice={{"3d6"},{"3d4","1d6"},{"6d5","10d10","10d20"},{"1d2","2d2","4d2","6d2","8d2"}};
		for(int i=0;i<dice.length;i++){
			System.out.println(Arrays.toString(dieRolls(dice[i])));
		}
		
	}

}
