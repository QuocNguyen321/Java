public class PhanSo {
    private int tu, mau;

    public PhanSo() {
        tu = 0;
        mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
        if (mau == 0) {
            this.mau = 1;
        }
    }
    public PhanSo(PhanSo ps) {
        this.tu = ps.tu;
        this.mau = ps.mau;
    }
    public static int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return UCLN(b, a % b);
        }
    }

    public void set_Tu(int tu) {
        this.tu = tu;
    }

    public void set_Mau(int mau) {
        this.mau = mau;
    }

    public int get_Tu() {
        return this.tu;
    }

    public int get_Mau() {
        return this.mau;
    }

    public PhanSo rutgon_PS() {
        int t = UCLN(this.tu, this.mau);
        return new PhanSo(this.tu / t, this.mau / t);
    }
    public static PhanSo Add(PhanSo a, PhanSo b) {
        PhanSo c = new PhanSo();
        if (a.mau == b.mau) {
            c.tu = a.tu + b.tu;
            c.mau = a.mau;
        } else {
            c.tu = a.tu * b.mau + b.tu * a.mau;
            c.mau = a.mau * b.mau;
        }
        return new PhanSo(c.tu, c.mau).rutgon_PS();
    }

    public static PhanSo Sub(PhanSo a, PhanSo b) {
        PhanSo c = new PhanSo();
        if (a.mau == b.mau) {
            c.tu = a.tu - b.tu;
            c.mau = a.mau;
        } else {
            c.tu = a.tu * b.mau - b.tu * a.mau;
            c.mau = a.mau * b.mau;
        }
        return new PhanSo(c.tu, c.mau).rutgon_PS();
    }
    public static PhanSo Multi(PhanSo a, PhanSo b) {
        return new PhanSo(a.tu * b.tu, a.mau * b.mau).rutgon_PS();
    }

    public static PhanSo Div(PhanSo a, PhanSo b) {
        return new PhanSo(a.tu * b.mau, a.mau * b.tu).rutgon_PS();
    }

    public static int SoSanh(PhanSo a, PhanSo b) {
        int left = a.tu * b.mau;
        int right = b.tu * a.mau;
        return left > right ? 1 : (left == right ? 0 : -1);
    }

    public String hienthi_PS() {
        return this.tu + "/" + this.mau;
    }
}