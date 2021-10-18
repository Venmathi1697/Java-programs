public class Calculator
{
public static void main(String[] args)
{
Calculator calcobj = new Calculator();
int outcome = calcobj.add(5,55); //method calling statement
calcobj.multiply(outcome);
System.out.println(outcome);
}
	public void multiply(int input)
	{
	System.out.println(input*10);
	}
public int add(int no1, int no2)     //access modifier   -   Encapsulation
{
	no1=15;
	no2=150;
	return no1+no2;

}	
	
}
