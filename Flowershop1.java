public class Flowershop1
{
int price;
int kg;
static String flowername="Jasmine";
String customername;

public Flowershop1()
{
price=100;
kg=1;
flowername="Rose";
customername="Ram";
}
public Flowershop1(int x,int y,String z)
{
flowername=z;
price=x;
kg=y;
}
public Flowershop1(int a,int b,String name1,String name2)
{
price=a;
kg=b;
customername=name1;
flowername=name2;	
}	
	
public static void main(String[] args)
{
Flowershop1 f1=new Flowershop1();
Flowershop1 f2=new Flowershop1(150,2,"Daisy");
Flowershop1 f3=new Flowershop1(350,3,"venmathi","Jasmine");
System.out.println(f1.price);
System.out.println(f1.kg);
System.out.println(f1.flowername);
System.out.println(f1.customername);		
System.out.println(f2.flowername);
System.out.println(f2.price);
System.out.println(f2.kg);
System.out.println(f3.price);		
System.out.println(f3.kg);
System.out.println(f3.customername);
System.out.println(f3.flowername);		
						
}		
	


}