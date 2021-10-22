//constructor overloading without getter setter methods

public class Railways
{
private int ticketno;
String Passengername;
public Railways()
{
ticketno=19;
Passengername="venmathi";
}
public Railways(int no,String name)
{
ticketno=no;
Passengername=name;
}
public static void main(String[] args)
{
Railways obj1=new Railways();
Railways obj2=new Railways(17,"vicky");
System.out.println("Passenger name is "+obj1. Passengername);
System.out.println("Ticket no is "+obj1.ticketno);
System.out.println("Passenger name is "+obj2. Passengername);
System.out.println("Ticket no is "+obj2.ticketno);



}
}