package oct20_21;

public class Patternseries1 
{
public static void main(String[] args)
{
	for(int row=5;row>=1;row--)
	{
		for(int col=1;col<=row-1;col++)
		{
			System.out.print(" "+ " ");
		}
		for(int col=1;col<=6-row;col++)
		{
		System.out.print(col+" ");
		}
		System.out.println();
	}
}

}
