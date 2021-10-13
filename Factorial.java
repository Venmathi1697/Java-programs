package Bank.icici.debit;

public class Factorial 
{
public static void main(String[] args)
{
int count=5;
while(count>=1)
{
	int factorial =1;
	int no =1;
	while(no<=count)
	{
		factorial = factorial*no;
		no++;
	}
	System.out.println(factorial);
	count--;
}
}
}
