import java.util.Scanner;

public class LatihanNomor5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan bilangan pertama: ");
            int a = sc.nextInt();

        System.out.println("Masukkan bilangan kedua: ");
            int b = sc.nextInt();

        System.out.println("Penjumlahan n: " + (a + b));
        System.out.println("Perkalian n: " + (a * b));
        System.out.println("Pembagian n: " + (a / b));
        System.out.println("Modulus n: " + (a % b));

        System.out.println("Perbandingan n: " + a + " > " + b + ": " + (a > b));
        System.out.println("Perbandingan n: " + a + " < " + b + ": " + (a < b));
        System.out.println("Perbandingan n: " + a + " == " + b + ": " + (a == b));
    }
}
