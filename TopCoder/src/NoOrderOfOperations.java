public class NoOrderOfOperations {

	public int evaluate(String expr) {
		int result = 0;
		String operator="";
		if (expr.length() == 1)
			return Integer.parseInt(expr);
		for (int i = 0; i < expr.length(); i ++) {
			String token = expr.substring(i,i+1);
			if(i%2==0){
				if(i==0){
					result+=Integer.parseInt(token);
				}else{
					if(operator.equals("+")){
						result=result+Integer.parseInt(token);
					}else if(operator.equals("-")){
						result=result-Integer.parseInt(token);
					}else if(operator.equals("*")){
						result=result*Integer.parseInt(token);
					}else {
						System.out.println("error");
					}
				}
			}else{
				operator=token;
			}
			/*switch (operaters.indexOf(expr.substring(j, j + 1))) {
				case 0:
					result += (op1 + op2);
					break;
				case 1:
					result += (op1 - op2);
					break;
				case 2:
					result += (op1 * op2);
					break;
				default:
					System.out.println("error " + op1 + " " + op2 + " "
							+ expr.substring(j, j + 1));
				}
				System.out.println("error " + op1 + " " + op2 + " "
						+ expr.substring(j, j + 1));

			}*/
			
		}
		return result;
	}
}
