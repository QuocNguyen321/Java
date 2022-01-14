public class test {
    public static void main(String[] args) {
        String n1, n2, n3, n4,  temp1[], temp2[], temp3[], temp4[];
        n1 = "29/11/2021";
        n2 = "30/4/1975";
        n3 = "2/9/1945";
        n4 = "29/2/2009";
        temp1 = n1.split("/");
        temp2 = n2.split("/");
        temp3 = n3.split("/");
        temp4 = n4.split("/");
        NgayThang a = new NgayThang(Integer.parseInt(temp1[0]), Integer.parseInt(temp1[1]), Integer.parseInt(temp1[2]));
        NgayThang b = new NgayThang(Integer.parseInt(temp2[0]), Integer.parseInt(temp2[1]), Integer.parseInt(temp2[2]));
        NgayThang c = new NgayThang(Integer.parseInt(temp3[0]), Integer.parseInt(temp3[1]), Integer.parseInt(temp3[2]));
        NgayThang d = new NgayThang(Integer.parseInt(temp4[0]), Integer.parseInt(temp4[1]), Integer.parseInt(temp4[2]));
        System.out.println("thu cua ngay a: " + a.thutrongtuan());
        System.out.println("thu cua ngay b: " + b.thutrongtuan());
        System.out.println("thu cua ngay c: " + c.thutrongtuan());
        System.out.println("thu cua ngay d: " + d.thutrongtuan());
        for (int i = 0; i < 10; i++) { System.out.print("-"); }
        System.out.println();
        System.out.println("Theo Viet Nam");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        for (int i = 0; i < 10; i++) { System.out.print("-"); }
        System.out.println();
        a.doidinhdang(1);
        b.doidinhdang(1);
        c.doidinhdang(1);
        d.doidinhdang(1);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
    }
}
