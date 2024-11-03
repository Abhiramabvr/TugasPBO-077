public class Staff extends Resepsionis{

    public Staff(String namaResepsionis, String jabatan, String nama, int umur, String tipeKamar, String sarapan) {
        super(namaResepsionis, jabatan, nama, umur, tipeKamar, sarapan);
    }

    public Staff() {
    }

    @Override
    public String getNamaResepsionis() {
        return super.getNamaResepsionis();
    }

    @Override
    public void setJabatan(String jabatan) {
        super.setJabatan(jabatan);
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public void cetak() {
        super.cetak();
    }
}
