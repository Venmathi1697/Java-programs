class Methodoverloading
{
void add()
{
int a=10,b=20,c;
c=a+b;
System.out.println(c);
}
void add(int x,int y)
{
int c;
c=x+y;
System.out.println(c);
}
void add(int x,double y)
{
double c;
c=x+y;
System.out.println(c);
}
public static void main(String[] args)
{
Methodoverloading r = new Methodoverloading();
r.add();
r.add(150,300);
r.add(500,75.5);
}
}