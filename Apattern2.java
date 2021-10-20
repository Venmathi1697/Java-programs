package oct20_21;

public class Apattern2
{
	public static void main(String[] args)
	{
		char ch ='A';
		for(int row=1;row<=5;row++)
		{
			
			ch='A';
			for(int col=1;col<=row;col++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
		}
	}
}
