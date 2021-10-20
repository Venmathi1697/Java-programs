package oct20_21;
/*  A
 * B B
 * C C C
 * D D D D 
 * E E E E E  
 */
public class Apattern1  
{
public static void main(String[] args)
{
	char ch ='A';
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<=row;col++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		ch++;
	}
}
}
