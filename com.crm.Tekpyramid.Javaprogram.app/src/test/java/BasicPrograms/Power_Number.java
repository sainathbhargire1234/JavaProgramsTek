package BasicPrograms;

public class Power_Number {

	public static void main(String[] args) {

		int num=3;
		int power=5;
		int prod=1;
		
		for(int i=1;i<=power;i++) {
			prod=prod*num;
		}
		System.out.println(prod);
	}

}
