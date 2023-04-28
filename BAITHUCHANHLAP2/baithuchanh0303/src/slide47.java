import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
    float sum = 0, number;
    try (Scanner sc = new Scanner(System.in)) {
        do {
            System.out.println("Nhap vao so:");
            number = sc.nextFloat();
            sum += number;
            if (sum > 100)
                break;
        } while (number > 0);
    }
         
    System.out.println("Tong = " + sum);
    
}
}