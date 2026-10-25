import java.util.Scanner;

public class UTS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();

        int n = 3;
        int[] nilai = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Masukkan nilai tugas " + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.println("--Hasil--");

        System.out.println("Nama: " + nama);

        int total = 0;

        for(int a : nilai){
            total += a;
        }

        double rataRata = (double) total / n;

        System.out.println("Rata-rata: " + rataRata);

        char huruf;

        if (rataRata >= 85){
            huruf = 'A';
        } else if (rataRata >= 70 ){
            huruf = 'B';
        } else if (rataRata >= 55 ){
            huruf = 'C';
        } else {
            huruf = 'E';
        }
        System.out.print("Grade: " + huruf);

    }
}
