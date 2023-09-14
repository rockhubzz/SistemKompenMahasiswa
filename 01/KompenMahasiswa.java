import java.util.Scanner;

public class KompenMahasiswa {
    public static void main(String[] args) {
        // Data Username
        String correctUsername = "admin1";
        String correctPassword = "mahakompen";

        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = false;

        while (!loggedIn) {
            // Login
            System.out.println("\n=== Sistem Kompen Mahasiswa ===");
            System.out.print("Masukkan Username anda: ");
            String enteredUsername = scanner.nextLine();
            char[] enteredPasswordChars = null;
            try {
                System.out.print("Masukkan password anda (Password tidak akan terlihat): ");
                enteredPasswordChars = System.console().readPassword();
            } catch (Exception e) {
                enteredPasswordChars = scanner.nextLine().toCharArray();
            }
            String enteredPassword = new String(enteredPasswordChars);

            if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                System.out.println("Selamat Datang, " + enteredUsername + "!");
                loggedIn = true;
            } else {
                System.out.println("Username atau Password salah. Silakan coba lagi.");
            }
        }

        int choice;

        // Main Menu
        while (true) {
            System.out.println("\n=== Sistem Kompen Mahasiswa ===");
            System.out.println("1. Informasi Profil Mahasiswa");
            System.out.println("2. Informasi Polinema");
            System.out.println("3. Hitung Kompen");
            System.out.println("7. Keluar");
            System.out.print("Masukkan pilihan anda: ");

            // Scanner
            Scanner in = new Scanner(System.in);
            // Input user
            choice = in.nextInt();

            // Kunci Jawaban
            switch (choice) {
                case 1:
                    System.out.println("\n=== Informasi Profil Mahasiswa ===");
                    System.out.println("Nama                        : Meganthropus Paleojavanicus");
                    System.out.println("Tempat, Tanggal Lahir       : 32 Mei 1997 SM");
                    System.out.println("Kelas                       : TI-IF");
                    System.out.println("Jurusan                     : Teknologi Informasi");
                    System.out.println("Prodi                       : Teknik Informatika");
                    break;
                case 2:
                    int subChoice2;
                    // Submenu 2 Informasi Polinema
                    while (true) {
                        System.out.println("\n=== Informasi Polinema ===");
                        System.out.println("1. Letak Polinema");
                        System.out.println("2. Warna Kampus Polinema");
                        System.out.println("3. Kembali");
                        System.out.print("Masukkan pilihan anda: ");
                        subChoice2 = in.nextInt();

                        // Jawaban Submenu
                        switch (subChoice2) {
                            case 1:
                                System.out.println("Malang");
                                break;
                            case 2:
                                System.out.println("Kampus Biru Jaya Jaya Jaya");
                                break;
                            case 3:
                                // kembali
                                break;
                            default:
                                System.out.println("Kode yang anda pilih tidak valid.");
                                break;
                        }

                        if (subChoice2 == 3) {
                            break;
                        }
                    }
                    break;
                case 3:
                    int subChoice3;
                    // Submenu Hitung Kompen
                    while (true) {
                        System.out.println("\n=== Sistem Penghitungan Kompen Mahasiswa ===");
                        System.out.println("1. Hitung Rekapitulasi Kompen");
                        System.out.println("2. Informasi Peraturan Sistem Kompen Mahasiswa");
                        System.out.println("3. Kembali");
                        System.out.print("Masukkan Pilihan Anda: ");
                        subChoice3 = in.nextInt();

                        // Jawaban Submenu
                        switch (subChoice3) {
                            case 1:
                                System.out.print("Masukkan jumlah jam alpa anda pada semester ini: ");
                                double inputHours = scanner.nextDouble();

                                // Kalkulator
                                double factor = 2.0;
                                double result = inputHours * factor;
                                System.out.println("Total jam tugas kompen anda: " + result + " jam");
                                break;
                            case 2:
                                System.out.println("Jumlah jam kompen yang harus dikerjakan didapatkan dari total jam alpa semester ini dikalikan dengan dua");
                                System.out.println("Contoh: Budi selama semester 1 alpa selama 4 jam, maka Budi harus menjalani tugas kompen selama 8 jam");
                                break;
                            case 3:
                                // kembali
                                break;
                            default:
                                System.out.println("Kode yang anda pilih tidak valid.");
                                break;
                        }

                        if (subChoice3 == 3) {
                            break;
                        }
                    }
                    break;
                case 7:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    System.exit(0); // Exit
                default:
                    System.out.println("Kode yang anda pilih tidak valid.");
                    break;
            }
        }
    }
}
