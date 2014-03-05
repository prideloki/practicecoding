
public class RaceApproximator {
	public static String timeToBeat(int d1,int t1,int d2,int t2,int raceDistance){
		
		double power=Math.log(t2/(double)t1)*Math.log(d1/(double)raceDistance)/Math.log(d1/(double)d2);
		int totalTime= (int)(t1*Math.exp(power));
		int h=totalTime/3600;
		int m=(totalTime%3600)/60;
		int s=totalTime%3600%60;
		String time	;
		if(m<10&&s<10)time=h+":0"+m+":0"+s;
		else if(m<10)time=h+":0"+m+":"+s;
		else if(s<10)time=h+":"+m+":0"+s;
		else time=h+":"+m+":"+s;
		return time;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d1={800};
		int[]t1={118};
		int[]d2={5000};
		int[]t2={906};
		int[] raceDistance={1500};
		for(int i=0;i<d1.length;i++){
			System.out.println(timeToBeat(d1[i],t1[i],d2[i],t2[i],raceDistance[i]));
		}
	}

}
