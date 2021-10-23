class Encapsulation1
{
private int value;    //data hiding
public void setvalue(int x)   //data abstraction
{
value=x;
}
	
public int getvalue()
{
return value;
}
}


 class Encapsulation2
{
public static void main(String[] args)
{
Encapsulation1 e = new Encapsulation1();
e.setvalue(100);
System.out.println(e.getvalue());
}
}





  