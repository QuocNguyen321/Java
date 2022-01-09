import java.util.Scanner;
public class TEST {
    public static void Circle() {
        Scanner input = new Scanner(System.in);
        Circle a = new Circle(3, 5, 16.7);
        char move;
        do {
            move = input.next().charAt(0);
            switch (move) {
                case 'w': case 'W': {
                    a.MoveUp();
                    System.out.println(a.toString());
                    System.out.println("------------------------------------------");
                    break;
                }
                case 's': case 'S': {
                    a.MoveDown();
                    System.out.println(a.toString());
                    System.out.println("------------------------------------------");
                    break;
                }
                case 'a': case 'A': {
                    a.MoveLeft();
                    System.out.println(a.toString());
                    System.out.println("------------------------------------------");
                    break;
                }
                case 'd': case 'D': {
                    a.MoveRight();
                    System.out.println(a.toString());
                    System.out.println("------------------------------------------");
                    break;
                }
            }
        } while (move == 'w' || move == 'W' || move == 'a' || move == 'A' || move == 's' || move == 'S' || move == 'd' || move == 'D') ;
        System.out.println("Ket qua cuoi cung: " + a.toString());
    }
    public static void Rectangle() {
        Scanner input = new Scanner(System.in);
        Rectangle a = new Rectangle(3, 5, 16.7, 12.4);
        char move;
        do {
            move = input.next().charAt(0);
            switch (move) {
                case 'w': case 'W': {
                    a.MoveUp();
                    System.out.println(a.toString());
                    System.out.println("------------------------------------------");
                    break;
                }
                case 's': case 'S': {
                    a.MoveDown();
                    System.out.println(a.toString());
                    System.out.println("------------------------------------------");
                    break;
                }
                case 'a': case 'A': {
                    a.MoveLeft();
                    System.out.println(a.toString());
                    System.out.println("------------------------------------------");
                    break;
                }
                case 'd': case 'D': {
                    a.MoveRight();
                    System.out.println(a.toString());
                    System.out.println("------------------------------------------");
                    break;
                }
            }
        } while (move == 'w' || move == 'W' || move == 'a' || move == 'A' || move == 's' || move == 'S' || move == 'd' || move == 'D') ;
        System.out.println("Ket qua cuoi cung: " + a.toString());
    }
    public static void Point() {
        Scanner input = new Scanner(System.in);
        Point a= new Point(3, 5);
        char move;
        do {
            move = input.next().charAt(0);
            switch (move) {
                case 'w': case 'W': {
                    a.MoveUp();
                    System.out.println(a.toString());
                    System.out.println("------------------------------------------");
                    break;
                }
                case 's': case 'S': {
                    a.MoveDown();
                    System.out.println(a.toString());
                    System.out.println("------------------------------------------");
                    break;
                }
                case 'a': case 'A': {
                    a.MoveLeft();
                    System.out.println(a.toString());
                    System.out.println("------------------------------------------");
                    break;
                }
                case 'd': case 'D': {
                    a.MoveRight();
                    System.out.println(a.toString());
                    System.out.println("------------------------------------------");
                    break;
                }
            }
        } while (move == 'w' || move == 'W' || move == 'a' || move == 'A' || move == 's' || move == 'S' || move == 'd' || move == 'D') ;
        System.out.println("Ket qua cuoi cung: " + a.toString());
    }
    public static void main(String[] args) {
        System.out.println("1. Di chuyen diem.");
        System.out.println("2. Di chuyen hinh chu nhat.");
        System.out.println("3. Di chuyen tam hinh tron.");
        int choose;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Chon chuc nang: ");
            choose = scan.nextInt();
            if (choose < 1 || choose > 3) {
                System.out.println("Khong hop le.");
            }
        } while(choose < 1 || choose > 3);
        System.out.println("w de di chuyen len.");
        System.out.println("s de di chuyen xuong.");
        System.out.println("a de di chuyen sang trai.");
        System.out.println("d de di chuyen sang phai.");
        System.out.println("Nhan ky tu bat ky de thoat.");
        switch (choose) {
            case 1: {
                Point();
                break;
            }
            case 2: {
                Rectangle();
                break;
            }
            case 3: {
                Circle();
                break;
            }
        }
    }
}
