public class Circle{
  private int radius;
  private String color;
  public static final double PI = 3.14;
  
  public Circle(int radius, String color){
    radius = this.radius;
    color = this.color;
  }
  
  public int getRadius(){
    return radius;
  }
  
  public String getColor(){
    return color;
  }
  
  public double getArea(){
    return radius * PI * PI;
  }
  
  public double getCircumference(){
    return radius * 2 * PI;
  }
  
  public String toString(){
    return "Circle with radius " + radius;
  }
}
