import java.util.Scanner;

public class QuanLyDanhBa {
    static DanhBaDienThoai pb = new DanhBaDienThoai();
    static Scanner scanner = new Scanner(System.in);
    static String name, phone;

    static void menu() {
        System.out.println("Quan ly danh ba");
        System.out.println("1. Them so");
        System.out.println("2. Xoa so");
        System.out.println("3. Cap nhat so");
        System.out.println("4. Tim so");
        System.out.println("5. Thoat");
    }

    public static void main(String[] args) {
        menu();
        while (true) {
            System.out.print("Chon so: ");
            switch (scanner.nextInt()) {
                case 1:
                    nhapSoDienThoai();
                    break;
                case 2:
                    xoaSoDienThoai();
                    break;
                case 3:
                    capnhatSoDienThoai();
                    break;
                case 4:
                    timSoDienThoai();
                    break;
                case 5:
                    return;
            }
        }
    }

    private static void xoaSoDienThoai() {
        scanner.nextLine();
        System.out.print("Nhap ten nguoi ban muon xoa: ");
        name = scanner.nextLine();
        pb.xoaSoDienThoai(name);
    }

    private static void timSoDienThoai() {
        scanner.nextLine();
        System.out.print("Please input name of person you want to search the phone: ");
        name = scanner.nextLine();
        pb.timSoDienThoai(name);
    }

    private static void capnhatSoDienThoai() {
        boolean searched = false;
        scanner.nextLine();
        System.out.print("Nhap ten nguoi ban muon cap nhat: ");
        name = scanner.nextLine();
        for (String s : pb.DanhBaDienThoai) {
            if (name.equals(s.substring(0, s.indexOf(",")))) {
                searched = true;
                System.out.print("Nhap so dien thoai ban muon cap nhat: ");
                phone = scanner.nextLine();
                pb.capnhatSoDienThoai(name, phone);
                break;
            }
        }
        if (!searched)
            System.out.println("Khong tim thay ten : " + name);
    }

    private static void nhapSoDienThoai() {
        scanner.nextLine();
        System.out.print("Nhap ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap so dien thoai: ");
        phone = scanner.nextLine();
        pb.nhapSoDienThoai(name, phone);
    }

}