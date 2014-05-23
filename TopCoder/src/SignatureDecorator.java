public class SignatureDecorator {

	public String applyDecoration(String name, String[] commands,
			String[] decorations) {
		StringBuilder decoredName = new StringBuilder();
		decoredName.append(name);
		for (int i = 0; i < commands.length; i++) {
			String command = commands[i];
			String decoration= decorations[i];
			if (command.equals("surround")) {
				decoredName.insert(0, decoration);
				decoredName.append(reverseString(decoration));
			} else if (command.equals("append")) {
				decoredName.append(decoration);
			} else if (command.equals("prepend")) {
				decoredName.insert(0, decoration);
			}
		}
		
		return decoredName.toString();
	}

	private String reverseString(String t) {
		StringBuilder st = new StringBuilder(t.length());
		st.append(t);
		return st.reverse().toString();
	}
}
