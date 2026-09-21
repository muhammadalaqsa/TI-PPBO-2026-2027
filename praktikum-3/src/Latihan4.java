import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Masukkan Umur Anda: ");
        int umur = sc.nextInt();

        System.out.println("Apakah anda sedang menempuh pendidikan tinggi? (true/false): ");
        boolean mahasiswa = sc.nextBoolean();

        double harga;

        if (mahasiswa && umur <= 25 ) {
            harga = 20000;
            System.out.println("Anda Mendapat Harga Khusus");
        } else {
            harga = 35000;
            System.out.println("Anda Mendapat Harga Normal");
        }

        System.out.println("Harga Tiket: Rp" + harga);

    }
}
