import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, fromCity, viaCity, toCity;
        double fromToVia, viaToFinalCity, timeFromToVia, timeViaToFinalCity, totalDistance, distKm, totalTime;
        System.out.println("Enter name");
        name = input.nextLine();
        System.out.println("Enter the city from where travel begins");
        fromCity = input.nextLine();
        System.out.println("Enter the city via which travel occurs");
        viaCity = input.nextLine();
        System.out.println("Enter the city where travel ends");
        toCity = input.nextLine();
        System.out.println("Enter the distance in miles from starting city to via city");
        fromToVia = input.nextDouble();
        System.out.println("Enter the distance in miles from via city to final city");
        viaToFinalCity = input.nextDouble();
        System.out.println("Enter the time in minutes from starting city to via city");
        timeFromToVia = input.nextDouble();
        System.out.println("Enter the time in minutes from via city to final city");
        timeViaToFinalCity = input.nextDouble();
        totalDistance = fromToVia + viaToFinalCity;
        distKm = totalDistance * 1.60934;
        totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The total distance travelled by " + name +" from " + fromCity +" to " + toCity +" via " + viaCity + " is " + distKm +" km and the total time taken is " + totalTime +" minutes");
    }
}