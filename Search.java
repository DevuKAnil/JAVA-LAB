import java.util.Scanner;
public class Search
{
public static void main(String args[])
{
	int i,n,c=0,x;
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
System.out.println("Enter the value for n:");
n=sc.nextInt();
System.out.println("Enter the element:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("\nEnter the element to search:");
x=sc.nextInt();
for(i=0;i<n;i++)
{
if(x==a[i])
{
c=1;
System.out.println("Element found at position:"+(i+1));
break;
}
}

if(c==0)
System.out.println("Element not found");
}
}