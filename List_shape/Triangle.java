public class Triangle extends Shape {
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        super("Hinh tam giac");
        if (a + b < c || b + c < a || a + c < b) {
            this.a = 3;
            this.b = 4;
            this.c = 5;
        }
        else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public void  setC(double c) { this.c = c; }
    public double getA() { return this.a; }
    public double getB() { return this.b; }
    public double getC() { return this.c; }
    public double TinhChuVi() { return (double) Math.round((this.a + this.b + this.c) * 100) / 100; }
    public  double TinhDienTich() {
        double p = TinhChuVi() / 2;
        double result = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        return (double) Math.round(result * 100) / 100;
    }
}
