import java.util.Scanner;

/*
Program Kalkulator Bangun Datar
 */
public class KalkulatorBangunDatar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    /*
    Meminta User Untuk Menginput Panjang dan Lebar Persegi Panjang
     */

        System.out.println("Masukkan panjang: ");
            double panjang = sc.nextDouble();

        System.out.println("Masukkan lebar: ");
            double lebar = sc.nextDouble();

        /*
        Proses menghitung luas persegi panjang
         */
        double luasPersegiPanjang = panjang * lebar;

        /*
        Proses Menghitung Keliling Persegi Panjang
         */
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
        System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang);

        /*
        Menentukan Apa Luas Persegi Panjang lebih dari 100
         */

        boolean luasBesar = luasPersegiPanjang > 100;

        System.out.println("Luas lebih dari 100: " + luasBesar);

        /*
        Meminta User Untuk Menginput Jari-Jari Lingkaran
         */
        System.out.println("Masukkan jari-jari lingkaran: ");
        double jariJari = sc.nextDouble();

        /*
        Menghitung Luas Lingkaran Menggunakan Math.PI
         */
        double luasLingkaran = Math.PI * jariJari * jariJari;

        /*
        Menghitung Keliling Lingkaran Menggunakan Math.PI
         */
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        System.out.println("Luas lingkaran: " + luasLingkaran);
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
    }
}
