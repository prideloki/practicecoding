public class TextCompressor {

	public String longestRepeat(String sourceText) {
		String substring = "";
		/*
		 * int count = 0; for (int i = 0; i < sourceText.length(); i++) { String
		 * sub = sourceText.substring(i); int c = count(sub, sourceText); if
		 * (c>count) { if (sub.length()>substring.length()) { count = c;
		 * substring = sub; } } } System.out.println();
		 * System.out.println(substring);
		 */
		for (int i = sourceText.length() / 2; i > 0; i--) {
			for (int j = 0; j < sourceText.length() - i; j++) {
				System.out.println(i+" "+j);
				if (sourceText.indexOf(sourceText.substring(j, j + i), j + i) > 0)
					return sourceText.substring(j, j + i);
			}
		}
		return "";

	}

	private int count(String substring, String sourceText) {
		int count = 0;
		for (int i = 0; i < sourceText.length(); i++) {
			int pos = sourceText.indexOf(substring, i);
			if (pos >= 0) {
				count++;
				i = pos + substring.length() - 1;
			}
		}
		return count;
	}

}
