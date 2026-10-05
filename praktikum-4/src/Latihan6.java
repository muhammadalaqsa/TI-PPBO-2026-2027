import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah data: ");
        int n = sc.nextInt();

        int[] angka = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Masukkan angka ke-" + (i+1) + ":");
            angka[i] = sc.nextInt();
        }
        System.out.println("Sebelum diurutkan: ");
        for (int i = 0; i < n; i++){
            System.out.println(angka[i] + " ");
        }

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n -1 - i; j++){
                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka [j] = angka[j + 1];
                    angka [j + 1] = temp;
                }
            }
        }

        System.out.println("\nSesudah diurutkan: ");
        for(int i = 0; i < n; i++){
            System.out.print(angka[i] + " ");
        }
    }
}
