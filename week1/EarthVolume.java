public class EarthVolume{
	public static void main(String args[]){
		int radiuskm=6378;
		double volumeKmCube=(4/3)*3.14*Math.pow(radiuskm,3);
		double volumeMilesCube=volumeKmCube*0.62*0.62*0.62;
		System.out.println("The volume of earth in cubic kilometers is "+volumeKmCube+" and cubic miles is "+volumeMilesCube);
	}
}