package Arraydimension;
import java.util.Scanner;
public class Arydimension1
{
public static void main(String[] args)
{
	int[][] marks=new int[2][5];
	Scanner sc =new Scanner(System.in);
	for(int row=0;row<marks.length;row++)
	{
		for(int col=0;col<marks[row].length;col++)
		{
			System.out.println("Enter the marks");
			marks[row][col]= sc.nextInt();
		}
	}
	//int total=0; overall total
	for(int row=0;row<marks.length;row++)
	{
		int total=0;
		
	for(int col=0;col<marks[row].length;col++)	
	{
	total=total+marks[row][col];
		System.out.print(marks[row][col] +" ");
		
	}
	System.out.println("Total "+total);
	System.out.println();
	
	}
	

}
}
