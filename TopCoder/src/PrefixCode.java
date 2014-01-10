public class PrefixCode {
	public static String isOne(String[] words) {
		if (words.length == 1)
			return "Yes";
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[j].indexOf(words[i])==0) {
					if (i != j)
						return "No, " + i;
				}
			}
		}
		return "Yes";
	}
}
/*	public static void main(String[] args) {
		String[][] words = { { "trivial" },
				{ "10001", "011", "100", "001", "10" },
				{ "no", "nosy", "neighbors", "needed" },
				{ "1010", "11", "100", "0", "1011" }, { "No", "not" }
		};
		for(int i=0;i<words.length;i++){
			System.out.println(isOne(words[i]));
		}
	}
}
*/