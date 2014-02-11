
public class StairClimb {
	public static int stridesTaken(int[] flights, int stairsPerStride){
		int numberofStrides = 0;
		for(int i=0;i<flights.length;i++){
			int strides=flights[i]/stairsPerStride;
			if(flights[i]%stairsPerStride!=0)strides++;
			numberofStrides+=strides;
			if(i!=0&&i!=flights.length)numberofStrides+=2;
		}
		return numberofStrides;
	}
	
	public static void main(String[] args){
		int[][] flights={{15},{15,15},{5,11,9,13,8,30,14}};
		int[] stairsPerStride={2,2,3};
		for(int i=0;i<flights.length;i++){
			System.out.println(stridesTaken(flights[i], stairsPerStride[i]));
		}
	}
}

