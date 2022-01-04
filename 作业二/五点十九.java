package 作业二;

public class 五点十九 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line =8;
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=line-i;j++)
			System.out.print("    ");
			for(int k=1;k<=i-1;k++)
				System.out.printf("%4d",(int)Math.pow(2, k-1));
			for(int k=i;k>=1;k--)
				System.out.printf("%4d",(int)Math.pow(2, k-1));
			System.out.print("\n");
		}
	}

}
