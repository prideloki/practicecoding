public class SimpleCalculator {
	public static int calculate(String input) {
		char[] op = { '+', '-', '/', '*' };
		int indexOfop = 0;
		for (int i = 0; i < op.length; i++) {
			indexOfop = input.indexOf(op[i]);
			if (indexOfop > 0)
				break;
		}
		int num1 = extractNum(input.substring(0, indexOfop));
		int num2 = extractNum(input.substring(indexOfop + 1));

		switch (input.charAt(indexOfop)) {
		case '+':
			return num1+num2;
		case '-':
			return num1-num2;
		case '*':
			return num1*num2;
		case '/':
			if (num2 == 0)return Integer.MIN_VALUE;
			return num1/num2;
		}
		

		return Integer.MIN_VALUE;
	}

	private static int extractNum(String input) {
		int num = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != '0') {
				num = Integer.parseInt(input.substring(i));
				break;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input={"5/3","15*3","1-10000","17+18","0000000000000018/00000000000000000009","0000100/000000001"};
		for(int i=0;i<input.length;i++){
			System.out.println(calculate(input[i]));
		}
	}

}
