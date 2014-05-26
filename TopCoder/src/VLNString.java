public class VLNString {

	public String makeAcronym(String longName) {
		StringBuilder acronym = new StringBuilder();
		acronym.append("");
		for (int i = 0; i < longName.length(); i++) {
			int pos = longName.indexOf(" ", i+1);
			if (pos <= 0) {
				pos = longName.length();
			}
			String sub = longName.substring(i, pos).trim();
			if (!sub.equalsIgnoreCase("the")
					&& !sub.equalsIgnoreCase("of")&&!sub.equals("")&&!sub.equals("and")) {
				acronym.append(sub.substring(0, 1).toUpperCase());
			}
			System.out.println(sub);
			i = pos;
		}
		System.out.println(acronym.toString());
		return acronym.toString();
	}

}
