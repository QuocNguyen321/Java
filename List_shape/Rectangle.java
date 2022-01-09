public class Rectangle  extends Shape {
    protected double dai, rong;
    public Rectangle(double dai, double rong) {
        super("Hinh Chu Nhat");
        this.dai = dai;
        this.rong = rong;
    }
    public void setDai(double dai) { this.dai = dai; }
    public void setRong(double rong) { this.rong = rong; }
    public double getDai() { return this.dai; }
    public double getRong() { return this.rong; }
    public double TinhChuVi() { return (double) Math.round(((this.dai + this.rong) * 2) * 100) / 100; }
    public double TinhDienTich() { return (double) Math.round((this.dai * this.rong) * 100) / 100; }
}
