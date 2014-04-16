
public class MovingAverages {

	public int[] calculate(String[] times, int n) {
		int length=times.length-n+1;
		int[] result=new int[length];
		
		for(int i=0;i<length;i++){
			long sum=0;
			for(int j=0;j<n;j++){
				long time=getSeconds(times[i+j]);
				sum+=time;
			}
			result[i]=(int)sum/n;
		}
		
		return result;
	}
	private long getSeconds(String time){
		
		int pos=time.indexOf(":");
		int hour=Integer.parseInt(time.substring(0, pos));
		int minute=Integer.parseInt(time.substring(pos+1, time.lastIndexOf(":")));
		int second=Integer.parseInt(time.substring(time.lastIndexOf(":")+1));
		
		return hour*3600+minute*60+second;
	}
}
