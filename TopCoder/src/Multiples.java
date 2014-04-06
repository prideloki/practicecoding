public class Multiples {

	public int number(int min, int max, int factor) {
		int count=0;
		for(int i=min;i<max+1;i++){
			if(i%factor==0)count++;
		}
		return count;
	}

}
