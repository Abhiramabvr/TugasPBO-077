public class Kamar {
    private int noKamar;
    private String tipeKamar;

    public Kamar(int noKamar, String tipeKamar) {
        this.noKamar = noKamar;
        this.tipeKamar = tipeKamar;
    }

    public Kamar() {

    }

    public int getNoKamar() {
        return noKamar;
    }

    public void setNoKamar(int noKamar) {
        this.noKamar = noKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }
}
