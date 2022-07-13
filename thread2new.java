import java.util.Scanner;
class fib implements Runnable
{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n=sc.nextInt();
        int a=1,b=1,c=(a+b),i;
        System.out.println("Fibonacci numbers : ");
        for(i=1;i<=n;i++)
        {
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }
    }
}

class even implements Runnable
{
    int n;
    Scanner sn=new Scanner(System.in);
    public void run()
    {
        System.out.println("Enter limit for even numbers:");
        n=sn.nextInt();
        System.out.println("Even Numbers:");
        for (int i=1;i<=n;i++) {
            if(i%2==0)
            {
                System.out.print(" "+i);
            }
        }
        System.out.println("\n---------------------");
    }
}

class thread2new
{
    public static void main(String args[])
    {
        fib f=new fib();
        Thread t1=new Thread(f);
        even e=new even();
        Thread t2=new Thread(e);
        t1.start();
        t2.start();
    }
}