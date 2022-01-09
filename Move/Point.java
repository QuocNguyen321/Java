public class Point implements Move{
    private double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public double getX() { return  this.x; }
    public double getY() { return  this.y; }
    public void MoveUp() { this.y++; }
    public void MoveDown() { this.y--; }
    public void MoveLeft() { this.x--; }
    public void MoveRight() { this.x++; }
    public String toString() { return "(" + this.x + ", " + this.y + ")"; }
}
