public class Bits {

	public int minBits(int n) {
		int count =0;
		long powerOfTwo=1;
		while(true){
			if(powerOfTwo==n)return count+1;
			else if(powerOfTwo>n)return count;
			powerOfTwo*=2;
			count++;
		}
		
	}

}
