public class Kelas implements IJadwalable {

    private String idKelas;
    private String namaKelas;
    private String jadwal;
    private int kapasitas;
    private java.util.ArrayList<Peserta> daftarPeserta;

    public Kelas(String idKelas, String namaKelas, String jadwal, int kapasitas) {
        this.idKelas = idKelas;
        this.namaKelas = namaKelas;
        this.jadwal = jadwal;
        this.kapasitas = kapasitas;
        this.daftarPeserta = new java.util.ArrayList<Peserta>();
    }

    // Method

    @Override
    public String lihatJadwal() {
        String hasil = "Kelas: " + namaKelas + " & Jadwal: " + jadwal;
        return hasil;
    }

    @Override
    public boolean cekKetersediaan(java.util.Date tgl) {
        return getSisaKursi() > 0;
    }

    public void tambahPeserta(Peserta p) {
        int sisa = getSisaKursi();
        if (sisa > 0) {
            daftarPeserta.add(p);
            System.out.println("Peserta berhasil ditambahkan ke kelas " + namaKelas);
        } else {
            System.out.println("Kelas " + namaKelas + " sudah penuh!");
        }
    }

    public void batalkan() {
        System.out.println("Kelas " + namaKelas + " jadwal " + jadwal + " dibatalkan.");
    }

    public int getSisaKursi() {
        int jumlahPeserta = daftarPeserta.size();
        int sisa = kapasitas - jumlahPeserta;
        return sisa;
    }

    @Override
    public String toString() {
        String info = "Kelas{id='" + idKelas + "', nama='" + namaKelas + "', jadwal='" + jadwal + "', sisaKursi=" + getSisaKursi() + "}";
        return info;
    }

    // Setter dan getter

    public String getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public java.util.ArrayList<Peserta> getDaftarPeserta() {
        return daftarPeserta;
    }
}