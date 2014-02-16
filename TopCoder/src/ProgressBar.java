
public class ProgressBar {
	public static String showProgress(int[] taskTimes, int tasksCompleted){
		String progressBar="";
		int totalTime=0;
		int sumOfComplete=0;
		for(int i=0;i<taskTimes.length;i++){
			if(i<tasksCompleted){
				sumOfComplete+=taskTimes[i];
			}
			totalTime+=taskTimes[i];
		}
		int percentIn20=(int)(sumOfComplete*20.0/totalTime);
		for(int i=0;i<20;i++){
			if(i<percentIn20){
				progressBar+="#";
			}else{
				progressBar+=".";
			}
		}
		return progressBar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] taskTimes={{19,6,23,17},{2,3,7,1,4,3},{553,846,816,203,101,120,161,818,315,772},{7,60,468,489,707,499,350,998,1000,716,457,104,597,583,396,862},{419,337,853,513,632,861,336,594,94,367,336,297,966,627,399,433,846,859,80,2}};
		int[] tasksCompleted={3,4,4,2,19};
		for(int i=0;i<tasksCompleted.length;i++){
			System.out.println(showProgress(taskTimes[i],tasksCompleted[i]));
		}
	}

}
