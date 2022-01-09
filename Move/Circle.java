public class Circle implements Move{
    private double x, y, r;
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setR(double r) { this.r = r; }
    public double getX() { return  this.x; }
    public double getY() { return  this.y; }
    public double getR() { return this.r; }
    public void MoveUp() { this.y++; }
    public void MoveDown() { this.y--; }
    public void MoveLeft() { this.x--; }
    public void MoveRight() { this.x++; }
    public String toString() { return "(" + this.x + ", " + this.y + "), r = " + this.r; }
}
