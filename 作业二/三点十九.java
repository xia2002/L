package ��ҵ��;
import java.util.Scanner;
public class ����ʮ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter three sides as a triangle: ");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		if(side1+side2>side3 &&side1+side3>side2&&side2+side3>side1)
			System.out.print("perimeter: "+(side1+side2+side3));
		else
			System.out.print("Invild");
	}

}
