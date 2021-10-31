package Arrays;
import java.util.Scanner;
public class Ary5 {
public static void main(String[] args)
{
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	String name=sc.nextLine();
	int count=0;
	for(int i=0;i<name.length();i++)
	{
	char ch=name.charAt(i);	
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
		count++;
		}
	}
	System.out.println("The number of vowels in my name is "+count );
	
	
	
	
	
}
}
