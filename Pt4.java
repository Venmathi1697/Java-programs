package oct21_21;
//left decreasing triangle
public class Pt4 {
	public static void main(String[] args)
	{
		for(int row=1;row<=10;row++)
		{
			for(int col=10;col>=row;col--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
