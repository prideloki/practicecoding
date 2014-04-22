public class bloggoShortcuts {

	public String expand(String text) {
		//_ <i> </i>
		//* <b> </b>
		boolean isFirstI=false;
		boolean isFirstB=false;
		String expanded="";
		for(int i=0;i<text.length();i++){
			char token=text.charAt(i);
			if(token=='_'){
				if(!isFirstI){
					expanded+="<i>";isFirstI=true;
				}else {
					expanded+="</i>";isFirstI=false;
				}
				continue;
			}else if(token=='*'){
				if(!isFirstB){
					expanded+="<b>";isFirstB=true;
				}else {
					expanded+="</b>";isFirstB=false;
				}
				continue;
			}else{
				expanded+=token;
			}
			
		}
		return expanded;
	}

}
