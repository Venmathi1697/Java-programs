package Fibonacciseries;

public class Fibo3 {
public static void main(String[] args)
{
	int x=-1,y=1;
	int z=1;
	while(z<=10)
	{
	System.out.println((x+y)+ " ");	
	y=x+y;
	x=y-x;
	
	
	z++;
	}
}
}
