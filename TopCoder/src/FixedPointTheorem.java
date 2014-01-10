import java.security.acl.Owner;


public class FixedPointTheorem {
	public static double cycleRange(double R){
		double highest=0.0;
		double lowest=0.0;
		double x=0.25;
		double fx=0.0;
				
		for(int i=0;i<200000;i++){
			fx=R*x*(1-x);
			x=fx;
		}
		lowest=fx;
		highest=fx;
		for(int i=0;i<1000;i++){
			fx=R*x*(1-x);
			if(fx>highest)highest=fx;
			if(fx<lowest)lowest=fx;
			x=fx;
		}
		System.out.println("\th->"+highest);
		System.out.println("\tl->"+lowest);
		return highest-lowest;
	}
	
	public static void main(String[]args){
		double[] examples={0.1,3.05,3.4499,3.55,3.565,3.00005};
		for(int i=0;i<examples.length;i++)System.out.println(cycleRange(examples[i]));
	}
}
