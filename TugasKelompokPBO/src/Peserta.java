import java.util.Date;
public class Peserta extends User{
    /* ATRIBUT */
    private Date tanggalDaftar;
    private String statusPembayaran;
    private String kelas;

    /* KONSTRUKTOR DEFAULT */

    public Peserta(){
        super();
        this.tanggalDaftar = null;
        this.statusPembayaran = "";
        this.kelas = "";     
    }
    /* KONSTRUKTOR INPUT */

    public Peserta(Date TanggalDaftar, String statusPembayaran, String kelas){
        super();
        this.tanggalDaftar = TanggalDaftar;
        this.statusPembayaran = statusPembayaran;
        this.kelas = kelas;
    }

    /* METHOD */
    /* SETTER */
    public void setTglDaftar(Date tanggalDaftar){
        this.tanggalDaftar = tanggalDaftar;
    }
    public void setStatusPembayaran(String statusPembayaran){
        this.statusPembayaran = statusPembayaran;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    /* GETTER */
    public Date getTglDaftar(){
        return tanggalDaftar;
    }
    public String getStatusPembayaran(){
        return statusPembayaran;
    }
    public String getKelas(){
        return kelas;
    }

    @Override
    public String getId(){
        return id;
    }

    @Override 
    public String getNama(){
        return nama;
    }

    @Override
    public String getEmail(){
        return email;
    }

    @Override
    public String getNoTelp(){
        return noTelp;
    }

    @Override
    public void PrintDataDiri(){
        super.PrintDataDiri();
        System.out.println("Tanggal Daftar: " + tanggalDaftar);
        System.out.println("Status Pembayaran: " + statusPembayaran);
        System.out.println("Kelas: " + kelas);
    }   
}
