//BRIANA FIRSTA
//2111522024
public class Dosen extends Elemen {
    private int jumlahHariKerja;
    public Dosen(String nama, int jumlahHariKerja){
        super(nama); // downchasting
        this.jumlahHariKerja = jumlahHariKerja * 8;
    }
    public int getJamSibuk(){
        System.out.println(getNama() + " adalah seorang dosen dengan jam sibuk " + jumlahHariKerja);
        return jumlahHariKerja;
    }
}
