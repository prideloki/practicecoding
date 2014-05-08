public class WaiterTipping {

	public int maxPercent(int total, int taxPercent, int money) {
		
		/*
		double x = money - total - Math.floor(total * taxPercent / 100.0);
		double tip = (x * 100.0 / total);
		System.out.println(tip);
		if (tip <= x) {
			if (total+Math.floor(total * taxPercent / 100.0)+Math.floor(tip*total/100.0)== money) {
				return (int) Math.ceil(tip);
			} else {
				System.out.println(">" + tip);
				return (int) Math.floor(tip);
			}

		}
		return -1;
		*/
		
		//brute force
		int tip=0;
		while(total+Math.floor(total*taxPercent/100.0)+Math.floor(total*tip/100.0)<=money){
			tip++;
		}
		System.out.println(tip-1);
		
		return tip-1;
	}

}
