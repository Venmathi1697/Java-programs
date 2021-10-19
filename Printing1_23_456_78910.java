package oct19_21;

public class Printing1_23_456_78910
{
	public static void main(String[] args)
	{
		int no=1;;
		for(int row=1;row<=4;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}
}

