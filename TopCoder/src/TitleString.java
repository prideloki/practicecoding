public class TitleString {

	public String toFirstUpperCase(String title) {
		if (title.length() == 0)
			return "";
		String upperCase = title.substring(0, 1).toUpperCase();
		boolean isTheFirst = false;
		if (title.length() > 1)
			for (int i = 1; i < title.length(); i++) {
				if (title.charAt(i) == ' ') {
					upperCase += title.substring(i, i + 1);
					if(i+1<title.length()&&!title.substring(i+1,i+2).equals(" "))isTheFirst=true;
				} else {
					
					if (isTheFirst) {
						upperCase += title.substring(i, i + 1).toUpperCase();
						isTheFirst = false;
					} else {
						upperCase += title.substring(i, i + 1);
					}
				}
			}
		System.out.println(upperCase);
		return upperCase;
	}

}
