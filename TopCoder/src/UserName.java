public class UserName {

	public String newMember(String[] existingNames, String newName) {
		String registerName=newName;
		boolean isUsed=false;
		boolean isValid=false;
		int count=1;
		while(!isValid){
			for(int i=0;i<existingNames.length;i++){
				if(existingNames[i].equals(registerName)){
					isUsed=true;
					break;
				}
			}
			if(isUsed){
				registerName=newName+""+count;
				count++;
				isUsed=false;
				
			}else{
				
				isValid=true;
				
			}
			
		}
		return registerName;
	}
	
}
