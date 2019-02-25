public class Rectangle  {
  public int length;
  public int width;

  public Rectangle (int length, int width)
  {
    this.length = length;
    this.width = width;
  }

  public getArea() {
    return width*length;
  }
  public getPerimeter() {
    return 2*(width+length);
  }
}
