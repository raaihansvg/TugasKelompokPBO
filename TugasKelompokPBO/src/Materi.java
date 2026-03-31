public class Materi {
    /* ATRIBUT */
    private String idMateri;
    private String judul;
    /* KONSTRUKTOR DEFAULT */
    public Materi(){
        idMateri = "";
        judul = "";
    }
    /* KONSTRUKTOR INPUT PARAMETER */

    public Materi(String idMateri, String judul) {
        this.idMateri = idMateri;
        this.judul = judul;
    }
    /* METHOD */
    /* SETTER */
    public void setJudul(String judul){
        this.judul = judul;
    }
    /* GETTER */
    public String getidMateri(){
        return idMateri;
    }
    public String getJudul(){
        return judul;
    }

    public void uploadMateri() {
        System.out.println("Materi '" + judul + "' berhasil diupload.");
    }

    public void downloadMateri() {
        System.out.println("Materi '" + judul + "' sedang didownload.");
    }

    public void editMateri(String judulBaru) {
        this.judul = judulBaru;
        System.out.println("Materi berhasil diupdate jadi: " + judulBaru);
    }
}