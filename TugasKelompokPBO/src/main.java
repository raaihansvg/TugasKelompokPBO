import java.util.Date;

public class main {
    public static void main(String[] args){

        Peserta p1 = new Peserta(new Date(), "Lunas", "Informatika");
        p1.setId("P001");
        p1.setNama("Raihan");
        p1.setEmail("raihan@mail.com");
        p1.setNoTelp("08123456789");

        System.out.println("=== DATA PESERTA ===");
        p1.cetakInfo();

        System.out.println();
        
        Pengajar pj1 = new Pengajar("Pemrograman", 5000000, "PBO");
        pj1.setId("T001");
        pj1.setNama("Pak Budi");
        pj1.setEmail("budi@mail.com");
        pj1.setNoTelp("08987654321");

        System.out.println("=== DATA PENGAJAR ===");
        pj1.cetakInfo();
    }
}