//BRIANA FIRSTA
//2111522024
public class Asdos extends Mahasiswa {
    private int jamNgasdos;
    public Asdos(String nama, int jamNgasdos, int sks){
        super(nama, sks); //downchasting
        this.jamNgasdos = jamNgasdos + sks;
    }
    public int getJamSibuk(){ //overriding : poly
        System.out.println(getNama() + " adalah seorang asdos dengan jam sibuk " + jamNgasdos);
        return jamNgasdos;
    }
}
