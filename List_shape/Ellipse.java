public class Ellipse extends Shape {
    protected double bkTruclon, bkTrucnho;
    public Ellipse(double bkTruclon, double bkTrucnho) {
        super("Hinh Ellipse");
        this.bkTruclon = bkTruclon;
        this.bkTrucnho = bkTrucnho;
    }
    public void setBkTruclon(double bkTruclon) { this.bkTruclon = bkTruclon; }
    public void setBkTrucnho(double bkTrucnho) { this.bkTrucnho = bkTrucnho; }
    public double getBkTruclon() { return this.bkTruclon; }
    public  double getBkTrucnho() { return  this.bkTrucnho; }
    public static double pi = 3.14;
    public double TinhChuVi() {
        double sum = Math.pow(this.bkTruclon, 2) + Math.pow(this.bkTrucnho, 2);
        return (double) Math.round((2 * pi * Math.sqrt(sum / 2)) * 100) / 100;
    }
    public double TinhDienTich() { return (double) Math.round((pi * this.bkTrucnho * this.bkTruclon) * 100) / 100; }
}
