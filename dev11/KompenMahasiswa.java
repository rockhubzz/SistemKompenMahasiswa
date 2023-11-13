import java.util.Scanner;

public class KompenMahasiswa {
    public static void main(String[] args) {

        // Initializations
        Scanner scanner = new Scanner(System.in);
        int smtSkrg= 5, totalAlpa= 0, totalKompen= 0;
        int[] alpa= new int[15], kompen= new int[15];
        String[] tugas = new String[100], pemberiTugas = new String[100], doneJdl= new String[100], donePmbr= new String[100];
        int[] jmlKompen= new int[100], kuota= new int[100], tgl= new int[100], bln= new int[100], thn= new int[100], tglDone= new int[100], blnDone= new int[100], thnDone= new int[100], jmlDone= new int[100];
        int tersedia= 0;

        String adm[]= {"admin1", "adminkompen"};
        String dsn[]= {"dosen1", "dosenkompen"};
        String mhs[]= {"mahasiswa1", "mahakompen"};

        boolean loggedInAdmin = false, loggedInDosen = false, loggedInMahasiswa = false, superuser = false;

        alpa[0]= 0;
        alpa[1]= 1;
        alpa[2]= 4;
        alpa[3]= 3;
        alpa[4]= 2;
        alpa[5]= 0;

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

        tugas[3] = "Membantu penulisan buku";
        pemberiTugas[3] = "Meyti Eka Apriani, ST, MT";
        jmlKompen[3]= 42;
        kuota[3]= 1;
        tgl[3]= 3; bln[3]= 10; thn[3]= 2023;

        tugas[4] = "Rekap nilai";
        pemberiTugas[4] = "Kadek Suarjuna Batubulan";
        jmlKompen[4]= 20;
        kuota[4]= 5;
        tgl[4]= 5; bln[4]= 10; thn[4]= 2023;

        tugas[5] = "Edit form surat";
        pemberiTugas[5] = "Kadek Suarjuna Batubulan";
        jmlKompen[5]= 12;
        kuota[5]= 1;
        tgl[5]= 25; bln[5]= 10; thn[5]= 2023;


        for (int i = 1; i < tugas.length; i++) {
          if (tugas[i] != null){
            continue;
          } else if(tugas[i]==null){
            tersedia=i;
            break;
          }
        }


        //index data:
        //0:jabatan 
        //1:nama 
        //2:kelas 
        //3:semester 
        //4:jurusan 
        //5:prodi

        //Data mhs1
        String[] mhs1= {"Mahasiswa",
        "Meganthropus Paleojavanicus",
        "TI - 1F",
        "5",
        "Teknologi Informasi",
        "Teknik Informatika",
    };

        //Data dsn1
        String dsn1[]= {
            "Dosen",
            "Bpk. Yang Mulia Dosen"
        };

        //Data adm1
        String adm1[]={
            "Admin",
            "Bpk. Ucup Saifullah"
        };

        for(int i=1; i<smtSkrg+1; i++){
            totalAlpa+= alpa[i];
            kompen[i] = alpa[i] * (2 * ((smtSkrg+1) - i));
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

                    if (UsnInput.equals(adm[0]) && PWInput.equals(adm[1])) {
                        System.out.println("Selamat datang, "+adm[0]+"!");
                        loggedInAdmin = true;
                    } else if(UsnInput.equals(dsn[0]) && PWInput.equals(dsn[1])){
                        System.out.println("Selamat datang, "+dsn[0]+"!");
                        loggedInDosen=true;
                    } else if(UsnInput.equals(mhs[0]) && PWInput.equals(mhs[1])){
                        System.out.println("Selamat datang, "+mhs[0]+"!");
                        loggedInMahasiswa=true;
                    } else if(UsnInput.equals("root") && PWInput.equals("admin")){
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
            System.out.println("2. Audit Data Profile");
            System.out.println("3. Input Alpa");
            System.out.println("4. Manage Keamanan");
            System.out.println("5. Help");
            System.out.println("6. Logout");
            System.out.println("7. Quit");
            System.out.print("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();
            boolean choicee= true;

            while(choicee){
            switch (choice) {
                case 1:
                    System.out.println("\n=== Profil Admin ===");
                    System.out.println("Nama:       "+adm1[1]);
                    System.out.println("0. Kembali");
                    System.out.println("1. Keluar");
                    System.out.print("Masukkan pilihan anda: ");
                    int subSubChoice01 = scanner.nextInt();
                    switch (subSubChoice01) {
                        case 0:
                        choicee= false;
                            break;
                        case 1:
                            System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Kode yang anda pilih tidak valid.");
                    }
                    if (subSubChoice01 == 0) {
                        break;
                    }
                    break;

                    case 2:
                    System.out.println("\n===== Audit Data =====");
                    System.out.println("Pilih data yang akan diedit:");
                    System.out.println("1. Admin");
                    System.out.println("2. Dosen");
                    System.out.println("3. Mahasiswa");
                    System.out.println("0. Kembali");
                    System.out.print("Masukkan pilihan anda: ");
                    int auditMenu= scanner.nextInt();
                    String level[]= new String[10];

                    if(auditMenu>3){
                        System.out.println("Pilihan anda tidak valid.");
                        continue;
                    }

                    if(auditMenu==1) level=adm1;
                    else if(auditMenu==2) level=dsn1;
                    else if(auditMenu==3) level=mhs1;

                    if(auditMenu==0){
                        choicee=false;
                        break;
                    }
                    if(auditMenu<=3 && auditMenu>0){
                        System.out.println("\n1. "+level[1]);
                        System.out.print("Pilih "+level[0]+" yang ingin diedit: ");
                        int nmEdit= scanner.nextInt();
                        if(nmEdit!=1) continue;
                        boolean m12=true;
                        while(m12){
                        String item[]= {"Nama"};
                        String itemMhs[]= {"Nama", "Kelas", "Semester", "Jurusan", "Prodi"};
                        System.out.println("\n===== Audit Data =====");
                        System.out.println("Pilih item yang akan diedit: ");
                        if(auditMenu==1 || auditMenu==2){
                        for(int i=0; i<item.length; i++){
                            System.out.println((i+1)+". "+item[i]);
                        } 
                        } else if(auditMenu==3){
                            for(int i=0; i<itemMhs.length; i++){
                            System.out.println((i+1)+". "+itemMhs[i]);
                        }
                    }
                    System.out.println();
                        System.out.println("0. Kembali");
                        System.out.print("Masukkan pilihan anda: ");
                        int data= scanner.nextInt();
                        if(data==0){
                            m12=false;
                            break;
                        }
                        System.out.println();
                        scanner.nextLine();
                        boolean newIn=true;
                        while(newIn){
                        if(auditMenu==1){
                        System.out.println(item[data-1]+" saat ini: "+adm1[data]);
                        System.out.print("Masukkan "+item[data-1]+" yang baru: ");
                        }else if(auditMenu==2){
                        System.out.println(item[data-1]+" saat ini: "+dsn1[data]);
                        System.out.print("Masukkan "+item[data-1]+" yang baru: ");
                        }else if(auditMenu==3){
                        System.out.println(itemMhs[data-1]+" saat ini: "+mhs1[data]);
                        System.out.print("Masukkan "+itemMhs[data-1]+" yang baru: ");
                        }
                        String newItem= scanner.nextLine();
                        if(auditMenu==1){
                        adm1[data]= newItem;
                        }else if(auditMenu==2){
                        dsn1[data]= newItem;
                        }else if(auditMenu==3){
                            if(data==3){
                                if(Integer.valueOf(newItem)>14){
                                    System.out.println("Semester tidak valid.");
                                    continue;
                                }
                                smtSkrg=Integer.valueOf(newItem);
                                mhs1[data]=newItem;
                                totalAlpa=0;
                                totalKompen=0;
                                for(int i=14; i>smtSkrg;i--){
                                    alpa[i]=0;
                                    kompen[i]=0;
                                }
                                for(int i=1; i<smtSkrg+1; i++){
                                    totalAlpa+= alpa[i];
                                    kompen[i] = alpa[i] * (2 * ((smtSkrg+1) - i));
                                    totalKompen+= kompen[i];
                                }

                            } else
                            mhs1[data]=newItem;
                        }
                        
                        System.out.println("Item berhasil diedit!");
                        m12=false;
                        break;
                    }
                    }
                    }
                    break;

                case 3:
                    System.out.println("\n=== Input Alpa ===");
                    System.out.println("Pilih nama mahasiswa yang akan anda input alpa:");
                    System.out.println("1. "+mhs1[1]);
                    System.out.println("0. Kembali");
                    System.out.print("Masukkan pilihan anda: ");
                    byte inputAlpa = scanner.nextByte();
                    switch (inputAlpa) {
                        case 0:
                            choicee= false;
                            break;
                        case 1:
                        boolean case1= true;
                        while(case1){
                            System.out.print("\nMasukkan semester: ");
                            int smtEdit= scanner.nextInt();
                            if(smtEdit > Integer.valueOf(smtSkrg)){
                                System.out.println("Semester tidak valid.");
                                continue;
                            }
                            System.out.println("Jumlah jam alpa semester "+smtEdit+" saat ini: "+alpa[smtEdit]+" jam");
                            System.out.print("Masukkan jumlah jam alpa yang ingin ditambahkan: ");
                            int alpaPlus= scanner.nextInt();

                            alpa[smtEdit]+=alpaPlus;
                            for(int i=1; i<smtSkrg+1; i++){
                                if(i!=smtEdit) continue;
                                else if(i==smtEdit){
                                totalAlpa+= alpa[i];
                                kompen[i] = alpa[i] * (2 * ((smtSkrg+1) - i));
                                totalKompen+= kompen[i];
                                }
                            }

                            System.out.println("\nAlpa berhasil ditambahkan!");
                            System.out.println("Jumlah jam alpa "+mhs1[0]+" semester "+smtEdit+" saat ini adalah: "+ alpa[smtEdit]+ " jam,");
                            System.out.println("dengan total jam kompen di semester "+smtEdit+" adalah: "+ kompen[smtEdit]+" jam.");
                            case1= false;
                            break;
                        }
                        totalAlpa= 0;
                        totalKompen= 0;
                        for(int i=1; i<alpa.length; i++){
                            totalAlpa+= alpa[i];
                            totalKompen+= kompen[i];
                            }
                        break;
                        
                        default:
                            System.out.println("Kode yang anda pilih tidak valid.");
                            choicee= false;
                            break;
                    }
                        break;

                    case 4:
                    System.out.println("\n===== Manage Keamanan =====");
                    System.out.println("1. Admin");
                    System.out.println("2. Dosen");
                    System.out.println("3. Mahasiswa");
                    System.out.println("\n0. Kembali");
                    System.out.print("Masukkan pilihan anda: ");
                    int aman= scanner.nextInt();
                    String usnPw[]= {"Username", "Password"};
                    String acc[]= new String[2];

                    if(aman>3){
                        System.out.println("Pilihan anda tidak valid.");
                        continue;
                    }
                    if(aman==0){
                        choicee=false;
                        break;
                    }
                    System.out.println("\n===== Manage Keamanan =====");
                    System.out.println("Pilih akun: ");
                    if(aman==1){
                            System.out.println("1. "+adm[0]);
                            for(int i=0; i<acc.length; i++){
                                acc[i]=adm[i];
                            }
                        } else if(aman==2){
                            System.out.println("1. "+dsn[0]);
                            for(int i=0; i<acc.length; i++){
                                acc[i]=dsn[i];
                            }
                        } else if(aman==3){
                            System.out.println("1. "+mhs[0]);
                            for(int i=0; i<acc.length; i++){
                                acc[i]=mhs[i];
                            }
                        }
                        System.out.println("\n0. Kembali");
                        System.out.print("Masukkan pilihan anda: ");
                        int editAcc= scanner.nextInt();
                        if(editAcc==0){
                            break;
                        }

                        System.out.println("\n===== Manage Keamanan =====");
                        System.out.println("1. Ubah Username");
                        System.out.println("2. Ubah Password");
                        System.out.println("\n0. Kembali");
                        System.out.print("Masukkan pilihan anda: ");
                        int editCre= scanner.nextInt();
                        if(editCre==0){
                        break;
                    }
                        if(editCre>3){
                        System.out.println("Pilihan anda tidak valid.");
                        continue;
                    }

                    boolean verif=true;

                    scanner.nextLine();
                    while(verif){
                    System.out.print("\nMasukkan Password anda: ");
                    String ver= scanner.nextLine();
                    if(ver.equals(adm[1])){
                        verif=false;
                        break;
                    } else{
                        System.out.println("Password yang anda masukkan salah.");
                        continue;
                    }
                }
                boolean edit=true;
                    while(edit){
                        System.out.print("Masukkan "+usnPw[editCre-1]+" "+acc[0]+" baru: ");
                        String newUsn= scanner.nextLine();
                        if(newUsn.equals(acc[editCre-1])){
                            System.out.println(usnPw[editCre-1]+" baru tidak boleh sama.");
                            continue;
                        } else{
                            if(aman==1){
                                adm[editCre-1]=newUsn;
                            } else if(aman==2){
                                dsn[editCre-1]=newUsn;
                            } else if(aman==3){
                                mhs[editCre-1]=newUsn;
                            }
                            System.out.println(usnPw[editCre-1]+" "+acc[0]+" berhasil diubah!");
                            edit=false;
                            break;
                        }
                    }
                        break;

                 case 5:
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

                
                case 6:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    choicee= false;
                    loggedInAdmin = false;
                    break;
                case 7:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                   System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan tidak valid.");
                    choicee= false;
                    break;
                }
            }
        }

            while (loggedInDosen) {
            System.out.println("\n=== Sistem Kompen Mahasiswa ===");
            System.out.println("1. Profile");
            System.out.println("2. Input Tugas");
            System.out.println("3. Keamanan");
            System.out.println("4. Help");
            System.out.println("5. Contact Admin");
            System.out.println("6. Logout");
            System.out.println("7. Quit");
            System.out.print("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();
            boolean choicee= true;

            while(choicee){
            switch (choice) {
                case 1:
                    System.out.println("\n=== Profil Dosen ===");
                    System.out.println("Nama:       "+dsn1[1]);
                    System.out.println("0. Kembali");
                    System.out.println("1. Keluar");
                    System.out.print("Masukkan pilihan anda: ");
                    int subSubChoice01 = scanner.nextInt();
                    switch (subSubChoice01) {
                        case 0:
                            choicee= false;
                            break;
                        case 1:
                            System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Kode yang anda pilih tidak valid");
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
                        choicee= false;
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
                            System.out.println("2. Hapus");
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
                            } else if(pilih2==2){
                                System.out.print("Apakah anda yakin ingin menghapus tugas ini? (y/n):");
                                String hps= scanner.next();

                                if(hps.equalsIgnoreCase("y")){
                                    if (pilih1 < tugas.length) {
                                        tugas[pilih1]=null;
                                        pemberiTugas[pilih1]=null;
                                        jmlKompen[pilih1]=0;
                                        tgl[pilih1]=0;
                                        bln[pilih1]=0;
                                        thn[pilih1]=0;
                                        for (int i = pilih1; i < tugas.length - 1; i++) {
                                            tugas[i] = tugas[i + 1];
                                            pemberiTugas[i] = pemberiTugas[i + 1];
                                            jmlKompen[i] = jmlKompen[i + 1];
                                            kuota[i] = kuota[i + 1];
                                            tgl[i] = tgl[i + 1];
                                            bln[i] = bln[i + 1];
                                            thn[i] = thn[i + 1];
                                        }
                                    System.out.println("Tugas berhasil dihapus!");
                                    break;
                                } else if(hps.equalsIgnoreCase("n")){
                                    break;
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
                    System.out.println("\n===== Keamanan =====");
                    System.out.println("1. Ubah Username");
                    System.out.println("2. Ubah Password");
                    System.out.println("0. Kembali");
                    System.out.print("Masukkan pilihan anda: ");
                    int aman= scanner.nextInt();
                    String usnPw[]= {"Username", "Password"};
                    
                    if(aman==0){
                        choicee=false;
                        break;
                    }
                    boolean verif=true;

                    scanner.nextLine();
                    while(verif){
                    System.out.print("\nMasukkan Password anda saat ini: ");
                    String ver= scanner.nextLine();
                    if(ver.equals(dsn[aman-1])){
                        verif=false;
                        break;
                    } else{
                        System.out.println("Password yang anda masukkan salah.");
                        continue;
                    }
                }
                boolean edit=true;
                    while(edit){
                        System.out.print("Masukkan "+usnPw[aman-1]+" baru: ");
                        String newUsn= scanner.nextLine();
                        if(newUsn.equals(dsn[aman-1])){
                            System.out.println(usnPw[aman-1]+" baru tidak boleh sama.");
                            continue;
                        } else{
                            dsn[aman-1]=newUsn;
                            System.out.println(usnPw[aman-1]+" berhasil diubah!");
                            edit=false;
                            break;
                        }
                    }
                        break;

                case 4:
                            System.out.println("\n=== Help ===");
                            System.out.println("Maaf, untuk saat ini menu Help belum tersedia.");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            byte help = scanner.nextByte();
                            switch (help) {
                                case 0:
                                choicee= false;
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
                case 5:
                            System.out.println("\n=== Contact Admin ===");
                            System.out.println("Maaf, untuk saat ini menu Contact Admin belum tersedia.");
                            System.out.println("0. Kembali");
                            System.out.println("1. Keluar");
                            System.out.print("Masukkan pilihan anda: ");
                            byte ctAdmin = scanner.nextByte();
                            switch (ctAdmin) {
                                case 0:
                                choicee= false;
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
                    case 6:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    choicee= false;
                    loggedInDosen = false;
                    break;

                case 7:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan tidak valid.");
                    choicee= false;
                    break;
                }
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
                System.out.println("6. Keamanan");
                System.out.println("7. Help");
                System.out.println("8. Contact Admin");
                System.out.println("9. Logout");
                System.out.println("10. Quit");
                System.out.print("Masukkan pilihan anda: ");
                mhsChoice = scanner.nextByte();
                boolean choicee= true;
                
                // Kunci Jawaban
                switch (mhsChoice) {
                    case 1: // Profile
                        byte subSubChoice11;
                        System.out.println("\n=== Profil Mahasiswa ===");
                        System.out.println("Nama            : "+mhs1[1]);
                        System.out.println("Kelas           : "+mhs1[2]);
                        System.out.println("Semester        : "+mhs1[3]);
                        System.out.println("Jurusan         : "+mhs1[4]);
                        System.out.println("Prodi           : "+mhs1[5]);
                        System.out.println("0. Kembali");
                        System.out.println("1. Keluar");
                        System.out.print("Masukkan pilihan anda: ");
                        subSubChoice11 = scanner.nextByte();
                        switch (subSubChoice11) {
                            case 0:
                            choicee= false;
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
                        int rekap= smtSkrg+1;
                            while(alpaku){
                                System.out.println("\n===== Alpaku =====");
                                for(int i=1; i<smtSkrg+1; i++){
                                    System.out.println(i+". "+"Semester "+i);
                                }
                                System.out.println(rekap+". Rekap Tugas Kompen");
                                System.out.println("0. Kembali");
                                System.out.print("Masukkan pilihan anda: ");
                                subChoice2 = scanner.nextByte();
                                boolean semester= true;
                                
                                while(semester){
                                if(0<subChoice2 && subChoice2<smtSkrg+1){
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
                                                semester= false;
                                                break;
                                            case 1:
                                                System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                                System.exit(0);
                                            default:
                                                System.out.println("Kode yang anda pilih tidak valid.");
                                                break;
                                        }
                                        break;
                                    }
                                }else if(subChoice2==rekap){
                                        System.out.println("\n=== Alpaku - Rekap Tugas Kompen ===");
                                        System.out.println("Total jam alpa anda     : " + totalAlpa + " jam");
                                        System.out.println("Total jam kompen anda   : " + totalKompen + " jam");
                                        System.out.println("0. Kembali");
                                        System.out.println("1. Keluar");
                                        System.out.print("Masukkan pilihan Anda: ");
                                        subSubChoice2 = scanner.nextByte();
                                            switch (subSubChoice2) {
                                            case 0:
                                            semester= false;
                                                break;
                                            case 1:
                                                System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                                System.exit(0);
                                            default:
                                                System.out.println("Kode yang anda pilih tidak valid.");
                                            }
                                        }else if(subChoice2==0){
                                            alpaku= false;
                                            break;
                                        } else{
                                        System.out.println("Kode yang anda pilih tidak valid.");
                                        break;
                                    }
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
                                }else if(pilih1>tersedia || pilih1>tugas.length){
                                    System.out.println("Pilihan tidak valid.");
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
                        while (history) {
                            System.out.println("\n=== History Tugas ===");
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
                                history= false;
                                    break;
                                case 1:
                                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Kode yang anda pilih tidak valid.");
                                    break;
                            }
                            if (subChoice4>tugas.length) {
                                System.out.println("Kode yang anda pilih tidak valid.");
                                break;
                            }
                        }
                        break;

                    case 5: // Peraturan Sistem Kompen Mahasiswa
                        byte subChoice5;
                        while (true) {
                            System.out.println("\n=== Peraturan Sistem Kompen Mahasiswa ===");
                            System.out.println("1. Kompensasi tidak menghapuskan jumlah ketidakhadiran");
                            System.out.println("2. Kompensasi tidak boleh digantikan dalam bentuk uang atau barang ");
                            System.out.println("3. Besarnya kompensasi ditentukan berdasarkan jumlah jam alpa dikalikan dua");
                            System.out.println("4. Kompensasi dilaksanakan setelah jam pelajaran resmi berakhir atau apa saat liburan.");
                            System.out.println("5. Bilamana kompensasi tidak dilaksanakan pada semester yang sama");
                            System.out.println("maka jumlah kompensasi dikalikan dua pada semester berikutnya dan demikian seterusnya. ");
                            System.out.println("\n0. Kembali");
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

                    case 6: //Keamanan
                    System.out.println("\n===== Keamanan =====");
                    System.out.println("1. Ubah Username");
                    System.out.println("2. Ubah Password");
                    System.out.println("0. Kembali");
                    System.out.print("Masukkan pilihan anda: ");
                    int aman= scanner.nextInt();
                    String usnPw[]= {"Username", "Password"};
                    
                    if(aman==0){
                        choicee=false;
                        break;
                    }
                    boolean verif=true;

                    scanner.nextLine();
                    while(verif){
                    System.out.print("\nMasukkan Password anda saat ini: ");
                    String ver= scanner.nextLine();
                    if(ver.equals(mhs[aman-1])){
                        verif=false;
                        break;
                    } else{
                        System.out.println("Password yang anda masukkan salah.");
                        continue;
                    }
                }
                boolean edit=true;
                    while(edit){
                        System.out.print("Masukkan "+usnPw[aman-1]+" baru: ");
                        String newUsn= scanner.nextLine();
                        if(newUsn.equals(mhs[aman-1])){
                            System.out.println(usnPw[aman-1]+" baru tidak boleh sama.");
                            continue;
                        } else{
                            mhs[aman-1]=newUsn;
                            System.out.println(usnPw[aman-1]+" berhasil diubah!");
                            edit=false;
                            break;
                        }
                    }
                        break;


                    case 7: // Help
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

                    case 8: // Contact Admin
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

                    case 9: //Logout
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    loggedInMahasiswa = false;
                    break;

                    case 10: //Quit
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