import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        while (true) {
            try {
                System.out.println("He Thong Quan Ly Nhan Vien CodeGym");
                System.out.println("1. Them Nhan Vien");
                System.out.println("2. Sa Thai Nhan Vien");
                System.out.println("3. Hien Thi Luong Theo Ten");
                System.out.println("4. Tim Kiem Nhan Vien Theo Ten");
                System.out.println("5. Sap Xep Nhan Vien Theo Ten");
                System.out.println("6. Hien Thi Danh Sach Nhan Vien");
                System.out.println("7. Thoat");
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1 -> QLNV.add();
                    case 2 -> QLNV.fireNhanVien();
                    case 3 -> QLNV.printSalaryByName();
                    case 4 -> QLNV.searchByName();
                    case 5 -> QLNV.sortByName();
                    case 6 -> QLNV.showAll();
                    case 7 -> {
                        System.out.println("Thoat khoi he thong");
                        System.exit(0);
                    }
                    default -> System.out.println("khong tim thay lenh so " + choice + " hay nhap lai");
                }
            } catch (Exception e){
                System.out.println("Something gone wrong");
            }
        }
    }
}
