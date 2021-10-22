//constructor overloading
public class Studentdata
{
private int ID;
private String Name;
private int Age;
public Studentdata()
{
//default constructor
ID =101;
Name="vicky";
Age=23;
}
Studentdata(int num1,String name,int num2)  //parameterised constructor
{
ID=num1;
Name=name;
Age=num2;
}
//getter and setter methods
public int getID()
{
return ID;
}
public void setID(int ID)
{
this.ID=ID;
}
public String getName()
{
return Name;
}
public void setName(String Name)
{
this.Name=Name;
}
public int getAge()
{
return Age;
}
public void setAge(int Age)
{
this.Age=Age;
}
public static void main(String[] args)
{
//This object creation would call the default constructor
Studentdata s=new Studentdata();
System.out.println("Student name is "+s.getName());
System.out.println("Student Age is "+s.getAge());
System.out.println("Student ID is "+s.getID());

//This object s1 refers to call the parameterised constructor
Studentdata s1=new Studentdata(123,"venmathi",23);
System.out.println("Student name is "+s1.getName());
System.out.println("Student Age is "+s1.getAge());
System.out.println("Student ID is "+s1.getID());
}




}
