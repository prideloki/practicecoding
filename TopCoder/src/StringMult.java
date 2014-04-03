public class StringMult {

	public String times(String sFactor, int iFactor) {
		if (iFactor == 0)
			return "";
		if (sFactor.equals(""))
			return "";

		if (iFactor < 0) {
			String reversed = "";
			for (int i = sFactor.length() - 1; i >= 0; i--) {
				reversed += sFactor.charAt(i);
			}
			sFactor = reversed;
		}

		StringBuilder s = new StringBuilder();
		for (int i = 0; i < Math.abs(iFactor); i++) {
			s.append(sFactor);
		}
		return s.toString();
	}

}
