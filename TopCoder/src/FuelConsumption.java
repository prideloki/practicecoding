public class FuelConsumption {

	public double maximalDistance(int[] velocities, int[] consumptions, int fuel) {
		double maxDistance=0.0;
		for(int i=0;i<velocities.length;i++){
			double distance=(double)velocities[i]/consumptions[i]*fuel;
			if(distance>maxDistance)maxDistance=distance;
		}
		return maxDistance;
	}

}
