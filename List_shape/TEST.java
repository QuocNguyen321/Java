import java.util.Scanner;
public class TEST {
    public static List_Shape list = new List_Shape();
    public static Shape hinhhoc;
    public static int choose;
    public static void main(String[] args) {
        add();
        do {
            menu();
            System.out.print("Chon chuc nang: ");
            choose = input_number();
            switch (choose) {
                case 1: {
                    add();
                    break;
                }
                case 2: {
                    list.hienthi();
                    break;
                }
                case 3: {
                    Delete();
                    break;
                }
                case 4: {
                    Category();
                    break;
                }
                case 5: {
                    list.sort_by_DT();
                    break;
                }
                case  6: {
                    list.sort_by_CV();
                    break;
                }
                case 0: {
                    System.out.println("THOAT THANH CONG");
                    break;
                }
                default: {
                    System.out.println("Loi khong hop le.");
                    break;
                }
            }
            System.out.println("-----------------------------------------------------------------------");
        } while (choose != 0);
    }
    public static int input_number() {
        return (new Scanner(System.in)).nextInt();
    }
    public static double Random() {
        double number_rand = Math.random() * 100 + 1;
        return (double) Math.round(number_rand * 10) / 10;
    }
    public static void menu() {
        System.out.println("1. Them hinh hoc vao danh sach.");
        System.out.println("2. Hien thi danh sach hinh hoc.");
        System.out.println("3. Xoa hinh.");
        System.out.println("4. Hien thi 1 loai hinh hoc.");
        System.out.println("5. Sap xep danh sach tang dan theo dien tich.");
        System.out.println("6. Sap xep danh sach giam dan theo chu vi.");
        System.out.println("0. Thoat");
    }
    public static void add() {
        System.out.println("1. Them hinh chu nhat.");
        System.out.println("2. Them hinh ellipse.");
        System.out.println("3. Them hinh tam giac. ");
        System.out.println("4. Them hinh vuong.");
        System.out.println("5. Them hinh tron.");
        System.out.println("6. Them hình tam giac can.");
        System.out.println("7. Them hinh tam giac deu.");
        System.out.println("0. Thoat.");
        do {
            System.out.print("Ban muon them hinh so may: ");
            choose = input_number();
            switch (choose) {
                case 1: {
                    hinhhoc = new Rectangle(Random(), Random());
                    System.out.println("Them hinh chu nhat thanh cong");
                    list.themhinh(hinhhoc);
                    break;
                }
                case 2: {
                    hinhhoc = new Ellipse(Random(), Random());
                    System.out.println("Them hinh ellipse thanh cong");
                    list.themhinh((hinhhoc));
                    break;
                }
                case 3: {
                    hinhhoc = new Triangle(Random(), Random(), Random());
                    System.out.println("Them hinh tam giac thanh cong");
                    list.themhinh((hinhhoc));
                    break;
                }
                case 4: {
                    hinhhoc = new Square(Random());
                    System.out.println("Them hinh vuong thanh cong");
                    list.themhinh((hinhhoc));
                    break;
                }
                case 5: {
                    hinhhoc = new Circle(Random());
                    System.out.println("Them hinh tron thanh cong");
                    list.themhinh((hinhhoc));
                    break;
                }
                case 6: {
                    hinhhoc = new Isosceles_Triangle(Random(), Random());
                    System.out.println("Them hinh tam giac can thanh cong");
                    list.themhinh((hinhhoc));
                    break;
                }
                case 7: {
                    hinhhoc = new Equilateral_Triangle(Random());
                    System.out.println("Them hinh tam giac deu thanh cong");
                    list.themhinh((hinhhoc));
                    break;
                }
                case 0: {
                    System.out.println("THOAT THANH CONG.");
                    break;
                }
                default: {
                    System.out.println("Chuc nang khong hop le.");
                    break;
                }
            }
        } while (choose != 0);
    }
    public static void Delete() {
        System.out.println("1. Xoa hinh chu nhat.");
        System.out.println("2. Xoa hinh ellipse.");
        System.out.println("3. Xoa hinh tam giac. ");
        System.out.println("4. Xoa hinh vuong.");
        System.out.println("5. Xoa hinh tron.");
        System.out.println("6. Xoa hình tam giac can.");
        System.out.println("7. Xoa hinh tam giac deu.");
        do {
            System.out.print("Ban muon xoa hinh so may: ");
            choose = input_number();
            switch (choose) {
                case 1: {
                    list.xoahinh("Hinh Chu Nhat");
                    System.out.println("Xoa hinh chu nhat thanh cong.");
                    break;
                }
                case 2: {
                    list.xoahinh("Hinh Ellipse");
                    System.out.println("Xoa hinh ellipse thanh cong.");
                    break;
                }
                case 3: {
                    list.xoahinh("Hinh tam giac");
                    System.out.println("Xoa hinh tam giac thanh cong.");
                    break;
                }
                case 4: {
                    list.xoahinh("Hinh Vuong");
                    System.out.println("Xoa hinh vuong thanh cong.");
                    break;
                }
                case 5: {
                    list.xoahinh("Hinh tron");
                    System.out.println("Xoa hinh tron thanh cong.");
                    break;
                }
                case  6: {
                    list.xoahinh("Hinh tam giac can");
                    System.out.println("Xoa hinh tam giac can thanh cong.");
                }
                case 7: {
                    list.xoahinh("Hinh Tam Giac Deu");
                    System.out.println("Xoa hinh tam giac deu thanh cong.");
                    break;
                }
                default: {
                    System.out.println("Khong hop le.");
                    break;
                }
            }
        } while (choose < 1 || choose > 7);
    }
    public static void Category() {
        System.out.println("1. Hinh chu nhat.");
        System.out.println("2. Hinh ellipse.");
        System.out.println("3. Hinh tam giac. ");
        System.out.println("4. Hinh vuong.");
        System.out.println("5. Hinh tron.");
        System.out.println("6. Hình tam giac can.");
        System.out.println("7. Hinh tam giac deu.");
        System.out.print("Nhap loai hinh hoc ban muon hien thi: ");
        choose = input_number();
        switch (choose) {
            case 1: {
                list.hienthi_1_Shape("Hinh Chu Nhat");
                break;
            }
            case 2: {
                list.hienthi_1_Shape("Hinh Ellipse");
                break;
            }
            case 3: {
                list.hienthi_1_Shape("Hinh tam giac");
                break;
            }
            case 4: {
                list.hienthi_1_Shape("Hinh Vuong");
                break;
            }
            case 5:{
                list.hienthi_1_Shape("Hinh tron");
                break;
            }
            case 6: {
                list.hienthi_1_Shape("Hinh tam giac can");
                break;
            }
            case 7: {
                list.hienthi_1_Shape("Hinh Tam Giac Deu");
                break;
            }
            default: {
                System.out.println("Loi chuc nang.");
                break;
            }
        } while (choose < 1 || choose > 7);
    }
}
