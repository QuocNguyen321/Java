public abstract class Shape {
    protected String name;
    public Shape(String name) { this.name = name; }
    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }
    public abstract double TinhChuVi();
    public abstract double TinhDienTich();
    public String toString() {
        String s = getName() + "\n";
        s += "+ Chu vi: " + TinhChuVi() + "\n";
        s += "+ Dien tich: " + TinhDienTich();
        return s;
    }
}
