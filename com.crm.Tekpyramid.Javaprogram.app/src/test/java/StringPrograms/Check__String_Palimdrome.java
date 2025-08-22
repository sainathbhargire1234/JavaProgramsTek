package StringPrograms;

public class Check__String_Palimdrome {

	public static void main(String[] args) {
		
		String str="MAM";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("Palimdrone");
		}
		else {
			System.out.println(" Not Palimdrone");
			System.out.println("I...");
			System.out.println(" doller hate");
			System.out.println("aakshu");

		}
		
		
	}

}
