public class DistanceTime {
	public static void main(String args[]){
		String name="Eric";
		double distChennaiToVellore=156.6;
		int timeChennaiToVellore=4*60+4;
		double distVelloreToBangalore=211.8;
		int timeVelloreToBangalore=4*60+25;
		double totalDistance=distChennaiToVellore+distVelloreToBangalore;
		int totalTime=timeChennaiToVellore+timeVelloreToBangalore;
		System.out.println("The total distance travelled by "+name+" is "+totalDistance+" km and the total time taken is "+totalTime+" minutes.");
	}
}