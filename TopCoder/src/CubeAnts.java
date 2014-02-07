
public class CubeAnts {
	public static int getMinimumSteps(int[] pos){
		int[][] steps={{0},{1},{2},{1},{1},{2},{3},{2}};
		int maxStep=0;
		for(int i=0;i<pos.length;i++){
			int temp=steps[pos[i]][0];
			
			if(temp>=maxStep)maxStep=temp;
		}
		return maxStep;
	}
	
	public static void main(String[] args){
		int[][] pos={{0,1,1},{5,4},{0},{6,1,6},{7,7,3,3,7,7,3,3}};
		for(int i=0;i<pos.length;i++)System.out.println(getMinimumSteps(pos[i]));
	}
}
