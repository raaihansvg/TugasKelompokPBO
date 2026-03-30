abstract class User implements CetakInfo{
    /* ATRIBUT */
    protected String id;
    protected String nama;
    protected String email;
    protected String noTelp;

    /* KONSTRUKTOR DEFAULT */

    public User(){
        id = "";
        nama = "";
        email = "";
        noTelp = "";
    }

    /* KONSTRUKTOR INPUT */

    public User(String id, String nama, String email, String noTelp){
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.noTelp = noTelp;
    }

    /* METHOD */
    /* SETTER */
    public void setId(String id){
        this.id = id;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }
    /* ABSTRACT METHOD */
    public abstract String getId();
    public abstract String getNama();
    public abstract String getEmail();
    public abstract String getNoTelp();

    public void PrintDataDiri(){
        System.out.println("id: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("email: " + email );
        System.out.println("NoTelp: " + noTelp);
    }
    /* INTERFACE METHOD */
    @Override
    public void cetakInfo(){
        PrintDataDiri();
    }
}
