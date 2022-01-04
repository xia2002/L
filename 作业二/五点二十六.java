package 作业二;
import java.util.Scanner;
public class 五点二十六 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("i = ");
		int i = input.nextInt();
		double e=1.0,mul=1.0;
		for(int j=1;j<=i;j++) {
			mul*=j;
			e=1.0/mul+e;
		}
			System.out.println("e = "+e);
	}

}
