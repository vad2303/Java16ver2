import java.util.ArrayList;

public class DanhBaDienThoai extends SoDienThoai {
    ArrayList<String> DanhBaDienThoai = new ArrayList<>();

    @Override
    void nhapSoDienThoai(String ten, String phone) {
        boolean timThay = false;
        for (String s : DanhBaDienThoai) {
            if (s.contains(ten)) {
                timThay = true;
                if (!s.contains(phone)) {
                    s += " : " + phone;
                } else {
                    System.out.println("Danh ba nay da co");
                }
            }
        }
        if (!timThay) {
            DanhBaDienThoai.add(ten + "," + phone);
        }
    }

    @Override
    void xoaSoDienThoai(String ten) {
        boolean searched = false;
        for (String s : DanhBaDienThoai) {
            if (ten.equals(s.substring(0, s.indexOf(",")))) {
                searched = true;
                DanhBaDienThoai.remove(s);
                System.out.println("xoa");
                break;
            }
        }
        if (!searched)
            System.out.println("khong tim thay ten: " + ten);
    }

    @Override
    void capnhatSoDienThoai(String ten, String sodienthoaimoi) {
        String s = ten;
        s = s.substring(0, s.indexOf(","));
        DanhBaDienThoai.set(DanhBaDienThoai.indexOf(s), s + "," + sodienthoaimoi);
        System.out.println("Cap Nhat");
    }

    @Override
    void timSoDienThoai(String ten) {
        boolean searched = false;
        for (String s : DanhBaDienThoai) {
            if (s.contains(ten)) {
                searched = true;
                System.out.println(s.toString());
                break;
            }
        }
        if (!searched)
            System.out.println("Khong tim thay nguoi nay");
    }
}
