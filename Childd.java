public class Childd extends Parentt
{
int i = 200;
static int j = 200;
public static void main(String[] args)
{
Parentt p = new Childd();  //Dynamic Binding
p.watchnews(); 
//p.work();
System.out.println(p.i);
System.out.println(p.j);
p.takerest();
}
public static void walk()
{
System.out.println("Going for a wak-Child");
}
public void work()
{
System.out.println("writing java programs");
}
public void watchnews()
{
System.out.println("Social media");
}
}

