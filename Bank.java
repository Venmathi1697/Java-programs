public class Bank
{
public static void main(String[] args)
{
Bank cashier = new Bank();
cashier.deposit();       //method calling statement
Bank customer = new Bank();
customer.deposit(500);	//arguments(inputs)
customer.deposit("venmathi");	//string 
}
void deposit(String name)
{
System.out.println(name + "depositing");
}
void deposit(int box)         //method name: deposit
{
System.out.println("Depositing"+box);
}
void deposit()
{
System.out.println("depositing");
}
}