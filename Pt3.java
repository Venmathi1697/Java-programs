package oct21_21;
//left increasing triangle
public class Pt3 {
	public static void main(String[] args)
	{
		for(int row=1;row<=10;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
