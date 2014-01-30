public class StreetParking {
	public static int freeParks2(String street) {
		int count = 0;
		for (int i = 0; i < street.length(); i++) {
			char token = street.charAt(i);
			char prev;
			if (token == 'B') {
				if (i == 0)
					count -= 1;
				else if (i < 2) {
					prev = street.charAt(i - 1);
					if (prev == '-')
						count -= 2;
					if (prev != '-')
						count -= 1;

				} else if (i >= 2) {
					prev = street.charAt(i - 1);
					char prevprev = street.charAt(i - 2);
					if (prev == '-' && prevprev == '-') {
						if (i >= 3 && street.charAt(i - 3) == 'S')
							count -= 2;
						else
							count -= 3;
					} else if (prev == '-' && prevprev != '-') {
						if (prevprev == 'S')
							count -= 1;
						else
							count -= 2;
					} else if (prev != '-' && prevprev != '-')
						count -= 1;

				}

			} else if (token == 'S') {
				if (i == 0)
					count -= 1;
				else if (i > 0) {
					prev = street.charAt(i - 1);
					if (i >= 2 && prev == '-' && street.charAt(i - 2) == 'S') {
						count -= 1;
					} else {
						if (prev == '-')
							count -= 2;
						else if (prev != '-')
							count -= 1;
					}
				}
			} else if (token == 'D') {
				count -= 1;
			} else if (token == '-') {
				if (i > 0 && street.charAt(i - 1) == 'S')
					count -= 1;
			}

			count++;
		}
		if (count < 0)
			return 0;
		return count;
	}
	public static int freeParks(String street){
		boolean []occupied=new boolean[street.length()];
		int ans=0;
		for(int i=0;i<street.length();i++){
			char token=street.charAt(i);
			if('B'==token){
				occupied[i]=true;
				if(i>0)occupied[i-1]=true;
				if(i>1)occupied[i-2]=true;
			}else if('S'==token){
				occupied[i]=true;
				if(i>0)occupied[i-1]=true;
				if(i<street.length()-1)occupied[i+1]=true;
			}else if('D'==token){
				occupied[i]=true;
			}
			
		}
		for(int i=0;i<street.length();i++){
			if(occupied[i]!=true)ans++;
		}
		
		return ans;
	}
	//hint from user wan23
	public static void main(String[] args) {
		String[] street = { "---B--S-D--S--", "DDBDDBDDBDD", "--S--S--S--S--",
				"SSD-B---BD-DDSB-----S-S--------S-B----BSB-S--B-S-D" };
		String test = "--S-B----BSB-S--B-S-D";

		for (int i = 0; i < street.length; i++) {
			System.out.println(freeParks(street[i]));
		}


	}

}
