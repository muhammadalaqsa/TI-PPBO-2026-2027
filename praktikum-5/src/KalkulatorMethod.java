import java.util.Scanner;

public class KalkulatorMethod {
    static double tambah(double a, double b){
        return a + b;
    }

    static double tambah(double a, double b, double c){
        return a + b + c;
    }

    static double kurang(double a, double b){
        return a - b;
    }

    static double kali(double a, double b){
        return a * b;
    }

    static double bagi(double a, double b){
        return a / b;
    }

    static double pangkat(double a, double b){
        return Math.pow(a, b);
    }

    static double akarKuadrat(double a){
        return Math.sqrt(a);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pilihan;
        double a, b, hasil;

        do{
            System.out.println("Kalkulator Method:");
            System.out.println("1.Penjumlahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.println("5.Perpangkatan");
            System.out.println("6.Akar Kuadrat");
            System.out.println("7.Penjumlahan 3 bilangan");
            System.out.println("0.keluar");
            System.out.println("Pilih operasi: ");

            pilihan = sc.nextInt();

            switch (pilihan){
                case 1:
                    System.out.println("Masukkan bilangan pertama: ");
                    a = sc.nextDouble();

                    System.out.println("Masukkan bilangan kedua: ");
                    b = sc.nextDouble();
                    hasil = tambah(a,b);
                    System.out.println("Hasil = " + hasil);
                    break;

                case 2:

                    System.out.println("Masukkan bilangan pertama: ");
                    a = sc.nextDouble();

                    System.out.println("Masukkan bilangan kedua: ");
                    b = sc.nextDouble();
                    hasil = kurang(a,b);
                    System.out.println("Hasil = " + hasil);
                    break;

                case 3:

                    System.out.println("Masukkan bilangan pertama: ");
                    a = sc.nextDouble();

                    System.out.println("Masukkan bilangan kedua: ");
                    b = sc.nextDouble();
                    hasil = kali(a,b);
                    System.out.println("Hasil = " + hasil);
                    break;

                case 4:

                    System.out.println("Masukkan bilangan pertama: ");
                    a = sc.nextDouble();

                    System.out.println("Masukkan bilangan kedua: ");
                    b = sc.nextDouble();

                    if(b == 0){
                        System.out.println("Error: tidak bisa dibagi nol!");
                    }
                    hasil = bagi(a,b);
                    System.out.println("Hasil = " + hasil);
                    break;

                case 5:

                    System.out.println("Masukkan bilangan: ");
                    a = sc.nextDouble();

                    System.out.println("Masukkan pangkat: ");
                    b = sc.nextDouble();
                    hasil = pangkat(a,b);
                    System.out.println("Hasil = " + hasil);
                    break;

                case 6:
                    System.out.println("Masukkan bilangan: ");
                    a = sc.nextDouble();
                    if(a < 0){
                        System.out.println("Error: bilangan tidak boleh negatif! ");
                    }else{
                        hasil = akarKuadrat(a);
                        System.out.println("Hasil = " + hasil);
                    }
                    break;

                case 7:

                    System.out.println("Masukkan bilangan pertama: ");
                    a = sc.nextDouble();

                    System.out.println("Masukkan bilangan kedua: ");
                    b = sc.nextDouble();

                    System.out.println("Masukkan bilangan ketiga: ");
                    double c = sc.nextDouble();
                    hasil = tambah(a,b,c);
                    System.out.println("Hasil = " + hasil);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();


    }
}
