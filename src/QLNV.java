import java.util.ArrayList;
import java.util.Scanner;

public class QLNV {
    static Scanner input = new Scanner(System.in);
    static ArrayList<NhanVien> CodeGym = new ArrayList<>();
    public static final int nhanVienDaoTao = 1;
    public static final int nhanVienDaoTaoFullTime = 1;
    public static final int nhanVienDaoTaoPartTime = 2;
    public static final int nhanVienTuyenSinh = 2;
    public static final int tuoiGioiHan = 18;

    public static void add() {
        System.out.println("Them Nhan Vien Moi");
        String name = getTenNhanVien();
        int age = getAge();
        String gender = getGender();
        String phoneNum = getPhoneNum();
        String email = getEmail();
        long salary = getSalary();
        System.out.println("Nhan Vien nay la");
        System.out.println("1. Nhan Vien Dao Tao");
        System.out.println("2. Nhan Vien Tuyen Sinh");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case nhanVienDaoTao -> {
                System.out.println("1. Nhan Vien Dao Tao Full-Time");
                System.out.println("2. Nhan Vien Dao Tao Part-Time");
                int choice2 = Integer.parseInt(input.nextLine());
                switch (choice2) {
                    case nhanVienDaoTaoFullTime -> CodeGym.add(new NhanVienDaoTaoFullTime(name, age, gender, phoneNum, email, salary));
                    case nhanVienDaoTaoPartTime -> {
                        System.out.println("Nhap so gio nhan vien nay da lam");
                        long workedHour = Long.parseLong(input.nextLine());
                        CodeGym.add(new NhanVienDaoTaoPartTime(name, age, gender, phoneNum, email, salary, workedHour));
                    }
                }
            }
            case nhanVienTuyenSinh -> {
                System.out.println("Nhap so luong ma nhan vien nay da tuyen sinh duoc");
                long recruitedAmount = Long.parseLong(input.nextLine());
                CodeGym.add(new NhanVienTuyenSinh(name, age, gender, phoneNum, email, salary, recruitedAmount));
            }
        }
    }

//    public static void edit(){
//        System.out.println("Nhap ten nhan vien can sua");
//        String name = getTenNhanVien();
//        for (NhanVien N : CodeGym){
//            if (N.getName().equals(name)){
//                N.setSalary(getSalary());
//            }
//        }
//    }


    public static void showAll() {
        for (NhanVien N : CodeGym) {
            System.out.println(N);
        }
    }

    public static void fireNhanVien() {
        System.out.println("Nhan Vien nay la");
        System.out.println("1. Nhan Vien Dao Tao");
        System.out.println("2. Nhan Vien Tuyen Sinh");
        int choice = Integer.parseInt(input.nextLine());
        String name = getTenNhanVien();
        switch (choice) {
            case nhanVienDaoTao -> {
                for (int i = 0; i < CodeGym.size(); i++) {
                    if (CodeGym.get(i) instanceof NhanVienDaoTao) {
                        if (CodeGym.get(i).getName().equals(name)) {
                            CodeGym.remove(CodeGym.get(i));
                            i--;
                        }
                    }
                }
            }
            case nhanVienTuyenSinh -> {
                for (int i = 0; i < CodeGym.size(); i++) {
                    if (CodeGym.get(i) instanceof NhanVienTuyenSinh) {
                        if (CodeGym.get(i).getName().equals(name)) {
                            CodeGym.remove(CodeGym.get(i));
                            i--;
                        }
                    }
                }
            }
        }
    }

    public static void searchByName(){
        String name = getTenNhanVien();
        for (NhanVien N : CodeGym){
            if(N.getName().equals(name)){
                System.out.println(N);
            }
        }
    }

    public static void sortByName(){
        NameSorter nameSorter = new NameSorter();
        CodeGym.sort(nameSorter);
    }


    public static void printSalaryByName(){
        String name = getTenNhanVien();
        for (NhanVien N : CodeGym){
            if(N.getName().equals(name)){
                System.out.println(N.getName() + " luong: " + N.getTotalSalary());
            }
        }
    }

    private static long getSalary() {
        while (true) {
            try {
                System.out.println("Nhap Luong");
                return Long.parseLong(input.nextLine());
            } catch (Exception e) {
                System.out.println("Phai Nhap So");
            }
        }
    }

    private static String getEmail() {
        while (true) {
            try {
                System.out.println("Nhap Email");
                String email = input.nextLine();
                for (NhanVien N : CodeGym) {
                    if (N.getEmail().equals(email)) {
                        throw new EmailExist();
                    }
                }
                return email;
            } catch (EmailExist e) {
                System.out.println("Email da duoc su dung");
            }
        }
    }

    private static String getPhoneNum() {
        System.out.println("Nhap SDT");
        return input.nextLine();
    }

    private static String getGender() {
        while (true) {
            System.out.println("Nhap Gioi Tinh");
            System.out.println("Nam hoac Nu");
            String gender = input.nextLine();
            if (gender.equals("Nam") || gender.equals("Nu")) {
                return gender;
            } else {
                System.out.println("Gioi tinh phai la Nam hoac Nu (nam hoac nu cung khong duoc)");
            }
        }
    }

    private static int getAge() {
        while (true) {
            try {
                System.out.println("Nhap Tuoi");
                int age = input.nextInt();
                input.nextLine();
                if (age < tuoiGioiHan) {
                    throw new Under18();
                } else {
                    return age;
                }
            } catch (Under18 e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Tuoi phai la so");
            }
        }
    }

    private static String getTenNhanVien() {
        System.out.println("Nhap Ten NV");
        return input.nextLine();
    }
}
