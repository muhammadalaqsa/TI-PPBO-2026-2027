public class Buku {
    String judul;
    String pengarang;
    String tahunTerbit;

    public Buku() {
    judul = "Belum diisi";
    pengarang = "Belum diisi";
    tahunTerbit = "Belum diisi";
    }

    public Buku(String judul, String pengarang, String tahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanBuku(){
        System.out.println("Judul Buku: " + judul);
        System.out.println("Nama Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
