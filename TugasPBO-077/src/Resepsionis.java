import java.util.Scanner;

public class Resepsionis {
    private String namaResepsionis;
    private String jabatan;
    private String nama;
    private int umur;
    private String tipeKamar;
    private String Sarapan;

    //untuk bagian string tipe kamar dan sarapan memang belum dibuat aja, karena beberapa ada di kelas anak jeniskamar.java
    public Resepsionis(String namaResepsionis, String jabatan, String nama, int umur, String tipeKamar, String sarapan) {
        this.namaResepsionis = namaResepsionis;
        this.jabatan = jabatan;
        this.nama = nama;
        this.umur = umur;
        this.tipeKamar = tipeKamar;
        Sarapan = sarapan;
    }

    public Resepsionis() {

    }

    public String getNamaResepsionis() {
        return namaResepsionis;
    }

    public void setNamaResepsionis(String namaResepsionis) {
        this.namaResepsionis = namaResepsionis;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Resepsionis : ");
        setNamaResepsionis(scanner.next());
        System.out.print("Jabatan : ");
        setJabatan(scanner.next());

        System.out.println("-------- Masukkan data tamu");
        System.out.print("Masukkan Nama anda : ");
        setNama(scanner.next());
        System.out.print("Masukkan Umur anda : ");
        setUmur(scanner.nextInt());
    }

    public void cetak(){
        System.out.println("Nama : " + getNama());
        System.out.println("Umur : " + getUmur());
    }
}
