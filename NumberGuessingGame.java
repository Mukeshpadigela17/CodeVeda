import java.util.*;
public class NumberGuessingGame 
{
public static void main(String[] args) 
{
Random rand=new Random();
Scanner input=new Scanner(System.in);
int secretNumber=rand.nextInt(100)+1; 
int guess;
int attempts=0;
int maxAttempts=5;
System.out.println("Welcome to the Number Guessing Game!");
System.out.println("Guess a number between 1 and 100. You have"+maxAttempts+"attempts");
while(attempts<maxAttempts) 
{
System.out.print("Enter your guess:");
if(!input.hasNextInt()) 
{
System.out.println("Invalid input! Please enter a number");
input.next(); 
continue;
}
guess=input.nextInt();
attempts++;
if(guess==secretNumber) 
{
System.out.println("Congratulations! You guessed the number in"+attempts+"attempts.");
break;
} 
else if(guess<secretNumber) 
{
System.out.println("Too low!");
}
else 
{
System.out.println("Too high!");
}
if(attempts==maxAttempts) 
{
System.out.println("You've run out of attempts! The number was:"+secretNumber);
}
}
}
}
