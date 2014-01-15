//SRM 144 DIV 1 550 pts
public class Lottery {
	public static String[] sortByOdds(String[] rules) {
		String[] names = new String[rules.length];
		double[] result = new double[rules.length];
		if (rules.length == 0)
			return new String[] { "" };
		for (int i = 0; i < rules.length; i++) {
			boolean isSorted;
			boolean isUnique;
			int choices;
			int blank;
			String rule = new String(rules[i]);
			int mark = rule.indexOf(":");
			names[i] = rule.substring(0, mark);
			rule = rule.substring(mark + 2);
			mark = rule.indexOf(" ");
			choices = Integer.parseInt(rule.substring(0, mark));
			rule = rule.substring(mark + 1);
			mark = rule.indexOf(" ");
			blank = Integer.parseInt(rule.substring(0, mark));
			rule = rule.substring(mark + 1);
			mark = rule.indexOf(" ");
			isSorted = (rule.substring(0, mark).equals("T")) ? true : false;
			rule = rule.substring(mark + 1);
			isUnique = (rule.equals("T")) ? true : false;

			if (!isSorted && !isUnique) {
				result[i] = 1.0 / (Math.pow(choices, blank));

			} else if (isSorted && !isUnique) {
				long calc = calc(choices + blank - 1, choices - 1);
				result[i] = 1.0 / (calc / factorial(blank));

			} else if (!isSorted && isUnique) {
				long calc = calc(choices, choices - blank);
				result[i] = 1.0 / (calc);
			} else if (isSorted && isUnique) {
				long calc = calc(choices, choices - blank);
				result[i] = 1.0 / (calc / factorial(blank));

			}

		}
		return sorted(names, result);
	}

	private static long calc(int n, int r) {
		long c = 1;

		for (int i = n; i > r; i--) {
			c *= i;

		}

		return c;
	}

	private static long factorial(int f) {
		long c = 1;
		for (int i = 2; i <= f; i++) {
			c *= i;
		}
		return c;
	}

