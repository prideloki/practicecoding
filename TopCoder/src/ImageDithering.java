
public class ImageDithering {
	public static int count(String dithered,String[] screen){
		int count=0;
		for(int i=0;i<screen.length;i++){
			for(int j=0;j<screen[i].length();j++){
				if(dithered.contains(Character.toString(screen[i].charAt(j))))count++;
			}
		}
		return count;
	}
}	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] screen={"ACBD"};
		String dithered="DCBA";
		System.out.println(count(dithered, screen));
	}

}
*/
