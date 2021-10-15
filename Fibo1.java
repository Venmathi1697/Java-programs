package Fibonacciseries;

public class Fibo1 {
public static void main(String[] args)
{
	

	{
	int f=-1,s=1,i=1;
	//int t=0;
	while(i<=10)
	{
		//t=f+s;
		System.out.print((f+s)+" ");
		
		s=f+s;
		f=s-f;
		i++;
	}
	
	}
        
		
}
}
