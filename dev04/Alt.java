import java.util.Scanner;
public class Alt {
    public static void main(String[] args) {

        // Data Username
        String adminUsn = "admin1", dosenUsn = "dosen1", mahasiswaUsn = "mahasiswa1";
        String adminPW = "adminkompen", dosenPW = "dosenkompen", mahasiswaPW = "mahakompen";

        boolean loggedInAdmin = false;
        boolean loggedInDosen = false;
        boolean loggedInMahasiswa = false;
        Scanner scanner = new Scanner(System.in);

        // Login
        System.out.println("\n=== Siapa Anda? ===");
        System.out.println("1. Admin ");
        System.out.println("2. Dosen ");
        System.out.println("3. Mahasiswa ");
        System.out.print("Masukkan pilihan anda: ");
        byte userChoice = scanner.nextByte();

        switch (userChoice) {
            case 1:
                System.out.println("\n=== Sistem Kompen Mahasiswa ===");
                System.out.print("Masukkan username anda: ");
                String adminUsnInput = scanner.next();
                System.out.print("Masukkan password anda: ");
                String adminPWInput = scanner.next();

                if (adminUsnInput.equals(adminUsn) && adminPWInput.equals(adminPW)) {
                    loggedInAdmin = true;
                } else {
                    System.out.print("Username dan Password yang anda masukkan salah. Silakan coba lagi.");
                }
                break;
            case 2:
                System.out.println("\n=== Sistem Kompen Mahasiswa ===");
                System.out.print("Masukkan username anda: ");
                String dosenUsnInput = scanner.next();
                System.out.print("Masukkan password anda: ");
                String dosenPWInput = scanner.next();

                if (dosenUsnInput.equals(dosenUsn) && dosenPWInput.equals(dosenPW)) {
                    loggedInDosen = true;
                } else {
                    System.out.print("Username dan Password yang anda masukkan salah. Silakan coba lagi.");
                }
                break;
            case 3:
                System.out.println("\n=== Sistem Kompen Mahasiswa ===");
                System.out.print("Masukkan username anda: ");
                String mahasiswaUsnInput = scanner.next();
                System.out.print("Masukkan password anda: ");
                String mahasiswaPWInput = scanner.next();

                if (mahasiswaUsnInput.equals(mahasiswaUsn) && mahasiswaPWInput.equals(mahasiswaPW)) {
                    loggedInMahasiswa = true;
                } else {
                    System.out.print("Username dan Password yang anda masukkan salah. Silakan coba lagi.");
                }
                break;
            default:
                System.out.println("Pilihan yang anda masukkan tidak valid.");
                break;
        }

        while (loggedInAdmin) {
            System.out.println("\n=== Sistem Kompen Mahasiswa ===");
            System.out.println("1. Profile");
            System.out.println("2. Input Alpa");
            System.out.println("3. Help");
            System.out.println("4. Contact Admin");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n=== Sistem Kompen Mahasiswa - Profile ===");
                    System.out.println("Nama:       Bpk. Ucup Saifullah");
                    System.out.println("0. Kembali");
                    System.out.println("1. Keluar");
                    System.out.print("Masukkan pilihan anda: ");
                    int subSubChoice01 = scanner.nextInt();
                    switch (subSubChoice01) {
                        case 0:
                            break;
                        case 1:
                            System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Kode yang anda pilih tidak valid");
                            break;
                    }
                    if (subSubChoice01 == 0) {
                        break;
                    }
                    break;

                case 2:
                            System.out.println("\n=== Input Alpa ===");
                            System.out.println("Maaf, untuk saat ini menu Input Alpa belum tersedia.");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            byte inputAlpa = scanner.nextByte();
                            switch (inputAlpa) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (inputAlpa == 0) {
                                break;
                            }
                        break;

                case 3:
                            System.out.println("\n=== Help ===");
                            System.out.println("Maaf, untuk saat ini menu Help belum tersedia.");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            byte help = scanner.nextByte();
                            switch (help) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (help == 0) {
                                break;
                            }
                    break;
                case 4:
                            System.out.println("\n=== Contact Admin ===");
                            System.out.println("Maaf, untuk saat ini menu Contact Admin belum tersedia.");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            byte ctAdmin = scanner.nextByte();
                            switch (ctAdmin) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (ctAdmin == 0) {
                                break;
                            }
                    break;
                case 5:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan tidak valid.");
                    break;
                }
            }

