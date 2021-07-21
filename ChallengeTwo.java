package com.Training.Challenge;
class Area{
	public static final double pie = 3.14;
	public static double area(double radius) {

		if(radius<0) {
			return -1.0;
		}
		return 2*pie*radius;
		
	}
	
	public static double area(double x, double y) {
		if(x<0 || y<0) {
			return -1.0;
		}
		return x*y;
	}
}


public class ChallengeTwo {
	public static void main(String[] args) {
		System.out.println(Area.area(5));
		System.out.println(Area.area(10, 10));
		
	}

}












/*
 
 
 Write a method named area with one double parameter named radius. 
The method needs to return a double value that represents the area of a circle.If the parameter radius is negative then return -1.0 to represent an invalid value.
Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
 
 
 */
