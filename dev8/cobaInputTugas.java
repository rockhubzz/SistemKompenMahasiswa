import java.util.Scanner;

public class cobaInputTugas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        class TugasTersedia {
            private String pemberiTugas;
            private String judulTugas;
            private String jumlahKompen;
            private String kuota;
            private String tanggalPost;

            public TugasTersedia(String pemberiTugas, String judulTugas, String jumlahKompen, String kuota, String tanggalPost) {
                this.pemberiTugas = pemberiTugas;
                this.judulTugas = judulTugas;
                this.jumlahKompen = jumlahKompen;
                this.kuota = kuota;
                this.tanggalPost = tanggalPost;
            }

            public String getpemberiTugas() {
                return pemberiTugas;
            }

            public String getjudulTugas() {
                return judulTugas;
            }

            public String getjumlahKompen() {
                return jumlahKompen;
            }

            public String getkuota() {
                return kuota;
            }

            public String gettanggalPost() {
                return tanggalPost;
            }
        }

        TugasTersedia[] tugasTersedia = new TugasTersedia[]{
            new TugasTersedia("Mustika Mentari, S.Kom, M.Kom", "JIP", "100 jam", "1 mhs", "28-9-2023"),
            new TugasTersedia("Meyti Eka Apriani, ST, MT", "Editing Word", "2 jam", "1 mhs", "1-10-2023"),
            new TugasTersedia("Meyti Eka Apriani, ST, MT", "Membantu penulisan buku", "42 jam", "1 mhs", "3-10-2023"),
            new TugasTersedia("Kadek Suarjuna Batubulan", "Rekap nilai", "20 jam", "5 mhs", "5-10-2023"),
            new TugasTersedia("Kadek Suarjuna Batubulan", "Edit form surat", "12 jam", "1 mhs", "25-10-2023")
        };

        while (true) {
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
            System.out.printf("| %-35s | %-30s | %15s | %10s | %15s | %n", "PEMBERI TUGAS", "JUDUL TUGAS", "JUMLAH KOMPEN", "KUOTA", "TANGGAL DIPOST");
            System.out.println("--------------------------------------------------------------------------------------------------------------------");

            for (TugasTersedia tugas : tugasTersedia) {
                System.out.printf("| %-35s | %-30s | %15s | %10s | %15s | %n",
                        tugas.getpemberiTugas(), tugas.getjudulTugas(), tugas.getjumlahKompen(), tugas.getkuota(), tugas.gettanggalPost());
            }

            

            System.out.println("--------------------------------------------------------------------------------------------------------------------");
            System.out.println("0. Kembali");
            System.out.println("1. Keluar");
            System.out.println("2. Tambah Tugas Baru");
            System.out.print("Masukkan pilihan Anda: ");
            int subChoice = scanner.nextInt();
            scanner.nextLine();

            switch (subChoice) {
                case 0:
                    break;
                case 1:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    System.exit(0);
                    break;
                case 2:
                    // Menerima input pengguna untuk tugas baru dan menambahkannya ke dalam array tugasTersedia
                   

                    System.out.print("Pemberi Tugas: ");
                    String pemberiTugas = scanner.nextLine();

                    System.out.print("Judul Tugas: ");
                    String judulTugas = scanner.nextLine();
                    System.out.print("Jumlah Kompen: ");
                    String jumlahKompen = scanner.nextLine();
                    System.out.print("Kuota: ");
                    String kuota = scanner.nextLine();
                    System.out.print("Tanggal Dipost: ");
                    String tanggalPost = scanner.nextLine();

                    TugasTersedia tugasBaru = new TugasTersedia(pemberiTugas, judulTugas, jumlahKompen, kuota, tanggalPost);

                    // Menambahkan tugas baru ke dalam array
                    TugasTersedia[] newTugas = new TugasTersedia[tugasTersedia.length + 1];
                    System.arraycopy(tugasTersedia, 0, newTugas, 0, tugasTersedia.length);
                    newTugas[tugasTersedia.length] = tugasBaru;
                    tugasTersedia = newTugas;

                    System.out.println("Tugas baru berhasil ditambahkan!");
                    break;
                default:
                    System.out.println("Kode yang Anda pilih tidak valid.");
                    break;
            }
        }
    }
}
