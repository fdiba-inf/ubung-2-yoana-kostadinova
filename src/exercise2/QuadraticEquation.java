package exercise2;

import java.util.Scanner;

public class QuadraticEquation {

  public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.out.println ("Enter a, b and c");

    int a = input.nextInt ();
    int b = input.nextInt ();
    int c = input.nextInt ();

    if (a!=0) {
      int D = b*b-4*a*c;


              if (D>=0); {
              double wurzelD = Math.sqrt(D);
              double x1 = (-b+wurzelD) / 2.0*a; 
              double x2 = (-b-wurzelD) / 2.0*a;
              System.out.println (" x1 = " + x1);
              System.out.println (" x2 = " + x2);
              }  
              else {
              System.out.println ("Imaginary balues");
              }
    }
  

    else if (b!=0) {
    double x = c/b;
    System.out.println ("x = " + x);
    }
    else if (c!=0) {
    System.out.println (" No Values ");
    }
    else {
    System.out.println ("Many values");  
    }
  
    
  }
}