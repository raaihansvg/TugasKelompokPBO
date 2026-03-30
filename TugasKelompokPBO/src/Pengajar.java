public class Pengajar extends User{
    /* ATRIBUT */
    private String spesialisasi;
    private double gaji;
    private String kelasYgDiajar;

    /* KONSTRUKTOR DEFAULT */
    public Pengajar(){
        super();
        spesialisasi = "";
        gaji = 0.0;
        kelasYgDiajar = "";
    }

    /* KONSTRUKTOR INPUT */
    public Pengajar(String spesialisasi, double gaji, String kelasYgDiajar){
        super();
        this.spesialisasi = spesialisasi;
        this.gaji = gaji;
        this.kelasYgDiajar = kelasYgDiajar;
    }

    /* METHOD */
    /* SETTER */
    public void setSpesialisasi(String spesialisasi){
        this.spesialisasi = spesialisasi;
    }

    public void setGaji(double gaji){
        this.gaji = gaji;
    }

    public void setKelasYgDiajar(String kelasYgDiajar){
        this.kelasYgDiajar = kelasYgDiajar;
    }
    /* SETTER */
    public String getSpesialisasi(){
        return spesialisasi;
    }

    public double getGaji(){
        return gaji;
    }

    public String getKelasYgDiajar(){
        return kelasYgDiajar;
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
        System.out.println("spesialisasi " + spesialisasi);
        System.out.println("gaji: " + gaji);
        System.out.println("kelas yang diajar: " + kelasYgDiajar);
    }   

}
