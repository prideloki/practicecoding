
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
		totalNeed=(int) (Math.ceil((65.0*totalPoints)/100.0)-totalPointsEarned);
		if(totalNeed<0)return 0;
		if(totalNeed>finalExam)return -1;
		return totalNeed;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] pointsEarned={{55,77,82,60},{ 1, 2, 3, 4 },{ 1, 2, 2, 1 },{ 7, 8, 7, 6 },{ 17, 23, 50, 200, 19, 56, 83, 91, 77, 9, 0 },{600,600,600,600,600,600,600,600,600,600,
			 600,600,600,600,600,600,600,600,600,600}};
		int[][] pointsPossible={{100,100,100,100},{ 2, 3, 4, 5 },{ 9, 9, 9, 9 },{ 8, 8, 8, 8 },{ 20, 30, 50, 250, 20, 70, 100, 100, 100, 10, 10 },{1000,1000,1000,1000,1000,1000,1000,1000,
			 1000,1000,1000,1000,1000,1000,1000,1000,
			 1000,1000,1000,901}};
		int[] finalExam={300,7,9,9,400,3000};
		for(int i=0;i<pointsEarned.length;i++){
			System.out.println(pointsNeeded(pointsEarned[i], pointsPossible[i], finalExam[i]));
		}
	}

}
