package Bank.icici.debit;

public class Prime1 {
	public static void main(String[] args)
	{
		int checkprimenumber;
		int n=1;
		int divisiblecount;
		while(n<=100)
		{
			divisiblecount=0;
			checkprimenumber=2;
			while(checkprimenumber<=n/2)
			{
				if(n%checkprimenumber==0)
				{
				divisiblecount++;
				break;
				}
				checkprimenumber++;
			}
			if( divisiblecount==0&&n!=1)
			{
			System.out.print(n+" ");
			}
			n++;
			
		}
		
	}

}
