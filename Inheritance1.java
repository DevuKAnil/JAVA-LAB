import java.util.Scanner;
class Inheritance
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num;
System.out.println("\nEnter the no.of teacher:");
num=sc.nextInt();
teacher teach[]=new teacher[num];
for(int i=0;i<num;i++)
{
      teach[i]=new teacher();
  }
      System.out.println("\nDetails of Teacher");
      for(int i=0;i<num;i++)
      {
      teach[i].disp();
      }
  }
}
class employee
{
int id,salary;
String name,address;
employee()
{
      Scanner sc=new Scanner(System.in);
      System.out.println("\nEmployee No :");
      id=sc.nextInt();
      System.out.println("Employee Name :");
      name=sc.next();
      System.out.println("Address :");
      address=sc.next();
      System.out.println("Salary:");
      salary=sc.nextInt();
}
}
class teacher extends employee
{
String subj,dept;
teacher()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter Subject");
      subj=sc.next();
      System.out.println("Department");
  dept=sc.next();
    }
    void disp()
    {
        System.out.println("\n ID : "+id);
        System.out.println("\n Name : "+name);
        System.out.println("\n Address"+address);
        System.out.println("\n Salary "+salary);
        System.out.println("\n Subject"+subj);
        System.out.println("\n Department "+dept);
      }
}
