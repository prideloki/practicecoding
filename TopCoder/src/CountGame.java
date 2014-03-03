
public class CountGame {
	public static int howMany(int maxAdd,int goal,int next){
		int count=0;
		while(goal>=next){
			if(goal<(next+maxAdd)){
				return 1+(goal-next);
			}
			goal-=maxAdd+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] maxAdd={3,5,5};
		int[] goal={20,20,20};
		int[]next={10,10,9};
		for(int i=0;i<goal.length;i++){
			System.out.println(howMany(maxAdd[i], goal[i], next[i]));
		}
	}

}
