public class CultureShock {

	public String translate(String text) {
		
		StringBuilder translated=new StringBuilder();
		for(int i=0;i<text.length();i++){
			int pos=text.indexOf(" ",i);
			String word;
			if(pos>=0){
				word=text.substring(i,pos);
				if(word.equals("ZEE"))word="ZED";
				translated.append(word);
				translated.append(" ");
				i=pos;
			}else{
				word=text.substring(i);
				if(word.equals("ZEE"))word="ZED";
				translated.append(word);
				break;
			}
		}
		
		return translated.toString();
	}

}
