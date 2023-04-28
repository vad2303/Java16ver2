import java.util.Scanner;
public class slide74{
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu trong mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double total = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhap gia tri cho phan tu trong mang "+(i+1)+": ");
            arr[i] = sc.nextDouble();
        }
        sc.close();
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        System.out.format("Kết quả là: %.3f", total);
    }
}
    
