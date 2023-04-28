import java.util.Scanner;
 
public class slide34 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap he so bac 2, a = ");
        float a = slide34.sc.nextFloat();
        System.out.print("Nhap he so bac 1, b = ");
        float b = slide34.sc.nextFloat();
        System.out.print("Nhập hang so tu do, c = ");
        float c = sc.nextFloat();
        slide34.giaiPTBac2(a, b, c);
    }
    
    public static void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vo nghiem!");
            } else {
                System.out.println("PT co 1 nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("PT co 2 nghiem là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("PT co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("PT vo nghiem!");
        }
    }
}
