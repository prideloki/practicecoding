import java.util.Arrays;

public class EqualSubstrings {

	public String[] getSubstrings(String str) {
		/*
		 * String[] equalSubString=new String[2]; int numOfa=0; int numOfb=0;
		 * int equalPos=-1; for(int i=0;i<str.length();i++){ char
		 * token=str.charAt(i); switch(token){ case 'a': numOfa++; break; case
		 * 'b': numOfb++; break; } if(numOfa==numOfb)equalPos=i; }
		 * if(equalPos==str.length()-1){
		 * equalSubString[0]=str.substring(0,str.length()/2);
		 * equalSubString[1]=str.substring(str.length()/2); }else
		 * if(equalPos==-1){ if(str.contains("a")){ equalSubString[0]="";
		 * equalSubString[1]=str; }else{ equalSubString[0]=str;
		 * equalSubString[1]=""; } }else {
		 * equalSubString[0]=str.substring(0,equalPos+1);
		 * equalSubString[1]=str.substring(equalPos+1); }
		 * 
		 * 
		 * System.out.println(Arrays.toString(equalSubString));
		 * 
		 * return equalSubString;
		 */
		String a = "", b = str;

		for (int i = 0; i <= str.length(); i++) {
			String nA = str.substring(0, i), nB = str.substring(i);
			if (count(nA, 'a') == count(nB, 'b')) {
				a = nA;
				b = nB;
				System.out.println(i);
			}
			System.out.println(nA+" "+nB);
		}
		return new String[] { a, b };
	}

	private int count(String s, char c) {
		int ans = 0;
		for (char token : s.toCharArray()) {
			if (token == c) {
				ans++;
			}
		}
		return ans;
	}
}
