package oct22_21;
import java.util.Scanner;
public class Arraysc1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of subject");
		int count=sc.nextInt();
		int[] marks = new int[count];
		int total=0;
		int highest=0;
		int count2=0;
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter mark");
			marks[i]=sc.nextInt();
			total=total+marks[i];
			if(marks[i]>highest)
			{
				highest=marks[i];
			}
			if(marks[i]>80)
			{
				count2++;
			}
			
			
		}
		System.out.println("Total is"+total);
		System.out.println("Highest is "+highest);
		System.out.println("Above 90 is"+count2++);
		
	}

}
