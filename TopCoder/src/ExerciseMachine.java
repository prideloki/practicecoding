
public class ExerciseMachine {
	public static int getPercentages(String time){
		int hour,minutes,second;
		int index=time.indexOf(":");
		hour=Integer.parseInt(time.substring(0,index++));
		minutes=Integer.parseInt(time.substring(index,time.indexOf(":",index)));
		second=Integer.parseInt(time.substring(time.length()-2));
		
		int totaltime=hour*3600+minutes*60+second;
		int workout=totaltime;
		int count=0;
		while(workout>0){
			
			if((workout*100.0/totaltime)==(workout*100/totaltime))count++;
			workout--;
			
		}
		
		return count-1;
	}
}	
	//-1 the first time when workout=totaltime
/*	public static void main(String[] args) {
		String[] time={"00:30:00","00:28:00","23:59:59","00:14:10","00:19:16"};
		//System.out.println(getPercentages("00:28:00"));
		for(int i=0;i<time.length;i++){
			System.out.println(getPercentages(time[i]));
		}
		
	}

}
*/

/*

Problem Statement
    
You are writing firmware for an exercise machine. Each second, a routine in your firmware is called which decides whether it should display the percentage of the workout completed. The display does not have any ability to show decimal points, so the routine should only display a percentage if the second it is called results in a whole percentage of the total workout.
Given a String time representing how long the workout lasts, in the format "hours:minutes:seconds", return the number of times a percentage will be displayed by the routine. The machine should never display 0% or 100%.
Definition
    
Class:
ExerciseMachine
Method:
getPercentages
Parameters:
String
Returns:
int
Method signature:
int getPercentages(String time)
(be sure your method is public)
Limits
    
Time limit (s):
2.000
Memory limit (MB):
64
Constraints
-
time will be a String formatted as "HH:MM:SS", HH = hours, MM = minutes, SS = seconds.
-
The hours portion of time will be an integer with exactly two digits, with a value between 00 and 23, inclusive.
-
The minutes portion of time will be an integer with exactly two digits, with a value between 00 and 59, inclusive.
-
The seconds portion of time will be an integer with exactly two digits, with a value between 00 and 59, inclusive
-
time will not be "00:00:00".
Examples
0)

    
"00:30:00"
Returns: 99
The standard 30 minute workout. Each one percent increment can be displayed every 18 seconds.
1)

    
"00:28:00"
Returns: 19
The 28 minute workout. The user completes 5 percent of the workout every 1 minute, 24 seconds.
2)

    
"23:59:59"
Returns: 0
This is the longest workout possible, given the constraints. No percentages are ever displayed on the screen.
3)

    
"00:14:10"
Returns: 49

4)

    
"00:19:16"
Returns: 3

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.


*/