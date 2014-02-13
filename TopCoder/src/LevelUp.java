
public class LevelUp {
	public static int toNextLevel(int[] expNeeded, int received){
		int whatleft=0;
		if(received<expNeeded[0]){
			return expNeeded[0]-received;
		}
		int uptoLevel=0;
		for(int i=0;i<expNeeded.length;i++){
			if(received<expNeeded[i]){
				uptoLevel=i;
				break;
			}
		}
		
		whatleft=(expNeeded[uptoLevel]-expNeeded[uptoLevel-1])-(received-expNeeded[uptoLevel-1]);
		
		return whatleft;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] expNeeded={150,450,900,1800};
		int[]received={133,312,612,450};
		for(int i=0;i<received.length;i++){
			System.out.println(toNextLevel(expNeeded, received[i]));
		}
	}

}
