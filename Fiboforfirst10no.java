package Fibonacciseries;

public class Fiboforfirst10no {
	public static void main(String[] args)
	{
		int a=-1,b=1,i=1;
		int c=0;
		while(i<=10)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
	}

}
