public class LeapAge {

	public int getAge(int year, int born) {
		int leapDays=0;
		for(int i=born+1;i<=year;i++){
			if(i%4==0){
				if(i%100==0&&i%400!=0){
					continue;
				}else{
					leapDays++;
				}
			}
		}
		return leapDays;
	}

}
