package com.MYCODES;

import java.util.Scanner;


public class IfelseCalculation {

    public static void main(String[] args) {
	// write your code here
        Scanner x = new Scanner(System.in);

        System.out.println("Enter Numbers And Operators ");

//if else eligibilty and working......

        double a = x.nextDouble();
        String c =x.next();
        double b = x.nextDouble();

        if (c.equals("+")){
            System.out.println("This is the Solution For "  +a+c+b+" = "+ (a + b));
        }
        else if (c.equals("-")) {
            System.out.println("This is the Solution For "  +a+c+b+" = "+ (a - b));
        }
        else if (c.equals("*")) {
            System.out.println("This is the Solution For " +a+c+b+" = " + (a * b));
        }
        else
            System.out.println("This is the Solution For"  +a+c+b+" = "+ (a / b));
    }
}
