import java.util.Scanner;

public class slide40 {
    public static void main(String[] args) {
    int ngay;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Nhap ngay: ");
        ngay = sc.nextInt();

        switch(ngay){
            case 1:
            System.out.println(ngay + "chu nhat");
            break;
            case 2:
            System.out.println(ngay + "thu hai");
            break;
            case 3:
            System.out.println(ngay + "thu ba");
            break;
            case 4:
            System.out.println(ngay + "thu tu");
            break;
            case 5:
            System.out.println(ngay + "thu nam");
            break;
            case 6:
            System.out.println(ngay + "thu sau");
            break;
            case 7:
            System.out.println(ngay + "thu bay");
            break;
        default:
            System.out.println(ngay + "khong co thu trong tuan");
        
        }

    }
    
}
}
