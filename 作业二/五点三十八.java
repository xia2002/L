package ��ҵ��;
import java.util.Scanner;

public class �����ʮ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		int y=0,r,i=0;
		while(x>0) {
			r=x%8;
			y+=r*Math.pow(10,i++);
			x/=8;
		}
			System.out.printf("The number in octal is "+y);
	}

}
