import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public final int themNhanVien = 1;
    public final int suaNhanVien = 2;
    public final int saThaiNhanVien = 3;
    public final int hienThiLuongTheoTen = 4;
    public final int timKiem = 5;
    public final int sapXep = 6;
    public final int hienThiTatCa = 7;
    public final int thoat = 8;

    public static void menu() {
        while (true) {
            try {
                System.out.println("He Thong Quan Ly Nhan Vien CodeGym");
                System.out.println("1. Them Nhan Vien");
                System.out.println("2. Sua Nhan Vien");
                System.out.println("3. Sa Thai Nhan Vien");
                System.out.println("4. Hien Thi Luong Theo Ten");
                System.out.println("5. Tim Kiem Nhan Vien Theo Ten");
                System.out.println("6. Sap Xep Nhan Vien Theo Ten");
                System.out.println("7. Hien Thi Danh Sach Nhan Vien");
                System.out.println("8. Thoat");
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case themNhanVien -> QLNV.add();
                    case suaNhanVien -> QLNV.edit();
                    case saThaiNhanVien -> QLNV.fireNhanVien();
                    case hienThiLuongTheoTen -> QLNV.printSalaryByName();
                    case timKiem -> QLNV.searchByName();
                    case sapXep -> QLNV.sortByName();
                    case hienThiTatCa -> QLNV.showAll();
                    case thoat -> {
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
