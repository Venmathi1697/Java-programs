public class Mom
{
static int age=25;  //static global variable
public static void main(String[] args)
{

Mom m=new Mom();
m.cooking();
m.Singing();
}
void cooking()
{
System.out.println( age +"cooking for function");
}
void Singing()
{
System.out.println("songs");
}
}