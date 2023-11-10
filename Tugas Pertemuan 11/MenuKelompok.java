import java.util.Scanner;

public class MenuKelompok {
    public static void main(String[] args) {
        int menu, subMenu;
        int[] alpa = {0, 1, 4, 3, 2, 0}, kompen = new int[6];
        boolean dash = true;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < alpa.length; i++) {
            kompen[i] = alpa[i] * (2 * (alpa.length - i));
        }

        while (dash) {
            System.out.println("\n===== Dashboard =====");
            System.out.println("1. Profile");
            System.out.println("2. Alpaku");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan anda: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    boolean profile = true;
                    while (profile) {
                        System.out.println("\n===== Profile =====");
                        System.out.println("Nama            :Meganthropus Paleojavanicus");
                        System.out.println("Kelas           :TI - 1F");
                        System.out.println("Semester        :5");
                        System.out.println("Jurusan         :Teknologi Informasi");
                        System.out.println("Prodi           :Teknik Informatika");
                        System.out.print("Tekan 0 untuk kembali: ");
                        subMenu = sc.nextInt();
                        if (subMenu == 0) {
                            profile = false;
                        }
                    }
                    break;

                case 2:
                    boolean Alpaku = true;
                    while (Alpaku) {
                        System.out.println("\n===== Alpaku =====");
                        System.out.println("1. Semester 1");
                        System.out.println("2. Semester 2");
                        System.out.println("3. Semester 3");
                        System.out.println("4. Semester 4");
                        System.out.println("5. Semester 5");
                        System.out.println("0. Kembali");
                        System.out.print("Masukkan pilihan anda: ");
                        subMenu = sc.nextInt();

                        if (0 < subMenu && subMenu < 6) {
                            boolean semester = true;
                            while (semester) {
                                int i = subMenu;
                                System.out.println("\n=== Alpaku - Semester " + i + " ===");
                                System.out.println("Jumlah Alpa Semester " + i + ": " + alpa[i] + " jam");
                                System.out.println("Total jam tugas kompen Semester " + i + ": " + kompen[i] + " jam");
                                System.out.println("0. Kembali");
                                System.out.println("1. Keluar");
                                System.out.print("Masukkan pilihan Anda: ");
                                int subSubChoice2 = sc.nextByte();
                                switch (subSubChoice2) {
                                    case 0:
                                        semester = false;
                                        break;
                                    case 1:
                                        System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                        System.exit(0);
                                    default:
                                        System.out.println("Kode yang anda pilih tidak valid.");
                                        break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
