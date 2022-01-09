import java.lang.Math;
public class Ellipse {
	protected double bkTrucLon, bkTrucNho;
	protected String ten;
	public Ellipse(double bkTrucLon, double bkTrucNho) {
		this.bkTrucLon = bkTrucLon;
		this.bkTrucNho = bkTrucNho;
	}
	public String setten() { return "Hinh Ellipse"; }
	public void setTrucLon(double bkTrucLon) { this.bkTrucLon = bkTrucLon; }
	public void setTrucNho(double bkTrucNho) { this.bkTrucNho = bkTrucNho; }
	public double getTrucLon() { return this.bkTrucLon; }
	public double getTrucNho() { return this.bkTrucNho; }
	public static double pi = 3.14;
	public double TinhChuVi() {
		double tu = Math.pow(this.bkTrucLon, 2) + Math.pow(this.bkTrucNho, 2);
		double result = 2 * pi * Math.sqrt(tu / 2);
		return (double) Math.round(result * 100) / 100;
	}
	public double TinhDienTich() {
		double result = pi * this.bkTrucLon * this.bkTrucNho;
		return (double) Math.round(result * 100) / 100;
	}
	public String toString() {
		String s = setten() + "\n";
		s += "+ Dien tich: " + TinhDienTich() + "\n";
		s += "+ Chu vi: " + TinhChuVi();
		return s;
	}
}
