package Fibonacciseries;

public class Fibo2 {
	public static void main(String[] args)
	{
		int a=-1,b=1;
		int c=0;
		while(c<=10)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
