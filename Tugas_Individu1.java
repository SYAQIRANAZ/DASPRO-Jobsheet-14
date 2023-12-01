import java.util.Scanner;

public class Tugas_Individu1 {
    public static void hitungRekursif(int n) {
        if (n >= 1) {
            hitungRekursif(n - 1);
            if (n > 1) {
                System.out.print(" + ");
            }
            System.out.print(n);
        }
    }
    public static void hitungIteratif(int n) {
        for (int i = 1; i <= n ; i++) {
            System.out.print(i);
            if (i<n) {
                System.out.print(" + ");
            }
        }
    }
    public static int secaraIteratif(int N) {
        int total = 0;

        for (int i = 1; i <= N; i++) {
            total += i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();
        
        System.out.println("Menggunakan fungsi rekursif : ");
        hitungRekursif(n);
        
        System.out.println("\nMenggunakan fungsi iteratif :  ");
        hitungIteratif(n);
        
        scanner.close();
    }
}