public class TEST {
    public static void main(String[] args) {
        Diem a, b, c, d;
        a = new Diem(12.4, 17.9);
        b = new Diem(11.6, 7.9);
        c = new Diem(37.2, 53.7);
        d = new Diem(34.8, 23.7);
        DoanThang d1, d2;
        d1 = new DoanThang(a, b);
        d2 = new DoanThang(c, d);
        System.out.println("d1 = " + d1.toString() + "\n Do dai doan thang d1 = " + d1.length());
        System.out.println("d2 = " + d2.toString() + "\n Do di doan thang d2 = " + d2.length());
        if (DoanThang.parallel(d1, d2) == true) {
            System.out.println("d1 // d2");
        }
        else {
            System.out.println("d1 cat d2");
        }
        Diem trentrai = new Diem(13.8, 23.6);
        Diem duoiphai = new Diem(20.5, 19.9);
        HinhChuNhat shape = new HinhChuNhat(trentrai, duoiphai);
        System.out.println(shape.toString());
    }
}
