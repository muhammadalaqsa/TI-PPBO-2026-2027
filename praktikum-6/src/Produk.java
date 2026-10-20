public class Produk {
    String namaProduk;
    double harga;
    double batasHarga;

    public Produk() {
        namaProduk = "Belum diisi";
        harga = 0;
        batasHarga = 0;
    }

    public Produk(String namaProduk, double harga, double batasHarga){
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.batasHarga = batasHarga;
    }

    public void tampilProduk(){
        System.out.println("Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Batas Harga: " + batasHarga);
    }

    public boolean isMahal(){
            if(harga > batasHarga){
                System.out.println("Barang Mahal!");
                return true;
            } else {
                return false;
            }
        }
    }


