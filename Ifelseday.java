package Bank.icici.debit;

public class Ifelseday {
	public static void main(String[] args)
	{
		int day=4;
		int time=9;
		if(day==4)
		{
		if(time==9)
		{
			System.out.println("Church");
		}
		else {
			System.out.println("Go to office");
		}
		}
		else if(day==5)
		{
			if(time==9)
			{
				System.out.println("mosque");
			}
			else
			{
				System.out.println("Go to office");
			}
		}
	}


}
