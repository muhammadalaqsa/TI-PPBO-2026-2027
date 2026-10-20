public class PersegiArray {
    public static void main(String[] args){
        Persegi [] sisi = new Persegi[4];

        sisi[0] = new Persegi(5);
        sisi[1] = new Persegi(9);
        sisi[2] = new Persegi(4);
        sisi[3] = new Persegi(6);

        for(Persegi p : sisi){
            p.tampilHasil();
            System.out.println("-----");
        }
    }
}
