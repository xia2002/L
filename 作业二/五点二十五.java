package ��ҵ��;
import java.util.Scanner;
public class ����ʮ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("i = ");
		int i = input.nextInt();
		double pi=0;
		for(int j=1;j<=i;j++) {
			pi+=Math.pow(-1, j+1)/(2*j-1);
		}
			System.out.printf("�� = "+4*pi);
	}

}
