//polymorphism example
public class Shapes
{
public static void main(String[] args)
{
Shapes myshape = new Shapes();
Shapes myTriangle = new Triangle();
Shapes mycircle = new Circle();
myshape.area();
myTriangle.area();
myshape.area();
mycircle.area();
}
public void area()
{
System.out.println("The area of  ");
}
}
class Triangle extends Shapes
{
public void area()
{
System.out.println("Triangle is 1/2 *base*height ");
}
}
class Circle extends Shapes
{
public void area()
{
System.out.println(" Circle is 3.14 *radius*radius ");
}
}