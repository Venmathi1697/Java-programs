package Bank.icici.debit;
import java.util.Scanner;

public class Tableswhile {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");	
		//reading a number whose table is to be print
		int num = sc.nextInt();
		System.out.print("Enter range:");
		int range = sc.nextInt();
		int i=1;
		//while loop starts from 1 and execute up to the range
		while(i<=range)
		{
			//print tables of the entered number up to the range
			System.out.println(num+"*"+i+"="+num*i);
			//increment i value by 1
			i++;
		}
		
	}

}
