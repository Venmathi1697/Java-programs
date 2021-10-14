package Bank.icici.debit;

public class Print2_6_12_20_30 {
	public static void main(String[] args)
	{
		Print2_6_12_20_30 print = new Print2_6_12_20_30();
		print.printing();
	}
	void printing()
	{
		int g=2,h=4;
		while(g<=30)
		{
			System.out.print(g+ " ");
			g=g+h;
			h=h+2;
			
		}
	}
	

}
