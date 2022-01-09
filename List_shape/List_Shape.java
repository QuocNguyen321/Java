import java.util.ArrayList;
import java.util.Locale;

public class List_Shape {
    ArrayList <Shape> DS_Hinh;
    public List_Shape() { DS_Hinh = new ArrayList<>(); }
    public void themhinh(Shape hinhhoc) { DS_Hinh.add(hinhhoc); }
    public void xoahinh(String tenhinh) {
        if (DS_Hinh.size() == 0) { System.out.println("Khong co hinh de xoa."); }
        else {
            for (int i = 0; i < DS_Hinh.size(); i++) {
                if ((DS_Hinh.get(i).getName()).equals(tenhinh) == true) { DS_Hinh.remove(i); }
            }
            int last = DS_Hinh.size() - 1;
            if ((DS_Hinh.get(last).getName()).equals(tenhinh) == true) {DS_Hinh.remove(last); }
        }
        hienthi();
    }
    public void hienthi() {
        System.out.println("DANH SACH HINH");
        for (int i = 0; i< DS_Hinh.size(); i++) { System.out.println((i + 1) + " " + DS_Hinh.get(i).toString()); }
    }
    public void hienthi_1_Shape(String tenhinh) {
       if (DS_Hinh.size() == 0) {
           System.out.println("DANH SACH RONG");
       }
       else {
           System.out.println("DANH SACH HINH " + tenhinh.toUpperCase());
           for (Shape i: DS_Hinh) {
               if (i.getName().equals(tenhinh) == true) {
                   System.out.println(i.toString());
               }
           }
       }
    }
    public void sort_by_DT() {
        DS_Hinh.sort( (Shape h1, Shape h2) ->
                {
                    return (h1.TinhDienTich() > h2.TinhDienTich()) ? 1 : (h1.TinhDienTich() == h2.TinhDienTich() ? 0 : -1);
                }
        );
        System.out.println("DANH SACH HINH HOC XEP TANG DAN THEO DIEN TICH");
        hienthi();
    }
    public void sort_by_CV() {
        DS_Hinh.sort( (Shape h1, Shape h2) ->
                {
                    return h1.TinhChuVi() < h2.TinhChuVi() ? 1 : (h1.TinhChuVi() == h2.TinhChuVi() ? 0 : -1);
                }
        );
        System.out.println("DANH SACH HINH HOC XEP GIAM DAN THEO CHU VI");
        hienthi();
    }
}
