//BRIANA FIRSTA
//2111522024
public class Mahasiswa extends Elemen {
    private int sks;
    public Mahasiswa(String nama, int sks){
        super(nama); //downchasting
        this.sks = sks * 3;
    }
    public int getJamSibuk(){
        System.out.println(getNama() + " adalah seorang mahasiswa dengan jam sibuk " + sks);
        return sks;
    }
}
