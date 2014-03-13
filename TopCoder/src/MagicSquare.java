public class MagicSquare {

	public int missing(int[] square) {
		int[] missing=new int[2];
		int magicNum = 0;
		for (int j = 0,k=0; j < square.length; j += 3,k++) {
			int sum=0;
			for (int i = 0; i < 3; i++) {
				if (square[j+i] == -1){
					missing[0] = j;
					missing[1]=i;
				}	
				sum += square[i+j];
			}
			if(sum>=magicNum)magicNum=sum;
		}
		
		magicNum-=square[(missing[0]+missing[1]+1)%3+missing[0]];
		
		magicNum-=square[(missing[0]+missing[1]+2)%3+missing[0]];
		
		return magicNum;
	}

}
