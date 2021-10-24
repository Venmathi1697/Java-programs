


 class BBB extends AAA
{
public void methodB()
{
System.out.println("child class method");
}
public static void main(String[] args)
{
BBB obj = new BBB();
obj.methodA();   // calling parent class method
obj.methodB();    //calling local method
}

}