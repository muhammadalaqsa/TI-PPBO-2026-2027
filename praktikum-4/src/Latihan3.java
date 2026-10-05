import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int [10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Masukkan angka ke-" + (i + 1) + ":");
            angka[i] = sc.nextInt();
        }

        System.out.println("Urutan terbalik:");
        for (int i = 9; i >= 0; i--){
            System.out.println(angka [i] + " ");
        }
    }
}
