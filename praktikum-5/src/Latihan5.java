import java.util.Arrays;

public class Latihan5 {

    static int hitungTotal(int[] data){
        int total = 0;

        for(int nilai : data){
            total += nilai;
        }
        return total;
    }

    static int[] filterDiAtasRataRata(int[] data){
        double rataRata = (double) hitungTotal(data) / data.length;

        int jumlah = 0;

        for (int nilai : data) {
            if(nilai > rataRata){
                jumlah++;
            }
        }

        int[] hasil = new int[jumlah];
        int index = 0;
        for(int nilai : data){
            if(nilai > rataRata){
                hasil[index] = nilai;
                index++;
            }
        }
        return hasil;
    }

    public static void main(String[] args){
        int[] data = {60, 70, 80, 90, 100};
        System.out.println("Data nilai: " + Arrays.toString(data));
        System.out.println("Total nilai: " + hitungTotal(data));

        double rataRata = (double) hitungTotal(data) / data.length;

        System.out.println("Rata-rata: " + rataRata);

        System.out.println("Nilai di atas rata-rata: " + Arrays.toString(filterDiAtasRataRata(data)));
    }

}
