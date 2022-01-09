public class DoanThang extends Diem{
    private  Diem a, b;
    public DoanThang() { this.a = this.b = new Diem(); }
    public DoanThang(Diem a, Diem b) {
        this.a = new Diem(a);
        this.b = new Diem(b);
    }
    public void setA(Diem a) { this.a = new Diem(a); }
    public void setB(Diem b) { this.b = new Diem(b); }
    public Diem getA() { return new Diem(this.a); }
    public Diem getB() { return new  Diem(this.b); }
    public String toString() { return "[" + this.a.toString() + ", " + this.b.toString() + "]"; }
    public double length() { return Diem.distance(this.a, this.b); }
    public  double midpoint() {return length() / 2; }
    public static boolean parallel(DoanThang d1, DoanThang d2) {
        double left = (d1.a.getX() - d1.b.getX()) / (d1.a.getY() - d1.b.getY());
        double right = (d2.a.getX() - d2.b.getX()) / (d2.a.getY() - d2.b.getY());
        double result_l = (double) Math.round(left * 100) /100, result_r = (double) Math.round(right * 100) / 100;
        return (result_l == result_r) ? true : false;
    }
}
