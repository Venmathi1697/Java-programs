package oct21_21;
//Normal triangle
public class Pt6 {
	public static void main(String[] args)
	{
		for(int row=1;row<=10;row++)
		{
			for(int hid =10;hid>=row;hid--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
	}
}
