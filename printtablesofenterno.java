package Bank.icici.debit;
import java.util.Scanner;

public class printtablesofenterno {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");//reading a number whose table is to be print
		int num = sc.nextInt();
		//loop starts and executes until the condition becomes false
		for(int i=1;i<=10;i++)
		{
			//print tables of entered no.
			System.out.println(num+"*"+i+"="+num*i);
		}
	}

}
