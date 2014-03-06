
public class PassingGrade {
	public static int pointsNeeded(int[] pointsEarned,int[]pointsPossible,int finalExam){
		int totalPointsEarned=0;
		int totalPoints=0;
		int totalNeed=0;
		for(int i=0;i<pointsEarned.length;i++){
			totalPoints+=pointsPossible[i];
			totalPointsEarned+=pointsEarned[i];
		}
		totalPoints+=finalExam;
		totalNeed=(int)(((65.0*totalPoints)/100.0)-totalPointsEarned);
		if(totalNeed>finalExam)return -1;
		return totalNeed;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
