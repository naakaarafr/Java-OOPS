public class earth{
	public static void main (String[] args){
		  double radiusKm = 6378;


			double conversionFactor = Math.pow(0.621371, 3);


			double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
			double volumeMi3 = volumeKm3 * conversionFactor;


			System.out.printf("The volume of Earth in cubic kilometers is %.2f and in cubic miles is %.2f.%n",volumeKm3, volumeMi3);

	}
}