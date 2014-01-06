public class CCipher {
	public static String decode(String cipherText, int shift) {
		String result = "";
		int carryout = shift;
		for (int i = 0; i < cipherText.length(); i++) {
			char c = cipherText.charAt(i);
			c = (char) ((c - shift) % 'Z');
			if (c < 65) {
				--carryout;
				c = (char) ('Z' - carryout);
			}
			result += Character.toString(c);
		}

		return result;
	}

	public static void main(String[] args) {
		String[] text = { "VQREQFGT", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "TOPCODER",
				"ZWBGLZ", "DBNPCBQ", "LIPPSASVPH" };
		int[] shift = { 2, 10, 0, 25, 1, 4 };
		for (int i = 0; i < text.length; i++)
			System.out.println(decode(text[i], shift[i]));
	}
}
