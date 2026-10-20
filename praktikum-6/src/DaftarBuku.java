public class DaftarBuku {
    public static void main(String[] args){
        Buku[] daftar = new Buku[3];

        daftar[0] = new Buku("Funiculi Funicula", "Toshikazu Kawaguchi", "2015");
        daftar[1] = new Buku("Bumi", "Tere Liye", "2014");
        daftar[2] = new Buku("Teruslah Bodoh, Jangan Pintar", "Tere Liye", "2024");

        for (Buku b : daftar) {
            b.tampilkanBuku();
            System.out.println("---");
        }
    }
}
