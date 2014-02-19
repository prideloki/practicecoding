
public class ClockWalk {
	public static int finalPosition(String flips){
		int hr=12;
		
		for(int i=0;i<flips.length();i++){
			char c=flips.charAt(i);
			switch(c){
			case 'h':
				hr=(hr+(i+1))%12;
				
				break;
			case 't':
				hr=(hr+(12-i-1))%12;
				break;
			}
			if(hr==0)hr=12;
		}
		return hr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] flips={"hhthh","hhtht","hthth","hthhhhh","hthhthtththhtttthttthhhthtttthh"};
		for(int i=0;i<flips.length;i++){
			System.out.println(finalPosition(flips[i]));
		}
	}

}
