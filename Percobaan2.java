import java.util.Scanner;
public class Percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return(1);
        } else {
            return(x * hitungPangkat(x,y-1));
        }
    }
    public static void main(String[] args) {
        int bilangan, pangkat;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilanngan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        System.out.println("Hasil : " + hitungPangkat(bilangan,pangkat));
    }
}