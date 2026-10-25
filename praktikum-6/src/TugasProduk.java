public class TugasProduk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;


    public TugasProduk(){
        kodeProduk = "Beelum ada";
        namaProduk = "Belum diisi";
        harga      = 0;
        stok       = 0;
    }

    public TugasProduk(String kodeProduk, String namaProduk, double harga, int stok){
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga      = harga;
        this.stok       = stok;
    }

    public double hitungTotalHarga(int jumlahBeli){;
        return harga * jumlahBeli;
        }

    public void kurangiStok(int jumlah){
        if(jumlah <= 0){
            System.out.println("Jumlah pembelian tidak valid!");
        } else if (stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Pembelian berhasil!");
        }else {
            System.out.println("Stok tidak cukup!");
        }

    }

    public void tampilProduk(){
        System.out.println("Kode Produk: " + kodeProduk);
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga      : Rp" + harga);
        System.out.println("Stok       : " + stok);
    }
}




