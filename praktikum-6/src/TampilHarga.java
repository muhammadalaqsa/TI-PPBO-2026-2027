public class TampilHarga {
    public static void main (String[] args){
        Produk p1 = new Produk("Laptop", 14000000, 1000000);
        p1.tampilProduk();
        System.out.println(p1.isMahal());

        Produk p2 = new Produk("Mouse", 140000, 1000000);
        p2.tampilProduk();
        System.out.println(p2.isMahal());
    }
}
