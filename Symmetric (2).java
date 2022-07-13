import java.util.Scanner;
public class Symmetric
{
public static void main(String args[])
{
int i,j,n,c=0;
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int b[][]=new int[10][10];

System.out.println("Enter the size:");
n=sc.nextInt();

System.out.println("Enter the elements of matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}



for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
	System.out.print(b[i][j]+" ");	
	}
	System.out.println();
}


for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]!=b[i][j])
{
c=1;
break;
}
}
}

if(c==1)
System.out.println("Not Symmetric");

if(c==0)
System.out.println("Symmetric");

}
}