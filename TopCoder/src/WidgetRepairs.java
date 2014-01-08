
public class WidgetRepairs {
	public static int days(int[] arrivals,int numPerDay){
		int days=0;
		for(int i=0;i<arrivals.length;i++){
			//days+=arrivals[i]/numPerDay;
			//if(arrivals[i]%numPerDay!=0)days++;
			
		}
		return days;
	}
	public static void main(String[] args){
		int[][] example={{ 10, 0, 0, 4, 20 },{ 0, 0, 0 },{100, 100},{ 27, 0, 0, 0, 0, 9 },{ 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6 }
};
		int[]days={8,10,10,9,3};
		for(int i=0;i<example.length;i++){
			System.out.println(days(example[i],days[i]));
		}
	}
}
