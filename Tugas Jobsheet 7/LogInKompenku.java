import java.util.Scanner;
public class LogInKompenku {
    public static void main(String[] args) {
        String usnAdmin = "admin1", usnDosen = "dosen1", usnMhs= "mahasiswa1";
        String pwAdmin = "adminkompen", pwDosen = "dosenkompen", pwMhs = "mahakompen";
        boolean loggedInAdmin = false, loggedInDosen = false, loggedInMhs = false;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== Siapa Anda? ===");
        System.out.println("1. Admin ");
        System.out.println("2. Dosen ");
        System.out.println("3. Mahasiswa ");
        System.out.print("Masukkan pilihan anda: ");
        byte userChoice = scanner.nextByte();


        //perulangan
        while(!(loggedInAdmin || loggedInDosen || loggedInMhs)){
            switch (userChoice) {
                case 1:
                    System.out.println("\n=== Sistem Kompen Mahasiswa - Login Admin ===");
                    System.out.print("Masukkan username anda: ");
                    String adminUsnInput = scanner.next();
                    System.out.print("Masukkan password anda: ");
                    String adminPWInput = scanner.next();
    
                    if (adminUsnInput.equals(usnAdmin) && adminPWInput.equals(pwAdmin)) {
                        loggedInAdmin = true;
                    } else {
                        System.out.print("Username dan Password yang anda masukkan salah. Silakan coba lagi.");
                    }
                    break;
                case 2:
                    System.out.println("\n=== Sistem Kompen Mahasiswa - Login Dosen ===");
                    System.out.print("Masukkan username anda: ");
                    String dosenUsnInput = scanner.next();
                    System.out.print("Masukkan password anda: ");
                    String dosenPWInput = scanner.next();
    
                    if (dosenUsnInput.equals(usnDosen) && dosenPWInput.equals(pwDosen)) {
                        loggedInDosen = true;
                    } else {
                        System.out.print("Username dan Password yang anda masukkan salah. Silakan coba lagi.");
                    }
                    break;
                case 3:
                    System.out.println("\n=== Sistem Kompen Mahasiswa - Login Mahasiswa ===");
                    System.out.print("Masukkan username anda: ");
                    String mahasiswaUsnInput = scanner.next();
                    System.out.print("Masukkan password anda: ");
                    String mahasiswaPWInput = scanner.next();
    
                    if (mahasiswaUsnInput.equals(usnMhs) && mahasiswaPWInput.equals(pwMhs)) {
                        loggedInMhs = true;
                    } else {
                        System.out.print("Username dan Password yang anda masukkan salah. Silakan coba lagi.");
                    }
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan tidak valid.");

                }
            }
                 while (loggedInAdmin) {
                    System.out.println("\n Selamat Datang " + usnAdmin);
                    break;
                }
                while (loggedInDosen) {
                    System.out.println("\n Selamat Datang " + usnDosen);
                    break;
                }
                while (loggedInMhs) {
                    System.out.println("\n Selamat Datang " + usnMhs);
                    break;
                }
    }
}
