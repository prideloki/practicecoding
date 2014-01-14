
public class Quipu {
	public static int readKnots(String knots){
		knots=knots.substring(1,knots.length());
		//don't cut the last '-', there is a case where "-X-------" (1000000) 
		String result="";
		boolean isSeperate=false;
		int count=0;
		int length=knots.length();
		for(int i=0;i<length;i++){
			if(knots.charAt(i)=='X'){
				count++;
				if(i!=length-1&&knots.charAt(i+1)=='-'){
					isSeperate=true;
					result+=count;
					count=0;
				}else if(i==length-1){
					result+=count;
				}
			}else if(knots.charAt(i)=='-'){
				if(!isSeperate){
					result+="0";
				}
				isSeperate=false;
			}
			
		}
		return Integer.parseInt(result);
	}
}
/*
	public static void main(String[] args) {
		System.out.println(readKnots("-X-"));
		
	}

}
*/

/*
 * 
Problem Statement
����
The Incas used a sophisticated system of record keeping consisting of bundles of knotted cords. Such a bundle of cords is called a quipu. Each individual cord represents a single number. Surprisingly, the Incas used a base-10 positional system, just like we do today. Each digit of a number is represented by a cluster of adjacent knots, with spaces between neighboring clusters. The digit is determined by the number of knots in the cluster. For example, the number 243 would be represented by a cord with knots tied in the following pattern
     -XX-XXXX-XXX-
where each uppercase 'X' represents a knot and each '-' represents an unknotted segment of cord (all quotes for clarity only).
Unlike many ancient civilizations, the Incas were aware of the concept of zero, and used it in their quipus. A zero is represented by a cluster containing no knots. For example, the number 204003 would be represented by a cord with knots tied in the following pattern
     -XX--XXXX---XXX-
        ^^    ^^^
        ^^    ^^^
        ^^    two zeros between these three segments
        ^^
        one zero between these two segments
Notice how adjacent dashes signal the presence of a zero.
Your task is to translate a single quipu cord into an integer. The cord will be given as a String knots containing only the characters 'X' and '-'. There will be a single '-' between each cluster of 'X's, as well as a leading '-' and a trailing '-'. The first cluster will not be empty.
Definition
����
Class:
Quipu
Method:
readKnots
Parameters:
String
Returns:
int
Method signature:
int readKnots(String knots)
(be sure your method is public)
Limits
����
Time limit (s):
2.000
Memory limit (MB):
64
Constraints
-
knots contains between 3 and 50 characters, inclusive.
-
knots contains only the characters 'X' and '-'. Note that 'X' is uppercase.
-
The first and last characters of knots are '-'s. The second character is 'X'.
-
knots does not contain 10 consecutive 'X's.
-
knots will represent a number between 1 and 1000000, inclusive.
Examples
0)

����
"-XX-XXXX-XXX-"
Returns: 243
The first example above.
1)

����
"-XX--XXXX---XXX-"
Returns: 204003
The second example above.
2)

����
"-X-"
Returns: 1

3)

����
"-X-------"
Returns: 1000000

4)

����
"-XXXXXXXXX--XXXXXXXXX-XXXXXXXXX-XXXXXXX-XXXXXXXXX-"
Returns: 909979

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.

*/

