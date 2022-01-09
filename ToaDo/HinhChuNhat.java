public class HinhChuNhat {
    private Diem top_left, bottom_right, mid;
    public HinhChuNhat() {
        this.top_left = this.bottom_right = new Diem();
        this.mid = new Diem(top_left.getX(), bottom_right.getY());
    }
    public HinhChuNhat(Diem top_left, Diem bottom_right) {
        this.top_left = new Diem(top_left);
        this.bottom_right = new Diem(bottom_right);
        this.mid = new Diem(top_left.getX(), bottom_right.getY());
    }
    public void setTop_left(Diem top_left) { this.top_left = new Diem(top_left); }
    public void setBottom_right(Diem bottom_right) { this.bottom_right = new Diem(bottom_right);}
    public Diem getTop_left() { return new Diem(this.top_left); }
    public Diem getBottom_right() { return new Diem(this.bottom_right); }
    public double chieudai() { return Diem.distance(top_left, mid); }
    public double chieurong() { return  Diem.distance(bottom_right, mid); }
    public double TinhChuVi() { return (chieudai() + chieurong()) * 2; }
    public double TinhDienTich() { return (double) Math.round((chieudai() * chieurong()) * 100) / 100; }
    public String toString() {
        double d =chieudai(), r = chieurong();
        double the;
        if (d < r) {
            the = d;
            d = r;
            r = the;
        }
        String s = "Thong tin\n";
        s += "+ Chieu dai: " + d + "\n";
        s += "+ Chieu rong: " + r + "\n";
        s += "+ Chu vi: " + TinhChuVi() + "\n";
        s += "+ Dien tich: " + TinhDienTich();
        return s;
    }
}
