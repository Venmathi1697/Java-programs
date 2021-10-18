public class Child 
{
public Child()
{
System.out.println("Welcome to our shop");
}
public Child(int price)
{
	this();
System.out.println("your price is" + price);
}
public static void main(String[] args)
{
Child ch = new Child(100);
}
}
