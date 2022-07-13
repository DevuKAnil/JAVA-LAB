import java.util.Scanner;
class sum1
{
	
	int a,b,c;
	void calc(int a,int b)
	{
    c=a+b;
	}
void display()
{
	System.out.println("Sum="+c);
}

}

public class Sum {
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a:");
		a=sc.nextInt();
        System.out.println("Enter the value for b:");
		b=sc.nextInt();
		sum1 ob1=new sum1();
		ob1.calc(a,b);
		ob1.display();
	}
}