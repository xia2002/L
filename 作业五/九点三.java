package 作业五;

public class 九点三 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long seconds = 10000;
		for(int i=0;i<8;i++){
			java.util.Date date = new java.util.Date(seconds);
			System.out.println(date.toString());
			seconds *= 10;
		}
	}

}
