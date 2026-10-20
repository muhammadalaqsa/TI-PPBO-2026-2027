public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa(); // connstructor default
        Mahasiswa m2 = new Mahasiswa(); // berparameter

        m2.nama = "Siti";
        m2.nim = "67890";
        m2.ipk = 3.90;

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);
    }
}
