
public class StreetParking {
	public static int freeParks(String street){
		int count=0;
		for(int i=0;i<street.length();i++){
			char token=street.charAt(i);
			
			if(token=='B'){
				if(i<2){
					if(street.charAt(i-1)=='-')count-=2;
					if(street.charAt(i-1)!='-')count-=1;
					
				}else if(i>=2){
					if(i>=3&&street.charAt(i-3)=='S'&&street.charAt(i-2)=='-'&&street.charAt(i-1)=='-')count-=4;
					else if(street.charAt(i-1)=='-'&&street.charAt(i-2)=='S')count-=3;
					else if(street.charAt(i-1)=='-'&&street.charAt(i-2)=='-')count-=3;
					else if(street.charAt(i-1)=='-'&&street.charAt(i-2)!='-')count-=2;
					else if(street.charAt(i-1)!='-'&&street.charAt(i-2)!='-')count-=1;
					
					
				}
					
				
			}else if(token=='S'){
				if(i==0)count-=1;
				else if(i>0){
					if(i>=2&&street.charAt(i-1)=='-'&&street.charAt(i-2)=='S')count-=3;
					else if(street.charAt(i-1)=='-')count-=2;
					else if(street.charAt(i-1)!='-')count-=1;
					
				}
			}else if(token=='D'){
				count-=1;
			}else if(token=='-'){
				if(i>0&&street.charAt(i-1)=='S')count-=1;
			}
			
			count++;
		}
		if(count<0)return 0;
		return count;
	}
	public static void main(String[] args) {
		String[] street={"---B--S-D--S--","DDBDDBDDBDD","--S--S--S--S--","SSD-B---BD-DDSB-----S-S--------S-B----BSB-S--B-S-D"};
		for(int i=0;i<street.length;i++){
			System.out.println(freeParks(street[i]));
		}
		
	}

}
