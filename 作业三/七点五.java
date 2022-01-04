package 作业三;
import java.util.Scanner;
public class 七点五 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int a[]=new int[10];
		int sum=0,n=10;
		for(int i = 0;i<n;i++) {
			a[i]=input.nextInt();
			for(int j = 0;j<i;j++) {
				if(a[i]==a[j]) {
					i--;
					n--;
					sum++;
					break;
				}
				
			}
		}
		System.out.println("The number of distinct number is "+(10-sum));
		System.out.print("The distinct number are : ");
		for(int i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	
	}

}
