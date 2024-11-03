public class Layanan {
    private int Tersedia;

    public Layanan() {
        this.Tersedia = 50;
    }

    public int getTersedia() {
        return Tersedia;
    }

    public void setTersedia(int tersedia) {
        Tersedia = tersedia;
    }

    public void KurangiTersedia(){
        if(Tersedia > 0){
            Tersedia--;
        }else{
            System.out.println("Maaf kamarnya habis");
        }
    }

    public void cetak(){
        System.out.println("Jumlah Kamar tersedia : " + this.getTersedia());
    }

}
