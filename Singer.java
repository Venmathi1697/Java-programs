//static in class
public class Singer
{
static String category = "melody songs";
public static void main(String[] args)
{
String name = "shreyagoshal";
Singer s = new Singer();
s.singing();
System.out.println(name);
System.out.println(category);
}
void singing()
{
System.out.println("singing latest melody song");
}
}

