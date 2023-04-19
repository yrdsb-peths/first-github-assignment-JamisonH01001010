public class Rectangle(){
  private int width;
  private int height;
  
  public Rectangle(int width, int height){
    width = this.width;
    height = this.height;
  }
  
  public int getWidth(){
    return width;
  }
  
  public int getHeight(){
    return height;
  }
  
  public int getArea(){
    return width * height;
  }
  
  public String toString(){
    return "Rectangle with width " + width + " and height " + height;
  }
}
