public class CHILD extends Gp
{
public void methodCgp()
{
System.out.println("son");
System.out.println("daughter");
System.out.println("both are child");
}
public static void main(String[] args)
{
Gp obj1=new Gp();
PARENT obj2=new PARENT();
CHILD obj3=new CHILD();
obj1.methodgp();
obj2.methodpgp();
obj3.methodCgp();
}



}