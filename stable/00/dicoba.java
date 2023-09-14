import java.io.*;
import java.util.Scanner;


public class dicoba {
    public static void main (String [] args){

        // Pil. user
        int choice;

            // Main Menu
             System.out.println("=== Sistem Kompen Mahasiswa ===");
        System.out.println("1. Informasi Profil");
        System.out.println("7. Exit");
        System.out.println("Masukkan pilihan anda: ");

        // Scanner
        Scanner in = new Scanner(System.in);

        // Input user
        choice = in.nextInt();

        // Loop menu
        while (choice !=7){
        // Konsekuensi pilihan
        if (choice == 1){
            System.out.println("Nama                        : Meganthropus Paleojavanicus");
            System.out.println("Tempat, Tanggal Lahir       : 32 Mei 1997 SM");
            System.out.println("Kelas                       : TI-IF");
            System.out.println("Jurusan                     : Teknologi Informasi");
            System.out.println("Prodi                       : Teknik Informatika");
        }
        // Main Menu
        System.out.println("=== Sistem Kompen Mahasiswa ===");
        System.out.println("1. Informasi Profil");
        System.out.println("7. Exit");
        System.out.println("Masukkan pilihan anda: ");

        // Input user
        choice = in.nextInt();
        }
        System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");

        

}

    }
       

