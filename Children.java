public class Children extends Parent
{
String name;
public Children(String name)
{
super(name);//new parent(name)
this.name = name;
System.out.println(this.name);
}
public Children()
{
System.out.println("Child constructor");
}
public static void main(String[] args)
{
//Children ch = new Children();
Children ch2 = new Children("kavin");
}
}