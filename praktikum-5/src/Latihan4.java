import java.util.Scanner;

public class Latihan4 {
    static int cariMaksimum(int[] data){
        int max = data[0];
        for(int nilai : data){
            if(nilai > max){
                max = nilai;
            }
        }
        return max;
    }

    static int cariMinimum(int[] data){
        int min = data[0];
        for (int nilai : data){
            if(nilai < min){
                min = nilai;
            }
        }
        return min;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah nilai ujian: ");
        int jumlah = sc.nextInt();

        if(jumlah <= 0){
            System.out.println("Tidak ada nilai yang diisi.");
            sc.close();
            return;
        }

        int[] data = new int[jumlah];

        for(int i = 0; i < jumlah; i++){
            System.out.println("Masukkan nilai ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }

        System.out.println("Nilai minimum = " + cariMinimum(data));
        System.out.println("Nilai maksimum = " + cariMaksimum(data));
        sc.close();
    }
}
