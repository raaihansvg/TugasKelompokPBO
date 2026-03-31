import java.util.ArrayList;

public class LesIntensif {
    /* ATRIBUT */
    private String namaLembaga;
    private String alamat;
    private int tahunBerdiri;
    private ArrayList<Kelas> daftarKelas;
    private ArrayList<Peserta> daftarPeserta;

    /* KONSTRUKTOR DEFAULT */
    public LesIntensif(){
        namaLembaga = "";
        alamat = "";
        tahunBerdiri = 0;
        daftarKelas = new ArrayList<>();
        daftarPeserta = new ArrayList<>();
    }

    /* KONSTRUKTOR DENGAN INPUT PARAMETER */
    public LesIntensif(String namaLembaga, String alamat, int tahunBerdiri){
        this.namaLembaga = namaLembaga;
        this.alamat = alamat;
        this.tahunBerdiri = tahunBerdiri;
        this.daftarKelas = new ArrayList<>();
        this.daftarPeserta = new ArrayList<>();
    }

    /* METHOD */
    /* SETTER */
    public void setnamaLembaga(String namaLembaga){
        this.namaLembaga = namaLembaga;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setTahunBerdiri(int tahunBerdiri){
        this.tahunBerdiri = tahunBerdiri;
    }

    /* GETTER */
    public String getnamaLembaga(){
        return namaLembaga;
    }
    public String getAlamat(){
        return alamat;
    }
    public int gettahunBerdiri(){
        return tahunBerdiri;
    }

    /* METHOD TAMBAHAN */
    public void buatKelas(String idKelas, String namaKelas, String jadwal, int kapasitas){
        Kelas K = new Kelas(idKelas,namaKelas,jadwal,kapasitas);
        daftarKelas.add(K);
    }

    public void daftarPeserta(String nama){
        Peserta P = new Peserta();
        P.setNama(nama);
        daftarPeserta.add(P);
    }
}
