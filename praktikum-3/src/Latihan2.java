import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Tiga Angka: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ( a > b){
            if ( a > c ) {
                System.out.println("Bilangan Terbesar Adalah: " + a);
            } else {
                System.out.println("Bilangan Terbesar Adalah: " + c);
            }
        } else {
            if (b > c ){
                System.out.println("Bilangan Terbesar Adalah: " + b);
            } else {
                System.out.println("Bilangan Terbesar Adalah: " + c);
            }

        }
            }
        }


