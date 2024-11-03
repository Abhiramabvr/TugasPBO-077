import java.util.Scanner;

public class jenisKamar extends Kamar{

    private int Durasi;

    public jenisKamar(int noKamar, String tipeKamar) {
        super(noKamar, tipeKamar);
    }

    public jenisKamar() {
        super();
    }

    @Override
    public void setNoKamar(int noKamar) {
        super.setNoKamar(noKamar);
    }

    @Override
    public void setTipeKamar(String tipeKamar) {
        super.setTipeKamar(tipeKamar);
    }

    public int getDurasi() {
        return Durasi;
    }

    public void setDurasi(int durasi) {
        Durasi = durasi;
    }

    public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan No Kamar : ");
        setNoKamar(scanner.nextInt());
        System.out.print("Masukkan tipe kamar : ");
        setTipeKamar(scanner.next());
        System.out.print("Durasi : ");
        setDurasi(scanner.nextInt());
    }

    public void cetak(){
        System.out.println("Tipe Kamar\t: " + getTipeKamar());
        System.out.println("Kamar nomor\t: " + getNoKamar());

    }

    public void time(){
        if(getTipeKamar().equalsIgnoreCase("Suite")) {
            System.out.print("Durasi\t\t: " + getDurasi() + "\n\nTotal Biaya Penginapan\t: Rp." + (getDurasi() * 1500000) + "\n\n");
        } else if (getTipeKamar().equalsIgnoreCase("Biasa")) {
             System.out.print("Durasi\t\t: " + getDurasi() + "\n\nTotal Biaya Penginapan\t: Rp." + (getDurasi() * 850000) + "\n\n");

        }

    }
}
