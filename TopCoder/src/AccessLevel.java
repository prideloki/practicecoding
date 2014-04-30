public class AccessLevel {

	public String canAccess(int[] rights, int minPermission) {
		StringBuilder permission=new StringBuilder(rights.length);
		for(int i=0;i<rights.length;i++){
			if(rights[i]>=minPermission){
				permission.append("A");
			}
			else {
				permission.append("D");
			}
		}
		return permission.toString();
	}

}
