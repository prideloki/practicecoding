
public class CountGame {
	public static int howMany(int maxAdd,int goal,int next){
		
		int temp=maxAdd+1;
		int temp2=next/temp;
		int temp3=maxAdd*temp2+(goal%maxAdd);
		if(next>temp3)return -1;
		return 0;
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
