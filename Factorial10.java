package Bank.icici.debit;

public class Factorial10 {
	public static void main(String[] args)
	{
		int count=10;
		while(count>=1)
		{
			int fact =1;
			int n=1;
			while(n<=count)
			{
				fact=fact*n;
				n++;
			}
			System.out.println(fact);
			count--;
		}
	}

}
