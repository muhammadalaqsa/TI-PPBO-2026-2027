import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Silahkan pilih pesanan anda");

        System.out.println("1-Nasi Goreng");
        System.out.println("2-Mie Ayam");
        System.out.println("3-Nasi Ayam Geprek");
        System.out.println("4-Nasi Ikan Balado");

        int pesanan = sc.nextInt();

        switch (pesanan){

            case 1:
                System.out.println("1-Nasi Goreng");
                break;
            case 2:
                System.out.println("2-Mie Ayam");
                break;
            case 3:
                System.out.println("3-Nasi Ayam Geprek");
                break;
            case 4:
                System.out.println("4-Nasi Ikan Balado");
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
        }

    }
}
