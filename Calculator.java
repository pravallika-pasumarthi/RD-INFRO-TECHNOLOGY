import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.lang.Math;
public class Calculator
{
 public static void main(String args[])
 {
  double number1,number2;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the first number:");
  number1=sc.nextDouble();
  System.out.println("Enter the second number:");
  number2=sc.nextDouble();
  System.out.println("Enter Operator (+,-,*,/,%):");
  char operation = sc.next().charAt(0);
  double op =0;
  switch(operation)
  {
    case '+':
         op = number1+number2;
         break;
    case '-':
         op = number1-number2;
         break;
    case '*':
         op = number1*number2;
         break;
    case '/':
         if(number2 ==0)
         {
            System.out.println("Error! Division by Zero");
          }
         op = number1/number2;
         break;
    case '%':
         if(number2==0)
         {
           System.out.println("Error! Modulus by Zero");
        }
         
         op = number1%number2;
         break;
   default:
        System.out.println("Invalid Input");
  }
  System.out.println("The result is :");
  System.out.println();
  System.out.println(number1 + "  " + operation + " " + number2 + " =" + op );
  sc.close();
}
}
  
  