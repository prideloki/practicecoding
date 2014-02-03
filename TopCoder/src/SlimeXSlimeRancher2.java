
public class SlimeXSlimeRancher2 {
	public static int train(int[] attributes){
		int sum=0;
		for(int i=0;i<attributes.length;i++){
			sum+=Math.abs(attributes[attributes.length-1]-attributes[i]);
		}
		return sum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test={{1,2,3},{5,5},{900,500,100}};
		for(int i=0;i<test.length;i++)
		System.out.println(train(test[i]));
	}

}
