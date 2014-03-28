public class GardenHose {

	public int countDead(int n, int rowDist, int colDist, int hoseDist) {
		int deadplants=0;
		for(int row=0;row<n;row++){
			for(int col=0;col<n;col++){
				if((row+1)*rowDist<=hoseDist)continue;
				if((n-row)*rowDist<=hoseDist)continue;
				if((col+1)*colDist<=hoseDist)continue;
				if((n-col)*colDist<=hoseDist)continue;
				deadplants++;
			}
		}
		return deadplants;
	}

}
