class CircleMain{
public static void main(String[] args){
   Circle circleOne = new Circle();
   Circle circleTwo = new Circle(-5,-6,9);
   
   System.out.println(circleOne.toString());
   System.out.println(circleTwo.toString());
   //display area of circle one
   double circleOneArea= circleOne.getArea();
   System.out.println("The area of Circle one = " + circleOneArea);
   //display area of circle two
   double circleTwoArea= circleTwo.getArea();
   System.out.println("The area of Circle two = " + circleTwoArea);
   //display circumference of circle one
   double circleOneCircumference= circleOne.getCircumference();
   System.out.println("The circumference of Circle one = " + circleOneCircumference);
   //display circumference of circle two
   double circleTwoCircumference= circleTwo.getCircumference();
   System.out.println("The circumference of Circle two = " + circleTwoCircumference);
   //find the X of circle one
   int circleOneX = circleOne.getX();
   System.out.println("The X coordinate of circle one is " + circleOneX);
   //find the Y of circle one
   int circleOneY = circleOne.getY();
   System.out.println("The Y coordinate of circle one is " + circleOneY);
   //find the X of circle two
   int circleTwoX = circleTwo.getX();
   System.out.println("The X coordinate of circle two is " + circleTwoX);
   //find the Y of circle two
   int circleTwoY = circleTwo.getY();
   System.out.println("The Y coordinate of circle two is " + circleTwoY);
   
   //change the center of circleOne
   circleOne.setX(4);
   circleTwo.setY(5);
   //change radius of circleTwo
   circleTwo.setRadius(11);
   //display both circle using toString
   System.out.println(circleOne.toString());
   System.out.println(circleTwo.toString());
}
}