package com.mccoy;

//Short Program to illustrate the calculation of a formula in java, using
//variables and arithmetic expressions.
public class Circle {

public static void main(String[] args) {

 final double PI = 3.14159;

 // Calculate area of circle.
 int radius = 30;
 double area = PI*radius*radius;

 // Print out area.
 System.out.print("The area of a circle with radius "+radius);
 System.out.println(" is "+area);
}
}