public class TokoDemo {
    public static void main(String[] args){

        TugasProduk [] daftar = new TugasProduk[5];

        daftar[0] = new TugasProduk("001","Qtela", 8000, 50);
        daftar[1] = new TugasProduk("002","Mentos", 5000, 25);
        daftar[2] = new TugasProduk("003","Ultra Milk 250ml", 6000, 10);
        daftar[3] = new TugasProduk("004","Sari Roti Sobek", 18000, 10);
        daftar[4] = new TugasProduk("005","GoodDay Mocacinno", 20000, 7);

        System.out.println("\n===DAFTAR PEMBELIAN PRODUK===");

        for (int i = 0; i < daftar.length; i++){

            daftar[i].tampilProduk();
        }

        System.out.println("\n===PEMBELIAN PRODUK===");

        //Simulasi pembelian pertama

            int jumlahBeli1 = 2;

        System.out.println("Produk: " + daftar[0].namaProduk);
        System.out.println("Jumlah beli: " + jumlahBeli1);
        System.out.println("Total harga: " + daftar[0].hitungTotalHarga(jumlahBeli1));

        daftar[0].kurangiStok(jumlahBeli1);

        //Simulasi pembelian kedua

        int jumlahBeli2 = 3;

        System.out.println("Produk: " + daftar[1].namaProduk);
        System.out.println("Jumlah beli: " + jumlahBeli1);
        System.out.println("Total harga: " + daftar[1].hitungTotalHarga(jumlahBeli1));

        daftar[1].kurangiStok(jumlahBeli1);

        //Simulasi stok tidak mencukupi

        System.out.println("\n===SIMULASI STOK TIDAK CUKUP===");

        System.out.println("Produk: " + daftar[2].namaProduk);
        System.out.println("Stok: " + daftar[2].stok);
        System.out.println("Mencoba membeli 20pcs");

        daftar[2].kurangiStok(20);

        //Mencari produk dengan harga termahal

        System.out.println("\n===PRODUK TERMAHAL===");

        TugasProduk termahal = daftar[0];

            for(int i = 1; i < daftar.length; i++){
                if(daftar[i].harga > termahal.harga){
                    termahal = daftar[i];
                }
            }

            termahal.tampilProduk();

        //Menampilkan data produk setelah transaksi

        System.out.println("\n===DATA PRODUK SETELAH TRANSAKSI===");

            for(int i = 0; i < daftar.length; i++){
                daftar[i].tampilProduk();
            }
    }
}
