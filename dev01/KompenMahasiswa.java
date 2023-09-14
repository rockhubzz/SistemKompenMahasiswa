import java.util.Scanner;
import java.io.Console;

public class KompenMahasiswa {
    public static void main(String[] args) {
        // Menu Siapa?
        while (true) {
            System.out.println("\n=== Sistem Kompen Mahasiswa ===");
            System.out.println("Siapa ini?");
            System.out.println("1. Admin");
            System.out.println("2. Dosen/Admin/Teknisi");
            System.out.println("3. Mahasiswa");
            System.out.println("Masukkan pilihan anda: ");


            int account;

            // Scanner
            Scanner in = new Scanner(System.in);
            // Input user
            account = in.nextInt();

            // Pilihan Akun
            switch (account) {
                case 1:
                    // Data Username
                    String correctAdmin = "admin1";
                    String correctPasswordAdmin = "miminkompen";

                    Console consoleAdmin = System.console();
                    boolean loggedInAdmin = false;

                    while (!loggedInAdmin) {
                        // Login
                        System.out.println("\n=== Sistem Kompen Mahasiswa ===");
                        System.out.print("Masukkan Username anda: ");
                        String enteredUsername = in.next();

                        // Use console for password input to hide it if available
                        char[] enteredPasswordChars = null;
                        try {
                            enteredPasswordChars = consoleAdmin.readPassword("Masukkan password anda (Password anda tidak akan terlihat): ");
                        } catch (Exception e) {
                            // Fall back to Scanner if console is not available
                            enteredPasswordChars = in.next().toCharArray();
                        }
                        String enteredPassword = new String(enteredPasswordChars);

                        // Authenticator
                        if (enteredUsername.equals(correctAdmin) && enteredPassword.equals(correctPasswordAdmin)) {
                            System.out.println("Selamat Datang, " + enteredUsername + "!");
                            loggedInAdmin = true;
                        } else {
                            System.out.println("Username atau Password salah. Silakan coba lagi.");
                        }
                    }
                    break;

                case 2:
                    // Data Username
                    String correctTeknisi = "teknisi1";
                    String correctPasswordTeknisi = "tekiniskompen";

                    Console consoleTeknisi = System.console();
                    boolean loggedInTeknisi = false;

                    while (!loggedInTeknisi) {
                        // Login
                        System.out.println("\n=== Sistem Kompen Mahasiswa ===");
                        System.out.print("Masukkan Username anda: ");
                        String enteredUsername = in.next();

                        // Use console for password input to hide it if available
                        char[] enteredPasswordChars = null;
                        try {
                            enteredPasswordChars = consoleTeknisi.readPassword("Masukkan password anda (Password anda tidak akan terlihat): ");
                        } catch (Exception e) {
                            // Fall back to Scanner if console is not available
                            enteredPasswordChars = in.next().toCharArray();
                        }
                        String enteredPassword = new String(enteredPasswordChars);

                        // Authenticator
                        if (enteredUsername.equals(correctTeknisi) && enteredPassword.equals(correctPasswordTeknisi)) {
                            System.out.println("Selamat Datang, " + enteredUsername + "!");
                            loggedInTeknisi = true;
                        } else {
                            System.out.println("Username atau Password salah. Silakan coba lagi.");
                        }
                    }
                    break;

                case 3:
                    // Data Username
                    String correctMahasiswa = "mahasiswa1";
                    String correctPasswordMahasiswa = "mahakompen";

                    Console consoleMahasiswa = System.console();
                    boolean loggedInMahasiswa = false;

                    while (!loggedInMahasiswa) {
                        // Login
                        System.out.println("\n=== Sistem Kompen Mahasiswa ===");
                        System.out.print("Masukkan Username anda: ");
                        String enteredUsername = in.next();

                        // Use console for password input to hide it if available
                        char[] enteredPasswordChars = null;
                        try {
                            enteredPasswordChars = consoleMahasiswa.readPassword("Masukkan password anda (Password anda tidak akan terlihat): ");
                        } catch (Exception e) {
                            // Fall back to Scanner if console is not available
                            enteredPasswordChars = in.next().toCharArray();
                        }
                        String enteredPassword = new String(enteredPasswordChars);

                        // Authenticator
                        if (enteredUsername.equals(correctMahasiswa) && enteredPassword.equals(correctPasswordMahasiswa)) {
                            System.out.println("Selamat Datang, " + enteredUsername + "!");
                            loggedInMahasiswa = true;
                        } else {
                            System.out.println("Username atau Password salah. Silakan coba lagi.");
                        }
                    }
                    break;
                default:
                    System.out.println("Pilihan Akun tidak valid.");
                    break;
            }

            if (account == 1 || account == 2 || account == 3) {
                break;
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
                                double inputHours = in.nextDouble();

                                // Define a factor to multiply the input by
                                double factor = 2.0; // You can change this factor as needed
                                // Calculate the result
                                double result = inputHours * factor;
                                // Display the result
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
