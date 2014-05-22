public class InsideOut {

	public String unscramble(String line) {
		StringBuilder leftHalf = new StringBuilder(line.length() / 2);
		StringBuilder rightHalf = new StringBuilder(line.length() / 2 + 1);
		
		for (int i = 0; i < line.length(); i++) {
			if (i < line.length() / 2) {
				leftHalf.append(line.charAt((line.length() / 2) - i - 1));
			} else {
				rightHalf.append(line.charAt(line.length() + line.length() / 2
						- i - 1));
			}
		}
		
		return leftHalf.toString() + rightHalf.toString();
	}

}