	public static String[] sorted(String[] names, double[] results) {
		Ticket[] t = new Ticket[names.length];
		for (int i = 0; i < names.length; i++) {
			t[i] = new Ticket(names[i], results[i]);
		}

		mergeSort(t, 0, t.length - 1);

		String[] sortedName = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			sortedName[i] = t[names.length - 1 - i].name;

		}
		return sortedName;
	}

	public static void mergeSort(Ticket[] t, int low, int high) {
		if (low < high) {
			int middle = low + (high - low) / 2;
			mergeSort(t, low, middle);
			mergeSort(t, middle + 1, high);

			merge(t, low, middle, high);
		}
	}

	public static void merge(Ticket[] result, int low, int middle, int high) {
		Ticket[] helper = new Ticket[result.length];
		for (int i = 0; i < result.length; i++) {
			helper[i] = result[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;

		while (i <= middle && j <= high) {
			if (helper[i].prob < helper[j].prob) {
				
				result[k] = helper[i];
				i++;

			} else if(helper[i].prob == helper[j].prob){
				if(helper[i].name.compareTo(helper[j].name)>0){
					result[k] = helper[i];
					i++;
				}else{
					result[k] = helper[j];
					j++;
				}
			} else {
				result[k] = helper[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			result[k] = helper[i];
			k++;
			i++;
		}
	}

	static class Ticket {
		String name;
		double prob;

		public Ticket(String name, double prob) {
			this.name = name;
			this.prob = prob;
		}
	}
}
/*	public static void main(String[] args) {
		String[] rules = { "PICK ANY TWO: 10 2 F F",
				"PICK TWO IN ORDER: 10 2 T F", "PICK TWO DIFFERENT: 10 2 F T",
				"PICK TWO LIMITED: 10 2 T T" };
		String[] rules2 = { "INDIGO: 93 8 T F", "ORANGE: 29 8 F T",
				"VIOLET: 76 6 F F", "BLUE: 100 8 T T", "RED: 99 8 T T",
				"GREEN: 78 6 F T", "YELLOW: 75 6 F F" };

		String[] result = sortByOdds(rules2);
		for (int i = 0; i < rules2.length; i++) {
			System.out.println(result[i]);
		}

	}

}
*/

/*


Problem Statement
    
In most states, gamblers can choose from a wide variety of different lottery games. The rules of a lottery are defined by two integers (choices and blanks) and two boolean variables (sorted and unique). choices represents the highest valid number that you may use on your lottery ticket. (All integers between 1 and choices, inclusive, are valid and can appear on your ticket.) blanks represents the number of spots on your ticket where numbers can be written.
The sorted and unique variables indicate restrictions on the tickets you can create. If sorted is set to true, then the numbers on your ticket must be written in non-descending order. If sorted is set to false, then the numbers may be written in any order. Likewise, if unique is set to true, then each number you write on your ticket must be distinct. If unique is set to false, then repeats are allowed.
Here are some example lottery tickets, where choices = 15 and blanks = 4:
{3, 7, 12, 14} -- this ticket is unconditionally valid.
{13, 4, 1, 9} -- because the numbers are not in nondescending order, this ticket is valid only if sorted = false.
{8, 8, 8, 15} -- because there are repeated numbers, this ticket is valid only if unique = false.
{11, 6, 2, 6} -- this ticket is valid only if sorted = false and unique = false.
Given a list of lotteries and their corresponding rules, return a list of lottery names sorted by how easy they are to win. The probability that you will win a lottery is equal to (1 / (number of valid lottery tickets for that game)). The easiest lottery to win should appear at the front of the list. Ties should be broken alphabetically (see example 1).
Definition
    
Class:
Lottery
Method:
sortByOdds
Parameters:
String[]
Returns:
String[]
Method signature:
String[] sortByOdds(String[] rules)
(be sure your method is public)
Limits
    
Time limit (s):
2.000
Memory limit (MB):
64
Constraints
-
rules will contain between 0 and 50 elements, inclusive.
-
Each element of rules will contain between 11 and 50 characters, inclusive.
-
Each element of rules will be in the format "<NAME>:_<CHOICES>_<BLANKS>_<SORTED>_<UNIQUE>" (quotes for clarity). The underscore character represents exactly one space. The string will have no leading or trailing spaces.
-
<NAME> will contain between 1 and 40 characters, inclusive, and will consist of only uppercase letters ('A'-'Z') and spaces (' '), with no leading or trailing spaces.
-
<CHOICES> will be an integer between 10 and 100, inclusive, with no leading zeroes.
-
<BLANKS> will be an integer between 1 and 8, inclusive, with no leading zeroes.
-
<SORTED> will be either 'T' (true) or 'F' (false).
-
<UNIQUE> will be either 'T' (true) or 'F' (false).
-
No two elements in rules will have the same name.
Examples
0)

    
{"PICK ANY TWO: 10 2 F F"
,"PICK TWO IN ORDER: 10 2 T F"
,"PICK TWO DIFFERENT: 10 2 F T"
,"PICK TWO LIMITED: 10 2 T T"}
Returns: 
{ "PICK TWO LIMITED",
  "PICK TWO IN ORDER",
  "PICK TWO DIFFERENT",
  "PICK ANY TWO" }
The "PICK ANY TWO" game lets either blank be a number from 1 to 10. Therefore, there are 10 * 10 = 100 possible tickets, and your odds of winning are 1/100.
The "PICK TWO IN ORDER" game means that the first number cannot be greater than the second number. This eliminates 45 possible tickets, leaving us with 55 valid ones. The odds of winning are 1/55.
The "PICK TWO DIFFERENT" game only disallows tickets where the first and second numbers are the same. There are 10 such tickets, leaving the odds of winning at 1/90.
Finally, the "PICK TWO LIMITED" game disallows an additional 10 tickets from the 45 disallowed in "PICK TWO IN ORDER". The odds of winning this game are 1/45.
1)

    
{"INDIGO: 93 8 T F",
 "ORANGE: 29 8 F T",
 "VIOLET: 76 6 F F",
 "BLUE: 100 8 T T",
 "RED: 99 8 T T",
 "GREEN: 78 6 F T",
 "YELLOW: 75 6 F F"}
Returns: { "RED",  "ORANGE",  "YELLOW",  "GREEN",  "BLUE",  "INDIGO",  "VIOLET" }
Note that INDIGO and BLUE both have the exact same odds (1/186087894300). BLUE is listed first because it comes before INDIGO alphabetically.
2)

    
{}
Returns: { }
Empty case
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.


*/