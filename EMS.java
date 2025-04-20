import java.util.*;
class Employee 
{
int id;
String name;
double salary;
Employee(int id,String name,double salary) 
{
this.id=id; 
this.name=name; 
this.salary=salary;
}
public void show() 
{
System.out.println(id+"-"+name+"-"+salary);
}
}
public class EMS 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
ArrayList<Employee> list=new ArrayList<>();
int choice;
do 
{
System.out.println("\n1.Add 2.View 3.Update 4.Delete 5.Exit");
choice=sc.nextInt();
if(choice==1) 
{
System.out.print("ID:");
int id=sc.nextInt();
System.out.print("Name:"); 
sc.nextLine();
String name=sc.nextLine();
System.out.print("Salary:"); 
double sal=sc.nextDouble();
list.add(new Employee(id,name,sal));
} 
else if(choice==2) 
{
for(Employee e:list) 
e.show();
} 
else if(choice==3) 
{
System.out.print("ID to update:"); 
int id=sc.nextInt();
for(Employee e:list) 
{
if(e.id==id) 
{
System.out.print("New Name:"); 
sc.nextLine(); 
e.name=sc.nextLine();
System.out.print("New Salary:"); 
e.salary=sc.nextDouble();
break;
}
}
} 
else if(choice==4) 
{
System.out.print("ID to delete:"); 
int id=sc.nextInt();
list.removeIf(e->e.id==id);
}
} 
while(choice!=5);
}
}
