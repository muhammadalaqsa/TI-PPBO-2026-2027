import java.sql.SQLOutput;
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan berat badan anda (kg): ");
        double berat = sc.nextDouble();
        System.out.println("Masukkan tinggi badan (cm): ");
        double tinggi = sc.nextDouble();

        tinggi = tinggi / 100;

        double bmi = berat / (tinggi * tinggi);

        System.out.println("BMI Anda: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else if (bmi < 30){
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");

        }
    }
}
