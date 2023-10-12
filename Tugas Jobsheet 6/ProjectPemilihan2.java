import java.util.Scanner;
public class ProjectPemilihan2 {

    public static void main(String[] args) {
        Scanner input25 = new Scanner (System.in);

        int menuAlpaku, menuIn,subMenuIn;

        System.out.println("=== Sistem Kompen ===");
        System.out.println("1. Semester 1");
        System.out.println("2. Semester 2");
        System.out.println("3. Semester 3");
        System.out.println("4. Semester 4");
        System.out.println("5. Semester 5");
        System.out.println("6. Rekap Kompen");
        System.out.println("Masukkan Pilihan anda : ");
        menuIn = input25.nextInt();

        switch(menuIn){
            case 1:
            System.out.println("Jumlah Alpa: 3 jam");
            System.out.println("Jumlah Kompen: 6 jam");
            System.out.println("1. Keluar");
            System.out.println("2. Kerjakan Kompen");
            subMenuIn = input25.nextInt();

            if (subMenuIn == 1){
                System.exit(0);
            }
            else if(subMenuIn == 2){
                System.out.println("Silakan kerjakan kompen anda");
                System.exit(0);

            }
            case 2:
            System.out.println("Jumlah Alpa: 3 jam");
            System.out.println("Jumlah Kompen: 6 jam");
            System.out.println("1. Keluar");
            System.out.println("2. Kerjakan Kompen");
            subMenuIn = input25.nextInt();

            if (subMenuIn == 1){
                System.exit(0);
            }
            else if(subMenuIn == 2){
                System.out.println("Silakan kerjakan kompen anda");
                System.exit(0);

            }
            case 3:
            System.out.println("Jumlah Alpa: 3 jam");
            System.out.println("Jumlah Kompen: 6 jam");
            System.out.println("1. Keluar");
            System.out.println("2. Kerjakan Kompen");
            subMenuIn = input25.nextInt();

            if (subMenuIn == 1){
                System.exit(0);
            }
            else if(subMenuIn == 2){
                System.out.println("Silakan kerjakan kompen anda");
                System.exit(0);

            }
            case 4:
            System.out.println("Jumlah Alpa: 3 jam");
            System.out.println("Jumlah Kompen: 6 jam");
            System.out.println("1. Keluar");
            System.out.println("2. Kerjakan Kompen");
            subMenuIn = input25.nextInt();

            if (subMenuIn == 1){
                System.exit(0);
            }
            else if(subMenuIn == 2){
                System.out.println("Silakan kerjakan kompen anda");
                System.exit(0);

            }
            case 5:
            System.out.println("Jumlah Alpa: 3 jam");
            System.out.println("Jumlah Kompen: 6 jam");
            System.out.println("1. Keluar");
            System.out.println("2. Kerjakan Kompen");
            subMenuIn = input25.nextInt();

            if (subMenuIn == 1){
                System.exit(0);
            }
            else if(subMenuIn == 2){
                System.out.println("Silakan kerjakan kompen anda");
                System.exit(0);

            }
            case 6:
            System.out.println("Total Kompen : 12 jam");
            System.out.println("1. Keluar");
            System.out.println("2. Kerjakan Kompen");
            subMenuIn = input25.nextInt();

            if (subMenuIn == 1){
                System.exit(0);
            }
            else if(subMenuIn == 2){
                System.out.println("Silakan kerjakan kompen anda");
                System.exit(0);

            }
        }
    }
}