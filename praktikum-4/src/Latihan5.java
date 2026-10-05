import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah data: ");
        int n = sc.nextInt();

        int angka[] = new int[n];

        for (int i = 0; i < n; i++){

            System.out.println("Masukkan angka ke-" + (i + 1) + ":");
            angka[i] = sc.nextInt();
        }

        int terbesar = angka[0];
        int terbesarKedua = angka[0];

        for (int i = 1; i < n; i++){
            if (angka[i] > terbesar){
                terbesarKedua = terbesar;
                terbesar = angka[i];
            } else if (angka[i] > terbesarKedua && angka[i] != terbesar) {
                terbesarKedua = angka[i];

            }
        }

        System.out.println("Nilai terbesar = " + terbesar);
        System.out.println("Nilai terbesar kedua = " + terbesarKedua);
    }

}
