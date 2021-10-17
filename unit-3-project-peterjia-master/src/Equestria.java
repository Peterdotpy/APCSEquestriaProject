import java.lang.Math;

/**
 * Project 3 : Equestria
 * AP Computer Science
 * 
 * @author <Peter Jia>
 */
public class Equestria {

	public static void main(String[] args) {
		double a = 5; // mark and input your value for a
		roadTrip(a); //prints circumfrence
		System.out.println(a);//prints circumfrence
		distance(1,2 ,3 ,4 ); // you can change 4 values to get distance mia
		tour();
		totalTrip(0, 0, 29, 16, 34, 8, 22, 7, 16, 14);//you can change the number
	}
	public static double roadTrip(double a){
		double circum = Math.PI * a;

		return a;

	}
	public static double distance(double x1, double x2, double y1, double y2){
		double distance = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
		System.out.println(distance);
		return distance;
	}
	public static void tour(){
		//city1 feel free to change the number below
		int x1 = 5;
		int y1 = 9;
		//city2 feel free to change the number below
		int x2 = 6;
		int y2 = 1;
		//city 3 feel free to change the number below
		int x3 = 12;
		int y3 = 19;
		System.out.println("The distance from city1 and city2 is " + distance(x1, x2, y1, y2));
		System.out.println("The distance from city2 and city3 is " + distance(x2, x3, y2, y3));
		System.out.println("The distance from city1 and city3 is " + distance(x1, x3, y1, y3));
	}
	public static double totalTrip(double x1, double y1, double x2, double y2, double x3,
								   double y3, double x4, double y4, double x5, double y5 )
	{
		double yesir = 0;
		double distance  = distance(x1, x2, y1, y2);
		double distance1  = distance(x2, x3, y2, y3);
		double distance2 = distance(x3, x4, y3, y4);
		double distance3 = distance(x4, x5, y4, y5);
		double distance4 = distance(x5, x1, y5, y1);
		System.out.println("Distance from start (0,0) to Cloudsdale (29,16) is " + distance);
		System.out.println("Distance from Cloudsdale (29,16) to Twilights (34,8) is " + distance1);
		System.out.println("Distance from Twilights (34,8) to Apple Loosa (22,7) is " + distance2);
		System.out.println("Distance from Apple Loosa (22,7) to Dodge City (16,14) is " + distance3);
		System.out.println("Distance from Dodge City (16,14) to Start (0,0) is " + distance4);
		//prints total trip distance, add all distances
		System.out.println("Total Trip Distance " + (distance + distance1 + distance2 + distance3 + distance4));
		return yesir;
	}

}
