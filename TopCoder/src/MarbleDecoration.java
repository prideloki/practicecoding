import java.util.Arrays;

public class MarbleDecoration {
	
	public int maxLength(int R, int G, int B) {
		int[] rgb={R,G,B};
		//bug {4, 10, 42} = 21 ,{30, 21, 44}=72
		if(rgb[0]<rgb[1]){
			if(rgb[2]<rgb[0])swap(rgb,0,2);
		}else {
			if(rgb[1]<rgb[2])swap(rgb,0,1);
			else swap(rgb, 0, 2);
		}
		
		
		if(rgb[2]<rgb[1])swap(rgb,1,2);
		
		int result;
		if(rgb[1]==rgb[2])result= rgb[1]+rgb[2];
		else if(rgb[1]==0)result=1;
		else	result=rgb[1]+((rgb[1]%2==0)?rgb[2]-2:rgb[2]-1);
		System.out.println(">>"+result);
		return result;
	}
	private void swap(int[] d,int a,int b){
		int temp=d[a];
		d[a]=d[b];
		d[b]=temp;
	}
}
