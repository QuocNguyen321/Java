import  java.util.Scanner;
public class TEST {
    public static boolean ischuoi(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch(NumberFormatException error) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      // Nhập Phân số
        Scanner input = new Scanner(System.in);     // nhập y/n
        Scanner number = new Scanner(System.in);    // nhập số
        DS_PhanSo list = new DS_PhanSo();
        char choose = 'y';
        String ps, tach[];
        int tu, mau;
        do {
            System.out.println("Nhap tu so va mau so(Quy cach: tu/mau): ");
            ps = scan.nextLine();
            tach = ps.split("/");
            if (ischuoi(tach[0]) == false || ischuoi(tach[1]) == false) {
                System.out.println("PHAN SO BAN NHAP KHONG HOP LE. VUI LONG NHAP LAI.");
                continue;
            }
            tu = Integer.parseInt(tach[0]);
            mau = Integer.parseInt(tach[1]);
            list.them_PS(new PhanSo(tu, mau));
            list.hienthi_DS();
            System.out.print("(Nhan phim y/Y de tiep tuc: ");
            choose = input.next().charAt(0);
        } while (choose == 'y' || choose == 'Y');
        System.out.println("Tong cac phan so trong danh sach la: " + list.Sum().hienthi_PS());
        int i;
        System.out.print("Ban muon xoa phan so thu may? ");
        i = number.nextInt();
        list.xoa_PS(i);
        System.out.println("Danh sach con lai sau khi xoa: ");
        list.hienthi_DS();
        list.Sapxep_TangDan();
        scan.close();
        input.close();
        number.close();
    }
}
