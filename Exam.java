//parameterised constructor
public class Exam
{
	int num1;
	int num2;
	String name;
	public Exam(int x,int y,String Name)
	{
		num1=x;
		num2=y;
		name=Name;
		
	}
	public int add()
	{
		return (num1+num2);
	}
	public static void main(String[] args)
	{
		Exam e = new Exam(5,10,"venmathi");
		int total = e.add();
		System.out.println(e.name+""+total);
	}
}