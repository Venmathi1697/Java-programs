public class DDD extends CCC
{
public void methodD()
{
System.out.println("Single inheritance contains one parent one child");
System.out.println("Multiple inheritance does not exits in java");
System.out.println("multilevel contains one parent and two or more child");
}
public static void main(String[] args)
{
DDD obj=new DDD();
obj.methodc();     //calling super class method



}


}