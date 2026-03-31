import java.util.Date;

public class MainApp {
    public static void main(String[] args){

        // ======================
        //  PESERTA
        // ======================
        Peserta p1 = new Peserta(new Date(), "Lunas", "Informatika");
        p1.setId("P001");
        p1.setNama("Raihan");
        p1.setEmail("raihan@mail.com");
        p1.setNoTelp("08123456789");

        System.out.println("=== DATA PESERTA ===");
        p1.cetakInfo();

        // ======================
        // PENGAJAR
        // ======================
        Pengajar pj1 = new Pengajar("Pemrograman", 5000000, "PBO");
        pj1.setId("T001");
        pj1.setNama("Pak Budi");
        pj1.setEmail("budi@mail.com");
        pj1.setNoTelp("08987654321");

        System.out.println("\n=== DATA PENGAJAR ===");
        pj1.cetakInfo();

        // ======================
        // KELAS
        // ======================
        Kelas k1 = new Kelas("K001", "PBO", "Senin 08:00", 2);
        k1.addPeserta(p1);

        System.out.println("\n=== DATA KELAS ===");
        System.out.println(k1.lihatJadwal());
        System.out.println("Sisa kursi: " + k1.getSisaKursi());
        System.out.println("Tersedia? " + k1.cekKetersediaan());

        // ======================
        // LES INTENSIF
        // ======================
        LesIntensif les = new LesIntensif("Les Adhy hacker", "Semarang", 2020);
        les.buatKelas("K002", "Algoritma", "Selasa 10:00", 3);
        les.daftarPeserta("adhy");

        System.out.println("\n=== LES INTENSIF ===");
        System.out.println("Lembaga: " + les.getnamaLembaga());
        System.out.println("Alamat: " + les.getAlamat());

        // ======================
        // MATERI
        // ======================
        Materi m1 = new Materi("M001", "Java OOP");

        System.out.println("\n=== MATERI ===");
        m1.uploadMateri();
        m1.downloadMateri();
        m1.editMateri("Java OOP Lanjut");

        // ======================
        // SESI
        // ======================
        Sesi s1 = new Sesi("S001", new Date(), 90);

        System.out.println("\n=== SESI ===");
        s1.mulaiSesi();
        s1.absen("Raihan");
        s1.absen(123);
        s1.akhiriSesi();
        System.out.println(s1.getRekap());
    }
}