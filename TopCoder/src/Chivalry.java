public class Chivalry {

	public String getOrder(String first, String second) {
		String ordered="";

		while(first.length()>0&&second.length()>0){
			
			char f=first.charAt(0);
			char s=second.charAt(0);
			if(f=='W'&&s=='W'){
				ordered+=f;
				first=first.substring(1);
				continue;
			}else if(f=='M'&&s=='W'){
				ordered+=s;
				second=second.substring(1);
				continue;
			}else{
				ordered+=f;
				first=first.substring(1);
			}
		}
		ordered+=first;
		ordered+=second;
		System.out.println(ordered);
		return ordered;
	}
	//TODO tried polphit method
}
