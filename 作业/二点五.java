package 作业;
import java.util.Scanner;
public class 二点五 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer for seconds: ");
		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + " seconds is " + minutes +" minutes and " + remainingSeconds + " seconds");
	}

}
