import java.util.Arrays;


public class RGBColor {
	public static int[] getComplement(int[] rgb){
		int[] complements=new int[3];
		boolean isComplement=false;
		for(int i=0;i<rgb.length;i++){
			int complement=255-rgb[i];
			complements[i]=Math.abs(complement-rgb[i]);
			if(complements[i]>32)isComplement=true;
		}
		for(int i=0;i<rgb.length;i++){
			complements[i]=(isComplement)?255-rgb[i]:(rgb[i]+128)%256;
		}
		return complements;
	}
	
	public static void main(String[] args) {
		
		int[][] rgb={{255,0,0},{115,115,143},{115,115,144},{153,12,55}};
		for(int i=0;i<rgb.length;i++){
			System.out.println(Arrays.toString(getComplement(rgb[i])));
		}
	}

}
