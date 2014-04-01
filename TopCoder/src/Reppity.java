public class Reppity {

	public int longestRep(String input) {
		int repTimes=0;
		String longestString="";
		for(int i=0;i<input.length();i++){
			for(int j=i+1;j<input.length();j++){
				String substring=input.substring(i,j);
				
				if(input.indexOf(substring,j)>i){
					if(substring.length()>longestString.length()){
						System.out.println(substring);
						longestString=substring;
						repTimes=longestString.length();		
					}
				}
			}
		}
		System.out.println("longest "+repTimes);
		return repTimes;
	}

}
