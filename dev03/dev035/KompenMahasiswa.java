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
        Scanner in = new Scanner(System.in);

        // Dashboard
        while (true) {
            System.out.println("\n=== Sistem Kompen Mahasiswa ===");
            System.out.println("1. Profile");
            System.out.println("2. Alpaku");
            System.out.println("3. Tugas Tersedia");
            System.out.println("4. History Tugas");
            System.out.println("5. Peraturan Sistem Kompen Mahasiswa");
            System.out.println("6. Help");
            System.out.println("7. Contact Admin");
            System.out.println("8. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            choice = in.nextInt();

            // Kunci Jawaban
            switch (choice) {
                case 1: // Profile
                    byte subSubChoice1;
                    System.out.println("\n=== Informasi Profil Mahasiswa ===");
                    System.out.println("Nama                        : Meganthropus Paleojavanicus");
                    System.out.println("Kelas                       : TI-1F");
                    System.out.println("Semester                    : 5");
                    System.out.println("Jurusan                     : Teknologi Informasi");
                    System.out.println("Prodi                       : Teknik Informatika");
                    System.out.println("1. Kembali");
                    System.out.println("2. Keluar");
                    System.out.print("Masukkan pilihan anda: ");
                    subSubChoice1 = in.nextByte();
                    switch (subSubChoice1) {
                        case 1:
                            break;
                        case 2:
                            System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Kode yang anda pilih tidak valid");
                            break;
                    }
                    if (subSubChoice1 == 1) {
                        break;
                    }
                    break;
                case 2: // Alpaku
                    byte subChoice2;
                    int result, smt1 = 3, smt2 = 1, smt3 = 8, smt4 = 3, smt5 = 6;
                    while (true) {
                        System.out.println("\n=== Alpaku ===");
                        System.out.println("1. Semester 1");
                        System.out.println("2. Semester 2");
                        System.out.println("3. Semester 3");
                        System.out.println("4. Semester 4");
                        System.out.println("5. Semester 5");
                        System.out.println("6. Rekap Tugas Kompen");
                        System.out.println("7. Kembali");
                        System.out.print("Masukkan pilihan anda: ");
                        subChoice2 = in.nextByte();

                        // Jawaban Submenu
                        byte subSubChoice2;
                        switch (subChoice2) {
                            case 1:
                                System.out.println("\n=== Alpaku - Semester 1 ===");
                                System.out.println("Jumlah Alpa Semester 1: " + smt1 + " jam");
                                System.out.println("Total jam tugas kompen Semester 1: " + smt1 * 10 + " jam");
                                System.out.println("1. Kembali");
                                System.out.println("2. Keluar");
                                System.out.print("Masukkan pilihan Anda: ");
                                subSubChoice2 = in.nextByte();
                                switch (subSubChoice2) {
                                    case 1:
                                        break;
                                    case 2:
                                        System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                        System.exit(0);
                                    default:
                                        System.out.println("Kode yang anda pilih tidak valid.");
                                        break;
                                }

                                break;
                            case 2:
                                System.out.println("\n=== Alpaku - Semester 2 ===");
                                System.out.println("Jumlah Alpa Semester 2: " + smt2 + " jam");
                                System.out.println("Total jam tugas kompen Semester 2: " + smt2 * 8 + " jam");
                                System.out.println("1. Kembali");
                                System.out.println("2. Keluar");
                                System.out.print("Masukkan pilihan Anda: ");
                                subSubChoice2 = in.nextByte();
                                switch (subSubChoice2) {
                                    case 1:
                                        break;
                                    case 2:
                                        System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                        System.exit(0);
                                    default:
                                        System.out.println("Kode yang anda pilih tidak valid.");
                                        break;
                                }

                                break;
                            case 3:
                                System.out.println("\n=== Alpaku - Semester 3 ===");
                                System.out.println("Jumlah Alpa Semester 3: " + smt3 + " jam");
                                System.out.println("Total jam tugas kompen Semester 3: " + smt3 * 6 + " jam");
                                System.out.println("1. Kembali");
                                System.out.println("2. Keluar");
                                System.out.print("Masukkan pilihan Anda: ");
                                subSubChoice2 = in.nextByte();
                                switch (subSubChoice2) {
                                    case 1:
                                        break;
                                    case 2:
                                        System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                        System.exit(0);
                                    default:
                                        System.out.println("Kode yang anda pilih tidak valid.");
                                        break;
                                }

                                break;
                            case 4:
                                System.out.println("\n=== Alpaku - Semester 4 ===");
                                System.out.println("Jumlah Alpa Semester 4: " + smt4 + " jam");
                                System.out.println("Total jam tugas kompen Semester 4: " + smt4 * 4 + " jam");
                                System.out.println("1. Kembali");
                                System.out.println("2. Keluar");
                                System.out.print("Masukkan pilihan Anda: ");
                                subSubChoice2 = in.nextByte();
                                switch (subSubChoice2) {
                                    case 1:
                                        break;
                                    case 2:
                                        System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                        System.exit(0);
                                    default:
                                        System.out.println("Kode yang anda pilih tidak valid.");
                                        break;
                                }

                                break;
                            case 5:
                                System.out.println("\n=== Alpaku - Semester 5 ===");
                                System.out.println("Jumlah Alpa Semester 5: " + smt5 + " jam");
                                System.out.println("Total jam tugas kompen Semester 5: " + smt5 * 2 + " jam");
                                System.out.println("1. Kembali");
                                System.out.println("2. Keluar");
                                System.out.print("Masukkan pilihan Anda: ");
                                subSubChoice2 = in.nextByte();

                                switch (subSubChoice2) {
                                    case 1:
                                        break;
                                    case 2:
                                        System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                        System.exit(0);
                                    default:
                                        System.out.println("Kode yang anda pilih tidak valid.");
                                        break;
                                }
                                break;

                            case 6:
                                result = (smt1 * 10) + (smt2 * 8) + (smt3 * 6) + (smt4 * 4) + (smt5 * 2);
                                System.out.println("=== Alpaku - Rekap Tugas Kompen ===");
                                System.out.println("Total Tugas kompen yang harus diselesaikan: " + result + " jam");
                                System.out.println("1. Kembali");
                                System.out.println("2. Keluar");
                                System.out.print("Masukkan pilihan Anda: ");
                                subSubChoice2 = in.nextByte();

                                switch (subSubChoice2) {
                                    case 1:
                                        break;
                                    case 2:
                                        System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                        System.exit(0);
                                    default:
                                        System.out.println("Kode yang anda pilih tidak valid.");
                                        break;
                                }
                                if (subSubChoice2 == 1) {
                                    break;
                                }
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Kode yang anda pilih tidak valid.");
                                break;
                        }
                        if (subChoice2 == 7) {
                            break;
                        }
                    }
                    break;
                case 3: // Tugas Tersedia
                    byte subChoice3;
                    while (true) {
                        System.out.println("\n=== Tugas Tersedia ===");
                        System.out.println("Maaf, untuk saat ini menu Tugas Tersedia belum tersedia.");
                        System.out.println("1. Kembali");
                        System.out.println("2. Keluar");
                        System.out.print("Masukkan pilihan anda: ");
                        subChoice3 = in.nextByte();
                        switch (subChoice3) {
                            case 1:
                                break;
                            case 2:
                                System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Kode yang anda pilih tidak valid.");
                                break;
                        }
                        if (subChoice3 == 1) {
                            break;
                        }
                    }
                    break;
                case 4: // History Tugas
                    byte subChoice4;
                    while (true) {
                        System.out.println("\n=== History Tugas ===");
                        System.out.println("1. Kembali");
                        System.out.println("2. Keluar");
                        System.out.print("Masukkan pilihan anda: ");
                        subChoice4 = in.nextByte();
                        switch (subChoice4) {
                            case 1:
                                break;
                            case 2:
                                System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Kode yang anda pilih tidak valid.");
                                break;
                        }
                        if (subChoice4 == 1) {
                            break;
                        }
                    }
                    break;
                case 5: // Peraturan Sistem Kompen Mahasiswa
                    byte subChoice5;
                    while (true) {
                        System.out.println("\n=== Peraturan Sistem Kompen Mahasiswa ===");
                        System.out.println("Maaf, untuk saat ini menu Peraturan Sistem Kompen Mahasiswa belum tersedia.");
                        System.out.println("1. Kembali");
                        System.out.println("2. Keluar");
                        System.out.print("Masukkan pilihan anda: ");
                        subChoice5 = in.nextByte();
                        switch (subChoice5) {
                            case 1:
                                break;
                            case 2:
                                System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Kode yang anda pilih tidak valid.");
                                break;
                        }
                        if (subChoice5 == 1) {
                            break;
                        }
                    }
                    break;
                case 6: // Help
                    byte subChoice6;
                    while (true) {
                        System.out.println("\n=== Help ===");
                        System.out.println("Maaf, untuk saat ini menu Help belum tersedia.");
                        System.out.println("1. Kembali");
                        System.out.println("2. Keluar");
                        System.out.print("Masukkan pilihan anda: ");
                        subChoice6 = in.nextByte();
                        switch (subChoice6) {
                            case 1:
                                break;
                            case 2:
                                System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Kode yang anda pilih tidak valid.");
                                break;
                        }
                        if (subChoice6 == 1) {
                            break;
                        }
                    }
                    break;
                case 7: // Contact Admin
                    byte subChoice7;
                    while (true) {
                        System.out.println("\n=== Contact Admin ===");
                        System.out.println("Maaf, untuk saat ini menu Contact Admin belum tersedia.");
                        System.out.println("1. Kembali");
                        System.out.println("2. Keluar");
                        System.out.print("Masukkan pilihan anda: ");
                        subChoice7 = in.nextByte();
                        switch (subChoice7) {
                            case 1:
                                break;
                            case 2:
                                System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Kode yang anda pilih tidak valid.");
                                break;
                        }
                        if (subChoice7 == 1) {
                            break;
                        }
                    }
                    break;
                case 8:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    System.exit(0); // Exit
                    break;
                default:
                    System.out.println("Kode yang anda pilih tidak valid.");
                    break;
            }
        }
    }
}
