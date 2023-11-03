import java.util.Scanner;

public class MultiUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] admin = {{"admin1", "admin2"}, {"adminkompen", "kompenadmin"}};
        String[][] dosen = {{"dosen1", "dosen2"}, {"dosenkompen", "kompendosen"}};
        String[][] mahasiswa = {{"mahasiswa1", "mahasiswa2"}, {"mahakompen","kompenmaha"}};
        int iAdmin=0, iDosen=0, iMhs=0;
        boolean loginAdmin = false, loginDosen = false, loginMhs = false;

        while (!loginAdmin || !loginDosen || !loginMhs) {
            System.out.print("\nUsername: ");
            String usnInput = sc.nextLine();
            System.out.print("Password: ");
            String pwInput = sc.nextLine();

            for (int i = 0; i < admin[0].length; i++) {
                if (usnInput.equals(admin[0][i]) && pwInput.equals(admin[1][i])) {
                    loginAdmin = true;
                    iAdmin= i;
                    break;
                }
            }

            for (int i = 0; i < dosen[0].length; i++) {
                if (usnInput.equals(dosen[0][i]) && pwInput.equals(dosen[1][i])) {
                    loginDosen = true;
                    iDosen= i;
                    break;
                }
            }

            for (int i = 0; i < mahasiswa[0].length; i++) {
                if (usnInput.equals(mahasiswa[0][i]) && pwInput.equals(mahasiswa[1][i])) {
                    loginMhs = true;
                    iMhs= i;
                    break;
                }
            }
            if (loginAdmin || loginDosen || loginMhs) {
                break;
            } else {
                System.out.println("Username atau password salah.");
                continue;
            }
        }
        if (loginAdmin) {
            System.out.println("Selamat datang, "+admin[0][iAdmin]);
        } else if (loginDosen) {
            System.out.println("Selamat datang, "+dosen[0][iDosen]);
        } else if (loginMhs) {
            System.out.println("Selamat datang, "+mahasiswa[0][iMhs]);
        }
        sc.close();
    }
}
