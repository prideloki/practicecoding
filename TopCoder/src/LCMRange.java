

public class LCMRange {
	public static int lcm(int first, int last) {
		int[] num = new int[last - first + 1];
		int[] prime = { 2, 3, 5, 7, 11 };
		for (int i = 0; i < num.length; i++)
			num[i] = first+i;
		
		int result = 1;
		for (int j = 0; j < prime.length; j++) {
			
			while (true) {
				int times = 0;
				boolean isDividable=false;
				for (int i = 0; i < num.length; i++) {
					if (num[i] % prime[j] == 0) {
						num[i] /= prime[j];
						isDividable=true;
					} else
						times++;
				}
				if(isDividable)result *= prime[j];
				if (times == num.length)
					break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcm(1, 12));
	}

}
