public class BukuArray {
    public static void main(String[] args){
        Buku [] daftar = new Buku[4];

        daftar[0] = new Buku("Funiculi Funicula 2", "Toshikazu Kawaguchi", "2022");
        daftar[1] = new Buku("Teruslah Bodoh, Jangan Pintar", "Tere Liye", "2024");
        daftar[2] = new Buku("Matahari Minor", "Tere Liye", "2022");
        daftar[3] = new Buku("Angsa dan Kelelawar", "Keigo Higashino", "2023");

        for(Buku b : daftar){
            b.tampilkanBuku();
            System.out.println("-----");
        }
    }
}
