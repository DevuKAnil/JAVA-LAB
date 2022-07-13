import java.util.Scanner;
class shape
{
public void print_shape()
{
 System.out.println("This is a shape");
}
}
class rectangle extends shape
{
 public void print_rectangle()
{
System.out.println("This is a rectangular shape");
}
}
class square extends rectangle
{
public void print_square()
{
System.out.println("Square is a rectangle");
}
}

class circle extends shape
{
public void print_circle()
{
System.out.println("This is a circular shape");
}
}
class shapes
{
public static void main(String args[])
{
square s=new square();
s.print_shape();
s.print_rectangle();
}
}