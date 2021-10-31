package Arrays;
import java.util.Scanner;
public class Ary4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the month");
int count=sc.nextInt();
int[] month=new int[count];
int average=0;
int total=0;
int high=0;
int low=0;
for(int i=0;i<month.length;i++)
{
	System.out.println("enter the amount");
	month[i]=sc.nextInt();
	total=total+month[i];
	average=total/month.length;
	if(month[i]>high)
	{
		high=month[i];
	}
	if(month[i]<high)
	{
		low=month[i];
	}
}

System.out.println("Total is "+total);
	System.out.println("average is "+average);
	System.out.println("highest amount is "+high);
	System.out.println("lowest amount is "+low);
	}

}
