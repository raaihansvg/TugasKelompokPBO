import java.util.ArrayList;

public class Kelas implements Jadwal {
    /* ATRIBUT */
    private String idKelas;
    private String namaKelas;
    private String jadwal;
    private int kapasitas;
    private ArrayList <Peserta> daftarPeserta;


    /* KONSTRUKTOR DEFAULT */
    public Kelas(){
        idKelas = "";
        namaKelas = "";
        jadwal = "";
        kapasitas = 0;
        daftarPeserta = new ArrayList<>();  
    }

    /* KONSTRUKTOR DENGAN INPUT PARAMETER */

    public Kelas(String idKelas, String namaKelas, String jadwal,int kapasitas){
        this.idKelas = idKelas;
        this.namaKelas = namaKelas;
        this.jadwal = jadwal;
        this.kapasitas = kapasitas;
        this.daftarPeserta = new ArrayList<>();
    }

    /* METHOD */
    /* SETTER */
    public void setIdKelas(String idKelas){
        this.idKelas = idKelas;
    }

    public void setNamaKelas(String namaKelas){
        this.namaKelas = namaKelas;
    }
    
    public void setJadwal(String jadwal){
        this.jadwal = jadwal;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    /* GETTER */
    public String getIdKelas(){
        return idKelas;
    }
    public String getNamaKelas(){
        return namaKelas;
    }
    public String getJadwal(){
        return jadwal;
    }
    public int getKapasitas(){
        return kapasitas;
    }
    /* METHOD TAMBAHAN */
    public int getSisaKursi(){
        int jumlahPeserta = daftarPeserta.size();
        int sisa = kapasitas - jumlahPeserta;
        return sisa;
    }
    public void addPeserta(Peserta newdaftarPeserta){
        daftarPeserta.add(newdaftarPeserta);
    }
    /* METHOD INTERFACE */
    public String lihatJadwal(){
        String Hasil = "Kelas " + getNamaKelas() + " dan Jadwal " + getJadwal();
        return Hasil;
    }

    public boolean cekKetersediaan(){
        return getSisaKursi() > 0;
    }



}
