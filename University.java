public class University
{
String Institute="Bharathidasan university";
String place="Trichy";
String Name;
int percentage;
public University()
{
Name="venmathi";
percentage=78;
}
public University(String Name,int percentage)
{
this.Name=Name;
this.percentage=percentage;
}
public static void main(String[] args)
{
University u=new University();
University u1=new University("vicky",81);
System.out.println(u.Name);
System.out.println(u.percentage);
System.out.println(u1.Name);
System.out.println(u1.percentage);

}
}

