import java.util.Scanner;

public class Tamu {
    private String nama;
    private int Umur;
    private int Durasi;

    public Tamu(String nama, int umur) {
        this.nama = nama;
        this.Umur = umur;
    }

    public Tamu() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int umur) {
        this.Umur = umur;
    }

    public int getDurasi() {
        return Durasi;
    }

    public void setDurasi(int durasi) {
        Durasi = durasi;
    }

    public void InputNama(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        setNama(scanner.next());
        System.out.print("Masukkan Umur : ");
        setUmur(scanner.nextInt());

    }

    public void cetak(){
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Umur\t\t: " + getUmur());

    }

}
