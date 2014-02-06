
public class Workshop {
	public static int pictureFrames(int[] pieces){
		int count=0;
		if(pieces.length<3)return 0;
		for(int i=0;i<pieces.length;i++){
			for(int j=i+1;j<pieces.length;j++){
				for(int k=j+1;k<pieces.length;k++){
					int d1=pieces[i];
					int d2=pieces[j];
					int d3=pieces[k];
					if(d1+d2>d3){
						if(d2+d3>d1){
							if(d1+d3>d2){
								count++;
							}
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test={{1,2,3,4,5},{8,5,3},{4,23,76,22,87,3,1,99},{10000,9999,9998,9997,9996,1,2,3,4,5},{100}};
		
		for(int i=0;i<test.length;i++){
			System.out.println(pictureFrames(test[i]));
		}
		
	}

}
