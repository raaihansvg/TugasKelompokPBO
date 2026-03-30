import java.util.Date;

public class Sesi {
    private String idSesi;
    private Date tanggal;
    private int durasi;

    public Sesi(String idSesi, Date tanggal, int durasi) {
        this.idSesi = idSesi;
        this.tanggal = tanggal;
        this.durasi = durasi;
    }

    public void mulaiSesi() {
        assert idSesi != null : "ID Sesi belum di-set!";
        System.out.println("Sesi " + idSesi + " dimulai.");
    }

    public void akhiriSesi() {
        System.out.println("Sesi " + idSesi + " berakhir.");
    }

    public void absen(String namaPeserta) {
        if (namaPeserta == null) throw new IllegalArgumentException("Nama kosong!");
        System.out.println(namaPeserta + " hadir.");
    }

    public void absen(int idPeserta) {
        System.out.println("ID " + idPeserta + " hadir.");
    }

    public String getRekap() {
        return "Sesi: " + idSesi + " (" + durasi + " min)";
    }
}
