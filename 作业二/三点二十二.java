package 作业二;
import java.util.Scanner;
public class 三点二十二 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double d;
		d=Math.sqrt(x*x+y*y);
		if(d<=10)
			System.out.printf("Point (%.1f, %.1f) is  in the circle",x,y);
		else
			System.out.printf("Point (%.1f, %.1f) is not in the circle",x,y);
	}

}
