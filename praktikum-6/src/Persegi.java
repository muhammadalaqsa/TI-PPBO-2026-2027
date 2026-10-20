public class Persegi {
    double sisi;

    public Persegi (double sisi){
        this.sisi = sisi;
    }
    public double hitungLuas(){
        return sisi * sisi;
    }

    public double hitungKeliling(){
        return 4 * sisi;
    }

    public void tampilHasil(){
        System.out.println("Luas Persegi: " + hitungLuas());
        System.out.println("Keliling Persegi: " + hitungKeliling());
    }

}

