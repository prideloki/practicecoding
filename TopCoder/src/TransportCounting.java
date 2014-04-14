public class TransportCounting {

	public int countBuses(int speed, int[] positions, int[] velocities, int time) {
		int count=0;
		int carPosition=speed*time;
		for(int i=0;i<positions.length;i++){
			int busPosition=positions[i]+velocities[i]*time;
			//we go along the bus
			if(positions[i]==0)count++;
			else if(carPosition>=busPosition)count++;
			
		}
		return count;
	}

}
