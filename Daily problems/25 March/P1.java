// Write a code to reverse a number
import java.util.Scanner;
 class ReverseNumberExample1   
{  
public static void main(String[] args)   
{  
    Scanner sc=new Scanner(System.in);  
System.out.println(" enter a number:");
 int reverse = 0;
int number;
number=sc.nextInt();
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  
