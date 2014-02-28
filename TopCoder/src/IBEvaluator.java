import java.util.Arrays;


public class IBEvaluator {
	public static int[] getSummary(int[] predictedGrades,int[] actualGrades){
		int[] prediction=new int[7];
		for(int i=0;i<predictedGrades.length;i++){
			int diff =(predictedGrades[i]<=actualGrades[i])?actualGrades[i]-predictedGrades[i]:predictedGrades[i]-actualGrades[i];
			
			prediction[diff]++;
		}
		
		for(int i=0;i<prediction.length;i++){
			prediction[i]=prediction[i]*100/predictedGrades.length;
		}
		return prediction;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]predictedGrades={{1,5,7,3},{1,1,1},{3},{1,5,3,5,6,4,2,5,7,6,5,2,3,4,1,4,6,5,4,7,6,6,1}};
		int[][]actualGrades={{3,5,4,5},{5,6,7},{3},{5,1,3,2,6,4,1,7,5,2,7,4,2,6,5,7,3,1,4,6,3,1,7}};
		for(int i=0;i<predictedGrades.length;i++){
			System.out.println(Arrays.toString(getSummary(predictedGrades[i], actualGrades[i])));
		}
	}

}
