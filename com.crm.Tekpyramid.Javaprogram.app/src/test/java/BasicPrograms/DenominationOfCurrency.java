package BasicPrograms;

public class DenominationOfCurrency {

	public static void main(String[] args) 
	{
		int num=2100;
		
		int [] notes= {2000,500,200,100,50,20,10,5,2,1};
		
		for(int i=0;i<notes.length;i++)
		{
			int demo=num/notes[i];
			System.out.println(notes[i]+"-"+demo);
			num=num%notes[i];
		}

	}

}
