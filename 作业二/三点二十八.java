package 作业二;
import java.util.Scanner;

public class 三点二十八 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter r1's center x- and y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		System.out.print("Enter r2's center x- and y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();		
		if(x2-w2/2>=x1-w1/2&&x2+w2/2<=x1+w1/2&&y2+h2/2<=y1+h1/2&&y2-h2/2>=y1-h1/2)
			System.out.printf("r2 is inside r1");
		else if(x2-w2/2>=x1+w1/2||x2+w2/2<=x1-w1/2||y2+h2/2<=y1-h1/2||y2-h2/2>=y1+h1/2)
			System.out.printf("r2 does not overlap r1");
		else
			System.out.printf("r2 overlaps r1");	
	}

}
