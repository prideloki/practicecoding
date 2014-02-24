
public class OnLineRank {
	public static int calcRanks(int k,int[] scores){
		int sumOfRank=1;
		int[] ranks=new int[scores.length];
		ranks[0]=1;
		for(int i=1;i<scores.length;i++){
			ranks[i]=1;
			if(i<k){
				for(int j=0;j<i;j++)
				if(scores[i]<scores[j])ranks[i]++;
			}else{
				for(int j=i-k;j<i;j++)
					if(scores[i]<scores[j])ranks[i]++;
			}
			sumOfRank+=ranks[i];
		}
		
		return sumOfRank;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores={{6,9,8,15,7,12},{3,3,3,3,3,3,3}};
		int[] k={3,80};
		for(int i=0;i<scores.length;i++){
			System.out.println(calcRanks(k[i], scores[i]));
		}
	}

}
