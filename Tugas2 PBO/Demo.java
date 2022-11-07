//BRIANA FIRSTA
//2111522024
public class Demo {
    public static void main(String[] args) { //poly
        Asdos s = new Asdos("Fairuzikun",30, 43); 
        Dosen t = new Dosen("Raja OP Damanik", 5);
        Elemen u = new Asdos("Angel-chan", 30, 34); //upchasting
        Mahasiswa v = new Mahasiswa("Firman", 20);
        Elemen w = new Mahasiswa("Nid to pass this sem", 23); //upchasting
        Elemen x = new Dosen("Nivotko", 3); //upchasting

        int s1 = s.getJamSibuk();
        int t1 = t.getJamSibuk();
        int u1 = u.getJamSibuk();
        int v1 = v.getJamSibuk();
        int w1 = w.getJamSibuk();
        int x1 = x.getJamSibuk();

        int Total = s1+t1+u1+v1+w1+x1;
        
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + Total);
    }
    
}
