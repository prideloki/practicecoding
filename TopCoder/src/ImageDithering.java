public class ImageDithering {

	public int count(String dithered, String[] screen) {
		int count=0;
		for(int i=0; i<screen.length;i++){
			for(int j=0;j<screen[i].length();j++){
				char pixel=screen[i].charAt(j);
				if(dithered.indexOf(pixel)>=0)count++;
			}
		}
		return count;
	}

}
