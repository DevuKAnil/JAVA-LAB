import java.util.Scanner;
class circle
{
	double area,per;
	void area(int r)
	{
    area=3.14*r*r;
	}
	void perimeter(int r)
	{
    per=2*3.14*r;
	}

    void display()
{
	System.out.println("Area="+area);
        System.out.println("perimeter="+per);
}

}


public class Areap {
public static void main(String args[])
{
	int r;
	Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=sc.nextInt();
        circle a=new circle();
        a.area(r);
        a.perimeter(r);
        a.display();
}
}