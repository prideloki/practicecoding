import java.util.ArrayList;
import java.util.List;

public class Chivalry {

	public String getOrder2(String first, String second) {
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
	public String getOrder(String first, String second) {
		List<Character> ordered=new ArrayList<Character>();
		int i=0;
		int j=0;
		while(i<first.length()&&j<second.length()){
			char f=first.charAt(i);
			char s=second.charAt(j);
			if(f==s){
				ordered.add(f);
				i++;
			}else{
				if(f=='W'){
					ordered.add(f);
					i++;
				}else{
					ordered.add(s);
					j++;
				}
			}
		}
		while(i<first.length()){
			ordered.add(first.charAt(i));
			i++;
		}
		while(j<second.length()){
			ordered.add(second.charAt(j));
			j++;
		}
		StringBuilder stringBuilder=new StringBuilder(ordered.size());
		for(int k=0;k<ordered.size();k++){
			stringBuilder.append(ordered.get(k));
		}
		return stringBuilder.toString();
	}
}