            while (loggedInDosen) {
            System.out.println("\n=== Sistem Kompen Mahasiswa ===");
            System.out.println("1. Profile");
            System.out.println("2. Input Tugas");
            System.out.println("3. Help");
            System.out.println("4. Contact Admin");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n=== Sistem Kompen Mahasiswa - Profile ===");
                    System.out.println("Nama:       Bpk. Yang Mulia Dosen");
                    System.out.println("0. Kembali");
                    System.out.println("1. Keluar");
                    System.out.print("Masukkan pilihan anda: ");
                    int subSubChoice01 = scanner.nextInt();
                    switch (subSubChoice01) {
                        case 0:
                            break;
                        case 1:
                            System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Kode yang anda pilih tidak valid");
                            break;
                    }
                    if (subSubChoice01 == 0) {
                        break;
                    }
                    break;

                case 2:
                            System.out.println("\n=== Input Tugas ===");
                            System.out.println("Maaf, untuk saat ini menu Input Tugas belum tersedia.");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            byte inputAlpa = scanner.nextByte();
                            switch (inputAlpa) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (inputAlpa == 0) {
                                break;
                            }
                        break;

                case 3:
                            System.out.println("\n=== Help ===");
                            System.out.println("Maaf, untuk saat ini menu Help belum tersedia.");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            byte help = scanner.nextByte();
                            switch (help) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (help == 0) {
                                break;
                            }
                    break;
                case 4:
                            System.out.println("\n=== Contact Admin ===");
                            System.out.println("Maaf, untuk saat ini menu Contact Admin belum tersedia.");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            byte ctAdmin = scanner.nextByte();
                            switch (ctAdmin) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (ctAdmin == 0) {
                                break;
                            }
                    break;
                case 5:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan tidak valid.");
                    break;
                }
            }

                
            while(loggedInMahasiswa){
                byte mhsChoice;
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
                mhsChoice = scanner.nextByte();
    
                // Kunci Jawaban
                switch (mhsChoice) {
                    case 1: // Profile
                        byte subSubChoice11;
                        System.out.println("\n=== Informasi Profil Mahasiswa ===");
                        System.out.println("Nama                        : Meganthropus Paleojavanicus");
                        System.out.println("Kelas                       : TI-1F");
                        System.out.println("Semester                    : 5");
                        System.out.println("Jurusan                     : Teknologi Informasi");
                        System.out.println("Prodi                       : Teknik Informatika");
                        System.out.println("0. Kembali");
                        System.out.println("1. Keluar");
                        System.out.print("Masukkan pilihan anda: ");
                        subSubChoice11 = scanner.nextByte();
                        switch (subSubChoice11) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Kode yang anda pilih tidak valid");
                                break;
                        }
                        if (subSubChoice11 == 0) {
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
                            System.out.println("0. Kembali");
                            System.out.print("Masukkan pilihan anda: ");
                            subChoice2 = scanner.nextByte();
    
                            // Submenu Alpaku
                            byte subSubChoice2;
                            switch (subChoice2) {
                                case 1: // Semester 1
                                    System.out.println("\n=== Alpaku - Semester 1 ===");
                                    System.out.println("Jumlah Alpa Semester 1: " + smt1 + " jam");
                                    System.out.println("Total jam tugas kompen Semester 1: " + smt1 * 10 + " jam");
                                    System.out.println("0. Kembali");
                                    System.out.println("1. Keluar");
                                    System.out.print("Masukkan pilihan Anda: ");
                                    subSubChoice2 = scanner.nextByte();
                                    switch (subSubChoice2) {
                                        case 0:
                                            break;
                                        case 1:
                                            System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                            System.exit(0);
                                        default:
                                            System.out.println("Kode yang anda pilih tidak valid.");
                                            break;
                                    }
                                    break;
                                case 2: // Semester 2
                                    System.out.println("\n=== Alpaku - Semester 2 ===");
                                    System.out.println("Jumlah Alpa Semester 2: " + smt2 + " jam");
                                    System.out.println("Total jam tugas kompen Semester 2: " + smt2 * 8 + " jam");
                                    System.out.println("0. Kembali");
                                    System.out.println("1. Keluar");
                                    System.out.print("Masukkan pilihan Anda: ");
                                    subSubChoice2 = scanner.nextByte();
                                    switch (subSubChoice2) {
                                        case 0:
                                            break;
                                        case 1:
                                            System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                            System.exit(0);
                                        default:
                                            System.out.println("Kode yang anda pilih tidak valid.");
                                            break;
                                    }
                                    break;
                                case 3: // Semester 3
                                    System.out.println("\n=== Alpaku - Semester 3 ===");
                                    System.out.println("Jumlah Alpa Semester 3: " + smt3 + " jam");
                                    System.out.println("Total jam tugas kompen Semester 3: " + smt3 * 6 + " jam");
                                    System.out.println("0. Kembali");
                                    System.out.println("1. Keluar");
                                    System.out.print("Masukkan pilihan Anda: ");
                                    subSubChoice2 = scanner.nextByte();
                                    switch (subSubChoice2) {
                                        case 0:
                                            break;
                                        case 1:
                                            System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                            System.exit(0);
                                        default:
                                            System.out.println("Kode yang anda pilih tidak valid.");
                                            break;
                                    }
                                    break;
                                case 4: // Semester 4
                                    System.out.println("\n=== Alpaku - Semester 4 ===");
                                    System.out.println("Jumlah Alpa Semester 4: " + smt4 + " jam");
                                    System.out.println("Total jam tugas kompen Semester 4: " + smt4 * 4 + " jam");
                                    System.out.println("0. Kembali");
                                    System.out.println("1. Keluar");
                                    System.out.print("Masukkan pilihan Anda: ");
                                    subSubChoice2 = scanner.nextByte();
                                    switch (subSubChoice2) {
                                        case 0:
                                            break;
                                        case 1:
                                            System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                            System.exit(0);
                                        default:
                                            System.out.println("Kode yang anda pilih tidak valid.");
                                            break;
                                    }
                                    break;
                                case 5: // Semester 5
                                    System.out.println("\n=== Alpaku - Semester 5 ===");
                                    System.out.println("Jumlah Alpa Semester 5: " + smt5 + " jam");
                                    System.out.println("Total jam tugas kompen Semester 5: " + smt5 * 2 + " jam");
                                    System.out.println("0. Kembali");
                                    System.out.println("1. Keluar");
                                    System.out.print("Masukkan pilihan Anda: ");
                                    subSubChoice2 = scanner.nextByte();
    
                                    switch (subSubChoice2) {
                                        case 0:
                                            break;
                                        case 1:
                                            System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                            System.exit(0);
                                        default:
                                            System.out.println("Kode yang anda pilih tidak valid.");
                                            break;
                                    }
                                    break;
    
                                case 6: // Rekap Total Tugas Kompen
                                    result = (smt1 * 10) + (smt2 * 8) + (smt3 * 6) + (smt4 * 4) + (smt5 * 2);
                                    System.out.println("=== Alpaku - Rekap Tugas Kompen ===");
                                    System.out.println("Total Tugas kompen yang harus diselesaikan: " + result + " jam");
                                    System.out.println("0. Kembali");
                                    System.out.println("1. Keluar");
                                    System.out.print("Masukkan pilihan Anda: ");
                                    subSubChoice2 = scanner.nextByte();
    
                                    switch (subSubChoice2) {
                                        case 0:
                                            break;
                                        case 1:
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
                                case 0:
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (subChoice2 == 0) {
                                break;
                            }
                        }
                        break;
                    case 3: // Tugas Tersedia
                        byte subChoice3;
                        while (true) {
                            System.out.println("\n=== Tugas Tersedia ===");
                            System.out.println("Maaf, untuk saat ini menu Tugas Tersedia belum tersedia.");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            subChoice3 = scanner.nextByte();
                            switch (subChoice3) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (subChoice3 == 0) {
                                break;
                            }
                        }
                        break;
                    case 4: // History Tugas
                        byte subChoice4;
                        while (true) {
                            System.out.println("\n=== History Tugas ===");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            subChoice4 = scanner.nextByte();
                            switch (subChoice4) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (subChoice4 == 0) {
                                break;
                            }
                        }
                        break;
                    case 5: // Peraturan Sistem Kompen Mahasiswa
                        byte subChoice5;
                        while (true) {
                            System.out.println("\n=== Peraturan Sistem Kompen Mahasiswa ===");
                            System.out.println("Maaf, untuk saat ini menu Peraturan Sistem Kompen Mahasiswa belum tersedia.");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            subChoice5 = scanner.nextByte();
                            switch (subChoice5) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (subChoice5 == 0) {
                                break;
                            }
                        }
                        break;
                    case 6: // Help
                        byte subChoice6;
                        while (true) {
                            System.out.println("\n=== Help ===");
                            System.out.println("Maaf, untuk saat ini menu Help belum tersedia.");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            subChoice6 = scanner.nextByte();
                            switch (subChoice6) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (subChoice6 == 0) {
                                break;
                            }
                        }
                        break;
                    case 7: // Contact Admin
                        byte subChoice7;
                        while (true) {
                            System.out.println("\n=== Contact Admin ===");
                            System.out.println("Maaf, untuk saat ini menu Contact Admin belum tersedia.");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            subChoice7 = scanner.nextByte();
                            switch (subChoice7) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (subChoice7 == 0) {
                                break;
                            }
                        }
                        break;
                    case 8:
                        System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Kode yang anda pilih tidak valid.");
                        break;
                }
            }
            }
            }
