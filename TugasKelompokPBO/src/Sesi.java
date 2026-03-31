import java.util.Date;

public class Sesi {
    /* ATRIBUT */
    private String idSesi;
    private Date tanggal;
    private int durasi;
    /* KONSTRUKTOR DEFAULT */
    public Sesi(){
        idSesi = "";
        tanggal = new Date();
        durasi = 0;
    }
    /* KONSTRUKTOR INPUT PARAMETER */
    public Sesi(String idSesi, Date tanggal, int durasi) {
        this.idSesi = idSesi;
        this.tanggal = tanggal;
        this.durasi = durasi;
    }
    /* METHOD */
    /* SETTER */
    public void setIdSesi(String idSesi){
        this.idSesi = idSesi;
    }
    public void setTanggal(Date tanggal){
        this.tanggal = tanggal;
    }
    public void setDurasi(int durasi){
        this.durasi = durasi;
    }
    /* GETTER */
    public String getIdSesi(){
        return idSesi;
    }
    public Date getTanggal(){
        return tanggal;
    }
    public int getDurasi(){
        return durasi;
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