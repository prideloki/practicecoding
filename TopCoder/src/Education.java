public class Education {

	public int minimize(String desire, int[] tests) {
		int sum=0;
		for(int i=0;i<tests.length;i++){
			sum+=tests[i];
		}
		
		int result=desirePoint(desire)*(tests.length+1)-sum;
		if(result<0)return 0;
		if(result>100)return -1;
		return result;
	}
	private int desirePoint(String d){
		if(d.equals("A"))return 90;
		else if(d.equals("B"))return 80;
		else if(d.equals("C"))return 70;
		else if(d.equals("D"))return 60;
		return -1;
	}
}
