public class Mahasiswa06 {
    String nim;
    String nama;
    String kelas;
    double ipk;

     Mahasiswa06(){

     }

    public Mahasiswa06(String nm, String name,String kls, double ip) {
        nim =nm;
        nama =name;
        ipk = ip;
        kelas =kls;
    }
    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("kelas: " + kelas );
        System.out.println("IPK: " +ipk );

    }
}
