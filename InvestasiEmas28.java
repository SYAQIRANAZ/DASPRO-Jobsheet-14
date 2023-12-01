import java.util.Scanner;

public class InvestasiEmas28{
    public static void main(String[] args){
        double investasiAwal = 1000000;
        double tingkatKeuntungan = 0.117;
        int tahun = 10;
        double hasilInvestasi = hitungInvestasi(investasiAwal, tingkatKeuntungan, tahun);
        System.out.println("Jumlah uang setelah "+tahun+" tahun: " + hasilInvestasi);
    }
    public static double hitungInvestasi(double investasiAwal, double tingkatKeuntungan, int tahun) {
        double hasilInvestasi = investasiAwal;
        for (int i = 1; i<=tahun; i++){
            hasilInvestasi += hasilInvestasi * tingkatKeuntungan;
        }
        return hasilInvestasi;
    }
   
}