public class Airlines
{
int ticketno;
String Passengername;
public Airlines()
{
ticketno=19;
Passengername="venmathi";
}
public Airlines(int no,String name)
{
ticketno=no;
Passengername=name;
}
public static void main(String[] args)
{
Airlines obj1=new Airlines();
Airlines obj2=new Airlines(17,"vicky");
System.out.println("Passenger name is "+obj1. Passengername);
System.out.println("Ticket no is "+obj1.ticketno);
System.out.println("Passenger name is "+obj2. Passengername);
System.out.println("Ticket no is "+obj2.ticketno);



}
}