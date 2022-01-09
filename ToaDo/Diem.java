import java.lang.Math;
public class Diem {
    private double x, y;
    public Diem() { this.x = this.y = 0; }
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Diem(Diem p) {
        this.x = p.x;
        this.y = p.y;
    }
    public void setX(double x) { this.x = 0; }
    public void setY(double y) { this.y = 0; }
    public double getX() { return this.x; }
    public double getY() { return this.y; }
    public String toString() { return "( " + this.x + ", " + this.y + ")"; }
    public static double distance(Diem a, Diem b) {
        double diem_x = Math.pow(b.x - a.x, 2);
        double diem_y = Math.pow(b.y - a.y, 2);
        double result = Math.sqrt(diem_x + diem_y);
        // trả về kết quả có 2 chữ số thập phân
        return (double) Math.round(result * 100) / 100;
    }

}
