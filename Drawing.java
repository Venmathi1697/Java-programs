//method overriding
class Shape
{
void draw()
{
System.out.println("draw shapes");
}
}
class Square extends Shape
{
void draw()    
{
System.out.println("draw square");
}
}
class Drawing
{
public static void main(String[] args)
{
Shape s = new Square();
s.draw();
}
}