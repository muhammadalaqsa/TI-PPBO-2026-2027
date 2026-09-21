import java.util.Scanner;

public class TugasPraktikum3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double tarif_450 = 500;
        double tarif_900 = 1000;
        double tarif_1300 = 1500;
        double tarif_2200 = 1700;
        double tarif_diatas_2200 = 2000;

        System.out.println("Masukkan golongan daya (VA): ");
        int daya = sc.nextInt();

        System.out.println("Masukkan pemakaian listrik (kWh): ");
        double kwh = sc.nextDouble();

        if (kwh <= 0){
            System.out.println("Error: Jumlah pemakaian kWh harus lebih dari 0.");
            return;
        }

        double tarif = 0;

        switch (daya){
            case 450:
                tarif = tarif_450;
                break;
            case 900:
                tarif = tarif_900;
                break;
            case 1300:
                tarif = tarif_1300;
                break;
            case 2200:
                tarif = tarif_2200;
                break;
            default:
                if (daya > 2200){
                    tarif = tarif_diatas_2200;
                } else {
                    System.out.println("Golongan daya tidak valid");
                    return;
                }
        }
        double total = kwh * tarif;

        System.out.println("\n===== HASIL TAGIHAN LISTRIK =====");
        System.out.println("Golongan Daya : " + daya + " VA");
        System.out.println("Pemakaian     : " + kwh + " kwh");
        System.out.println("Tarif per kwh : Rp" + tarif);
        System.out.println("Total tagihan : Rp" + total);
    }
}
