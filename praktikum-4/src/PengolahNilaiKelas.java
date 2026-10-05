import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Masukkan nilai mahasiswa ke-" + (i +1) + ":");
            nilai[i] = sc.nextInt();
        }

        System.out.println("\n=====HASIL PENGOLAHAN NILAI=====");

        System.out.println("Nilai sebelum diurutkan: ");
        for (int i = 0; i < n; i++){
            System.out.println(nilai[i] + " ");
        }

        int total = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        int KKM = 70;

        for(int i = 0; i < n; i++){
            total += nilai[i];

            if(nilai[i] > nilaiTertinggi){
                nilaiTertinggi = nilai[i];
            }

            if(nilai[i] < nilaiTerendah){
                nilaiTerendah = nilai[i];
            }

            if (nilai[i] >= KKM){
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        double rataRata = (double) total / n;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1 - i; j++){

                if (nilai[j] > nilai[j + 1]){
                    int temp = nilai[j];
                    nilai[j] = nilai[j - 1];
                    nilai[j - 1] = temp;
                }
            }
        }

        System.out.println("Nilai stelah diurutkan: ");
        for(int i = 0; i < n; i++){
            System.out.println(nilai[i] + " ");
        }

        System.out.println("\n\n=====LAPORAN NILAI KELAS=====");

        System.out.println("Jumlah mahasiswa    : " + n);

        System.out.println("Nilai rata-rata     : " + rataRata);

        System.out.println("Nilai tertinggi     : " + nilaiTertinggi);

        System.out.println("Nilai terendah      : " + nilaiTerendah);

        System.out.println("KKM                 : " + KKM);

        System.out.println("Jumlah mahasiswa yang lulus : " + jumlahLulus);

        System.out.println("Jumlah mahasiswa yang tidak lulus : " + jumlahTidakLulus);
    }
}
