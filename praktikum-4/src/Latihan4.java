import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] matriks = new int [3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Masukkan baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                matriks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++){
            int jumlahBaris = 0;
            for (int j = 0; j < 3; j++){
                jumlahBaris += matriks[i][j];
            }
            System.out.println("Jumlah baris " + (i + 1) + " = " + jumlahBaris);

            int total = 0;

            for (i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    total += matriks[i][j];
                }
            }

            System.out.println("Jumlah seluruh elemen = " + total);
        }
    }

}
