
public class Substitute {
	public static int getValue(String key,String code){
		String value="";
		for(int i=0;i<code.length();i++){
			String token=code.substring(i, i+1);
			if(key.contains(token)){
				int index=key.indexOf(token)+1;
				if(index==10)index=0;
				value+=index+"";
			}
		}
		return Integer.parseInt(value);
	}
	
	public static void main(String[] args) {
		String[] key={"TRADINGFEW","ABCDEFGHIJ","CRYSTALBUM"};
		String[] code={"LGXWEV","XJ","MMA"};		
		for(int i=0;i<key.length;i++){
			System.out.println(getValue(key[i], code[i]));
		
		}
	}

}
