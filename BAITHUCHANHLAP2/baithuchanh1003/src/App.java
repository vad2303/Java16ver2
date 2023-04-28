import java.util.Scanner;
 

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhap so phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        sortASC(arr);
        System.out.println("Sap xep theo thu tu tang dan: ");
        show(arr);

    }
         public static void sortASC(int [] arr) {
        int tg = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tg = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tg;
                }
            }
        }
    }
     public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
