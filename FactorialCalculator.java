import java.util.*;
public class FactorialCalculator 
{
public static long factorial(int n) 
{
if(n==0||n==1) 
{
return 1; 
} 
else 
{
return n*factorial(n-1); 
}
}
public static void main(String[] args) 
{
Scanner input=new Scanner(System.in);
System.out.print("Enter a number to calculate its factorial:");
if (!input.hasNextInt()) 
{
System.out.println("Invalid input! Please enter a valid number");
return;
}
int number=input.nextInt();
if(number<0) 
{
System.out.println("Factorial is not defined for negative numbers");
} 
else 
{
long result=factorial(number);
System.out.println("Factorial of "+number+" is:"+result);
}
}
}
