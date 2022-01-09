public class Rectangle implements Move{
    private double x, y, a, b;
    public Rectangle(double x, double y, double a, double b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public double getX() { return  this.x; }
    public double getY() { return  this.y; }
    public double getA() { return this.a; }
    public double getB() { return  this.b; }
    public void MoveUp() { this.y++; }
    public void MoveDown() { this.y--; }
    public void MoveLeft() { this.x--; }
    public void MoveRight() { this.x++; }
    public String toString() { return "(" + this.x + ", " + this.y + "), d = " + this.a + ", r = " + this.b; }
}
