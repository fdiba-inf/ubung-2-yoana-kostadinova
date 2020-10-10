package exercise2;

import java.util.Scanner;

public class SumOfDigits {

  public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.out.print ("Enter a number between 0 and 999: ");

    int number = input.nextInt ();
    int a = number/100;
    int b = (number/10)%10;
    int c = number%10;
    int abc = a+b+c;

    System.out.println (abc);
  
    }
}