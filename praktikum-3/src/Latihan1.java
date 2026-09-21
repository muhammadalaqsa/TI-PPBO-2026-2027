import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Angka: ");
        double a = sc.nextDouble();

        if (a % 2 == 0){
            System.out.println("Ini Bilangan Genap");
        } else {
            System.out.println("Ini Bilangan Ganjil");
        }
    }
}
