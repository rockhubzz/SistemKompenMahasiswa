import java.util.Scanner;

public class KompenMahasiswa {
    public static void main(String[] args) {

        // Initializations
        Scanner scanner = new Scanner(System.in);
        String adminUsn = "admin1", dosenUsn = "dosen1", mahasiswaUsn = "mahasiswa1", root = "root";
        String adminPW = "adminkompen", dosenPW = "dosenkompen", mahasiswaPW = "mahakompen", admin = "kompen123";
        int smtSkrg= 5, totalAlpa= 0, totalKompen= 0;
        int[] alpa= {0,1,4,3,2,0}, kompen= new int[smtSkrg+1];
        String[] tugas = new String[100], pemberiTugas = new String[100], doneJdl= new String[100], donePmbr= new String[100];
        int[] jmlKompen= new int[100], kuota= new int[100], tgl= new int[100], bln= new int[100], thn= new int[100], tglDone= new int[100], blnDone= new int[100], thnDone= new int[100], jmlDone= new int[100];
        int tersedia= 0;
        boolean loggedInAdmin = false, loggedInDosen = false, loggedInMahasiswa = false, superuser = false;

        tugas[1] = "JIP";
        pemberiTugas[1] = "Mustika Mentari, S.Kom, M.Kom";
        jmlKompen[1]= 100;
        kuota[1]= 1;
        tgl[1]= 28; bln[1]= 9; thn[1]= 2023;

        tugas[2] = "Editing Word";
        pemberiTugas[2] = "Meyti Eka Apriani, ST, MT";
        jmlKompen[2]= 2;
        kuota[2]= 1;
        tgl[2]= 1; bln[2]= 10; thn[2]= 2023;

        for (int i = 1; i < tugas.length; i++) {
          if (tugas[i] != null){
            continue;
          } else if(tugas[i]==null){
            tersedia=i;
            break;
          }
        }


        //index data:
        //0:nama 
        //1:kelas 
        //2:semester 
        //3:jurusan 
        //4:teknik informatika

        //Data mhs1
        String[] mhs1= new String[5];
        mhs1[0]= "Meganthropus Paleojavanicus";
        mhs1[1]= "TI - 1F";
        mhs1[2]= "5";
        mhs1[3]= "Teknologi Informasi";
        mhs1[4]= "Teknik Informatika";

        for(int i=1; i<alpa.length; i++){
            totalAlpa+= alpa[i];
            kompen[i] = alpa[i] * (2 * (alpa.length - i));
            totalKompen+= kompen[i];
        }

        // Login
        while (!(loggedInAdmin && loggedInDosen && loggedInMahasiswa)) {
                    System.out.println("\n=== Sistem Kompen Mahasiswa ===");
                    System.out.print("Masukkan username anda: ");
                    String UsnInput = scanner.next();
                    if((UsnInput.equalsIgnoreCase("exit")) || UsnInput.equalsIgnoreCase("quit")){
                        System.exit(0);
                    }
                    System.out.print("Masukkan password anda: ");
                    String PWInput = scanner.next();

                    if (UsnInput.equals(adminUsn) && PWInput.equals(adminPW)) {
                        loggedInAdmin = true;
                    } else if(UsnInput.equals(dosenUsn) && PWInput.equals(dosenPW)){
                        loggedInDosen=true;
                    } else if(UsnInput.equals(mahasiswaUsn) && PWInput.equals(mahasiswaPW)){
                        loggedInMahasiswa=true;
                    } else if(UsnInput.equals(root) && PWInput.equals(admin)){
                        superuser=true;
                    } else {
                        System.out.println("Username dan Password yang anda masukkan salah. Silakan coba lagi.");
                    }


        while(superuser){
            System.out.println("\n=== Sistem Kompen Mahasiswa ===");
            System.out.println("1. Admin");
            System.out.println("2. Dosen");
            System.out.println("3. Mahasiswa");
            System.out.print("Login sebagai: ");
            int user = scanner.nextInt();

            switch(user){
                case 1:
                superuser = false;
                loggedInAdmin = true;
                break;
                case 2:
                superuser = false;
                loggedInDosen = true;
                break;
                case 3:
                superuser = false;
                loggedInMahasiswa = true;
                break;
                default:
                System.out.println("Pilihan anda tidak valid. Silakan coba lagi.");
            }
        }

        while (loggedInAdmin) {
            System.out.println("\n=== Sistem Kompen Mahasiswa ===");
            System.out.println("1. Profile");
            System.out.println("2. Input Alpa");
            System.out.println("3. Help");
            System.out.println("4. Logout");
            System.out.println("5. Quit");
            System.out.print("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n=== Profil Admin ===");
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
                    System.out.println("Pilih nama mahasiswa yang akan anda input alpa:");
                    System.out.println("1. "+mhs1[0]);
                    System.out.println("0. Kembali");
                    System.out.print("Masukkan pilihan anda: ");
                    byte inputAlpa = scanner.nextByte();
                    switch (inputAlpa) {
                        case 0:
                            break;
                        case 1:
                        boolean case1= true;
                        while(case1){
                            System.out.print("Masukkan semester: ");
                            int smtEdit= scanner.nextInt();
                            if(smtEdit > Integer.valueOf(mhs1[2])){
                                System.out.println("Semester tidak valid.");
                                continue;
                            }
                            System.out.print("Masukkan jumlah jam alpa yang ingin ditambahkan: ");
                            int alpaAdd= scanner.nextInt();

                            alpa[smtEdit]+=alpaAdd;
                            System.out.println("Alpa berhasil ditambahkan!");
                            break;
                        }
                        totalAlpa= 0;
                        totalKompen= 0;
                        for(int i=1; i<alpa.length; i++){
                            totalAlpa+= alpa[i];
                            kompen[i] = alpa[i] * (2 * (alpa.length - i));
                            totalKompen+= kompen[i];
                            }
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
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    loggedInAdmin = false;
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
            System.out.println("5. Logout");
            System.out.println("6. Quit");
            System.out.print("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n=== Profil Dosen ===");
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
                boolean list= true;
                while (list) {
                    System.out.println("\n=== Input Tugas ===");
                    System.out.println("List tugas:");
                    for (int i = 1; i < tugas.length; i++) {
                        if (tugas[i] != null) {
                            System.out.println(i + ". " + tugas[i]);
                        }
                    }
                    System.out.println();
                    System.out.println("99. Tambah Tugas");
                    System.out.println("0. Kembali");
                    System.out.print("Pilih tugas: ");
                    int pilih1 = scanner.nextInt();
                    if(pilih1==0){
                      break;
                    } else if (pilih1 == 99) {
                        scanner.nextLine();
                        System.out.println("\n=== Input Tugas ===");
                        System.out.print("Masukkan nama tugas: ");
                        String tugasBaru = scanner.nextLine();
                        int edit= 0;
        
                        for (int i = 1; i < tugas.length; i++) {
                            if (tugas[i] == null) {
                                tugas[i] = tugasBaru;
                                edit+= i;
                                list = true;
                                break;
                            } else {
                                continue;
                            }
                        }
        
                        System.out.print("Masukkan nama pemberi tugas: ");
                        pemberiTugas[edit]= scanner.nextLine();
        
                        System.out.print("Masukkan jumlah kompen (jam): ");
                        jmlKompen[edit]= scanner.nextInt();
        
                        System.out.print("Masukkan jumlah kuota (mhs): ");
                        kuota[edit]= scanner.nextInt();
                        boolean tanggal= true;
                        
                        while(tanggal){
                        System.out.println("\nMasukkan tanggal: ");
                        System.out.print("Tanggal (DD): ");
                        tgl[edit]= scanner.nextInt();
                        System.out.print("Bulan (MM): ");
                        bln[edit]= scanner.nextInt();
                        System.out.print("Tahun (YYYY): ");
                        thn[edit]= scanner.nextInt();
                        if(thn[edit]<2000 || bln[edit]>12 || bln[edit]<1 || tgl[edit]>31 || tgl[edit]<1){
                            System.out.println("Tanggal tidak valid.");
                            continue;
                        } else{
                            break;
                        }
                    }
                        
                        for (int i = 1; i < tugas.length; i++) {
                          if (tugas[i] != null){
                              continue;
                          } else if(tugas[i]==null){
                              tersedia=i;
                              break;
                          }
                        }
                        
                        System.out.println("Tugas berhasil ditambahkan!");
                    } else if(pilih1<tersedia){
                        boolean menu1 = true;
                        while (menu1) {
                          System.out.println("\n===== Detail Tugas =====");
                            System.out.println("Nama Tugas      : " + tugas[pilih1]);
                            System.out.println("Pemberi Tugas   : " + pemberiTugas[pilih1]);
                            System.out.println("Jumlah Kompen   : " + jmlKompen[pilih1] + " jam");
                            System.out.println("Kuota           : " + kuota[pilih1] + " mhs");
                            System.out.println("Tanggal         : " + tgl[pilih1]+"/"+bln[pilih1]+"/"+thn[pilih1]);
                            System.out.println();
                            System.out.println("1. Edit");
                            System.out.println("0. Kembali");
                            System.out.print("Masukkan pilihan anda: ");
                            int pilih2 = scanner.nextInt();
        
                            if (pilih2 == 1) {
                                boolean edit = true;
                                while (edit) {
                                    System.out.println("\nMau edit apa?");
                                    System.out.println("1. Nama Tugas");
                                    System.out.println("2. Pemberi Tugas");
                                    System.out.println("3. Jumlah Kompen");
                                    System.out.println("4. Kuota");
                                    System.out.println("0. Kembali");
                                    System.out.print("Masukkan Pilihan anda: ");
                                    int pilih3 = scanner.nextInt();
                                    if (pilih3 == 1) {
                                        System.out.print("Masukkan nama tugas baru: ");
                                        String nmBaru = scanner.nextLine();
                                        tugas[pilih1] = nmBaru;
                                            System.out.println("Item berhasil diedit!");
                                            edit = false;
                                    } else if (pilih3 == 2) {
                                        System.out.print("Masukkan nama pemberi tugas baru: ");
                                        String pmbriBaru = scanner.next();
                                        pemberiTugas[pilih1] = pmbriBaru;
                                        System.out.println("Item berhasil diedit!");
                                        edit = false;
                                    } else if (pilih3 == 3) {
                                        System.out.print("Masukkan jumlah kompen baru: ");
                                        int jmlBaru = scanner.nextInt();
                                        jmlKompen[pilih1] = jmlBaru;
                                        System.out.println("Item berhasil diedit!");
                                        edit = false;
                                    } else if (pilih3 == 4) {
                                        System.out.print("Masukkan jumlah kuota baru: ");
                                        int kuotaBaru = scanner.nextInt();
                                        kuota[pilih1] = kuotaBaru;
                                        System.out.println("Item berhasil diedit!");
                                        edit = false;
                                    } else if (pilih3 == 0) {
                                        edit = false;
                                        menu1 = true;
                                    }
                                }
                            } else if (pilih2 == 0) {
                                menu1 = false;
                            }
                        }
                    } else if(pilih1>tersedia-1){
                      System.out.println("Pilihan tidak valid.");
                      continue;
                    }
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
                    loggedInDosen = false;
                    break;

                case 6:
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
                System.out.println("8. Logout");
                System.out.println("9. Quit");
                System.out.print("Masukkan pilihan anda: ");
                mhsChoice = scanner.nextByte();
    
                // Kunci Jawaban
                switch (mhsChoice) {
                    case 1: // Profile
                        byte subSubChoice11;
                        System.out.println("\n=== Profil Mahasiswa ===");
                        System.out.println("Nama            : "+mhs1[0]);
                        System.out.println("Kelas           : "+mhs1[1]);
                        System.out.println("Semester        : "+mhs1[2]);
                        System.out.println("Jurusan         : "+mhs1[3]);
                        System.out.println("Prodi           : "+mhs1[4]);
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
                        byte subChoice2, subSubChoice2;
                        boolean alpaku=true;
                            while(alpaku){
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
                                
                                if(0<subChoice2 && subChoice2<6){
                                boolean subMenu= true;
                                while(subMenu){
                                    int i= subChoice2;
                                        System.out.println("\n=== Alpaku - Semester "+i+" ===");
                                        System.out.println("Jumlah Alpa Semester "+i+": " + alpa[i] + " jam");
                                        System.out.println("Total jam tugas kompen Semester "+i+": " + kompen[i] + " jam");
                                        System.out.println("0. Kembali");
                                        System.out.println("1. Keluar");
                                        System.out.print("Masukkan pilihan Anda: ");
                                        subSubChoice2 = scanner.nextByte();
                                        switch (subSubChoice2) {
                                            case 0:
                                                subMenu= false;
                                                break;
                                            case 1:
                                                System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                                System.exit(0);
                                            default:
                                                System.out.println("Kode yang anda pilih tidak valid.");
                                        }
                                        break;
                                    }
                                }else if(subChoice2==6){
                                        System.out.println("\n=== Alpaku - Rekap Tugas Kompen ===");
                                        System.out.println("Total jam alpa anda     : " + totalAlpa + " jam");
                                        System.out.println("Total jam kompen anda   : " + totalKompen + " jam");
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
                                        }
                                    }else if(subChoice2==0){
                                        break;
                                    }
                                }
                                break;

                    case 3: // Tugas Tersedia
                    boolean tgs= true;
                        while (tgs) {
                            System.out.println("\n=== Tugas Tersedia ===");
                            for (int i = 1; i < tugas.length; i++) {
                                if (tugas[i] != null) {
                                System.out.println(i + ". " + tugas[i]);
                                    }
                                }
                                System.out.println();
                                System.out.println("0. Kembali");
                                System.out.print("Pilih tugas: ");
                                int pilih1=scanner.nextInt();
                                if(pilih1==0){
                                    break;
                                } else if(pilih1<tersedia){
                                    boolean menu1 = true;
                                    while (menu1) {
                                      System.out.println("\n===== Detail Tugas =====");
                                        System.out.println("Nama Tugas      : " + tugas[pilih1]);
                                        System.out.println("Pemberi Tugas   : " + pemberiTugas[pilih1]);
                                        System.out.println("Jumlah Kompen   : " + jmlKompen[pilih1] + " jam");
                                        System.out.println("Kuota           : " + kuota[pilih1] + " mhs");
                                        System.out.println("Tanggal         : " + tgl[pilih1]+"/"+bln[pilih1]+"/"+thn[pilih1]);
                                        System.out.println();
                                        System.out.println("1. Kerjakan");
                                        System.out.println("0. Kembali");
                                        System.out.print("Masukkan pilihan anda: ");
                                        int subChoice3 = scanner.nextInt();
                                        switch (subChoice3) {
                                            case 0:
                                                break;
                                            case 1:
                                            for(int i=1; i<doneJdl.length; i++){
                                                if(doneJdl[i]!=null){
                                                    continue;
                                                } else if(doneJdl[i]==null){
                                                    doneJdl[i]= tugas[pilih1];
                                                    donePmbr[i]= pemberiTugas[pilih1];
                                                    jmlDone[i]= jmlKompen[pilih1];
                                                    System.out.println("\nMasukkan tanggal: ");
                                                    System.out.print("Tanggal (DD): ");
                                                    tglDone[i]= scanner.nextInt();
                                                    System.out.print("Bulan (MM): ");
                                                    blnDone[i]= scanner.nextInt();
                                                    System.out.print("Tahun (YYYY): ");
                                                    thnDone[i]= scanner.nextInt();
                                                    if(totalKompen<jmlKompen[pilih1]){
                                                        totalKompen=0;
                                                    } else
                                                    totalKompen-= jmlKompen[pilih1];

                                                    for(int j= kompen.length-1; j>=1; j--){
                                                        if(kompen[j]==0){
                                                            continue;
                                                        } else if(kompen[j]!=0){
                                                            if(kompen[j]<jmlKompen[pilih1]){
                                                                jmlKompen[pilih1]-=kompen[j];
                                                                kompen[j]=0;
                                                                continue;
                                                            }
                                                            kompen[j]-= jmlKompen[pilih1];
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                                for (int i = 1; i < tugas.length; i++) {
                                                  if (tugas[i] != null){
                                                    continue;
                                                  } else if(tugas[i]==null){
                                                    tersedia=i;
                                                    break;
                                                  }
                                                }

                                            System.out.println("Selamat mengerjakan tugas anda! ^^");
                                            menu1= false;
                                            break;
                                            default:
                                                System.out.println("Kode yang anda pilih tidak valid.");
                                                break;
                                        }
                                        if (subChoice3 == 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                            break;

                    case 4: // History Tugas
                        byte subChoice4;
                        boolean history=true;
                        System.out.println("\n=== History Tugas ===");
                        while (history) {
                            boolean ada= false;
                            for(int i=1; i<doneJdl.length; i++){
                                if(doneJdl[i]==null){
                                    continue;
                                } else if(doneJdl[i]!=null){
                                    ada=true;
                                } 
                            } if(!ada){
                                System.out.println("Belum ada tugas kompen yang dikerjakan.");
                                System.out.println("Buka menu Tugas Tersedia untuk melihat tugas kompen yang dapat dikerjakan.");
                                } else if(ada){
                                for(int i=1; i<doneJdl.length; i++){
                                    if(doneJdl[i]==null){
                                        break;
                                    } else{
                                    System.out.println(+i+". "+doneJdl[i]);
                                    System.out.println("Pemberi Tugas       : "+donePmbr[i]);
                                    System.out.println("Jumlah Kompen       : "+jmlDone[i]);
                                    System.out.println("Tanggal Pengerjaan  : "+tglDone[i]+"/"+blnDone[i]+"/"+thnDone[i]);
                                    System.out.println();
                                    }
                                }
                            }
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

                    case 8: //Logout
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    loggedInMahasiswa = false;
                    break;

                    case 9: //Quit
                        System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Kode yang anda pilih tidak valid.");
                        break;
                }
            }
        }
        scanner.close();
    }
}