class Circle{
//template to create a Circle

private 

//fields of the circle
int x; // x coord of the center
int y; // y coord of the center
int radius;  //radius of the circle

public Circle(){ //default constructor - initialze all fields
  x=0;
  y=0;
  radius =1;

}

public Circle(int x, int y, int radius){ //custom constructor - initialze all fields
  this.x=x;
  this.y=y;
  this.radius =radius;
}

//to display the radius

public int getRadius(){

return radius;
}

//display x

public int getX(){

return x;
}

//display y

public int getY(){

return y;
}

//use setters to change radius


public void setRadius(int radius){

this.radius=radius;

}

public void setX(int x){

 this.x=x;
 
}

public void setY(int y){

 this.y=y;
 
}

public double getArea(){

return Math.PI*Math.pow(radius,2);

}

public double getCircumference(){

return Math.PI*2*radius;

}

public String toString(){

return "[(" + x+ ","+ y+ "):"+ radius+"]";

}

}