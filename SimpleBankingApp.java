import java.util.*;
class BankAccount 
{
private double balance;
public void deposit(double amount) 
{
if(amount>0) 
{
balance+=amount;
System.out.println("Deposited:"+amount);
} 
else 
{
System.out.println("Invalid deposit amount.");
}
}
public void withdraw(double amount) {
if(amount>balance) 
{
System.out.println("Insufficient balance!");
} 
else if(amount<=0) 
{
System.out.println("Invalid withdrawal amount.");
} 
else 
{
balance-=amount;
System.out.println("Withdrawn:"+amount);
}
}
public void checkBalance() 
{
System.out.println("Current Balance:"+balance);
}
}
public class SimpleBankingApp 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
BankAccount account=new BankAccount();
int choice;
do 
{
System.out.println("\n**** Simple Banking System ****");
System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
System.out.print("Enter your choice:");
choice=sc.nextInt();
switch (choice) 
{
case 1-> 
{
System.out.print("Enter amount to deposit:");
double amount=sc.nextDouble();
account.deposit(amount);
}
case 2 -> 
{
System.out.print("Enter amount to withdraw:");
double amount=sc.nextDouble();
account.withdraw(amount);
}
case 3->account.checkBalance();
case 4->System.out.println("Exiting...");
default->System.out.println("Invalid choice");
}
} 
while (choice!=4);
}
}

