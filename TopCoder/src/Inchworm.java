
public class Inchworm {
	public static int lunchtime(int branch,int rest,int leaf){
		int lcm= (rest*leaf)/gcd(rest,leaf);
		
		return (branch/lcm)+1;
	}
	private static int gcd(int a,int b){
		int temp;
		while(b!=0){
			temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lunchtime(21, 7, 3));
	}

}
