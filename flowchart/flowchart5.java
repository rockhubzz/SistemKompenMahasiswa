import java.util.Scanner;
public class flowchart5{
public static void main(String[] args) {
    int usr;
    String usnAdmin= "adm1", usnDosen="dsn1", usnMhs="mhs1";
    String pwAdmin= "admin1", pwDosen="dosen1", pwMhs="mahasiswa1";
    boolean loggedInAdmin = false, loggedInDosen = false, loggedInMahasiswa = false;
    Scanner in = new Scanner(System.in);

    System.out.println("=== Sistem Kompen Mahasiswa ===");
    System.out.println("1. Admin");
    System.out.println("2. Dosen");
    System.out.println("3. Mahasiswa");
    System.out.print("Masukkan pilihan anda: ");
    usr = in.nextInt();

    switch (usr) {
        case 1: //Admin
            System.out.print("/nMasukkan username anda: ");
            String inUserAdm = in.next();
            System.out.print("Masukkan password anda: ");
            String inPWAdm = in.next();

            if (inUserAdm.equals(usnAdmin) && inPWAdm.equals(pwAdmin)) {
                loggedInAdmin = true;
            } else {
                System.out.println("Username dan Password yang anda masukkan salah. Silakan coba lagi.");
            }
            break;
        case 2: // Dosen
            System.out.print("/nMasukkan username anda: ");
            String inUserDosen = in.next();
            System.out.print("Masukkan password anda: ");
            String inPWDosen = in.next();

            if (inUserDosen.equals(usnDosen) && inPWDosen.equals(pwDosen)) {
                loggedInDosen = true;
            } else {
                System.out.println("Username dan Password yang anda masukkan salah. Silakan coba lagi.");
            }
            break;
        case 3: //Mahasiswa
            System.out.print("/nMasukkan username anda: ");
            String inUserMhs = in.next();
            System.out.print("Masukkan password anda: ");
            String inPWMhs = in.next();

            if (inUserMhs.equals(usnMhs) && inPWMhs.equals(pwMhs)) {
                loggedInMahasiswa = true;
            } else {
                System.out.println("Username dan Password yang anda masukkan salah. Silakan coba lagi.");
            }
            break;
        default:
            System.out.println("Pilihan tidak valid.");
    }
        if(loggedInAdmin==true){
            System.out.println("/nBerhasil login sebagai admin!");
            System.out.println("[Dashboard]");
        }
        if(loggedInDosen==true){
            System.out.println("/nBerhasil login sebagai dosen!");
            System.out.println("[Dashboard]");
        }
        if(loggedInMahasiswa==true){
            System.out.println("/nBerhasil login sebagai mahasiswa!");
            System.out.println("[Dashboard]");
        }



    }
}