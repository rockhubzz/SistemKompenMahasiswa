import java.util.Scanner;
public class KompenMahasiswa {

    //Initializations
    public static int totalAlpa[]= new int[11], totalKompen[]= new int[11];
    public static int[][] alpa= new int[11][15], kompen= new int[11][15];
    public static String tugas[][] = new String[100][100]; 
    public static String[][][] listReq= new String[10][100][11], tugasDone= new String [10][100][10];
    public static int tersedia= 0, in=0;
    public static int smtSkrg[]= {0,5,3,2,0,0,0,0,0,0,0};

    //data LogIn
    public static String adm[][]= {{"admin1", "admin2", "admin3"}, {"adminkompen", "kompenadmin", "adminadmin"}};
    public static String dsn[][]= {{"dosen1", "dosen2", "dosen3"}, {"dosenkompen", "kompendosen", "dosendosen"}};
    public static String mhs[][]= new String[2][11];
    public static String[][] mhsData = new String[11][10];

    static{
        mhs[0][0]= "mahasiswa1";
        mhs[0][1]= "mahasiswa2";
        mhs[0][2]= "2341720257";
        mhs[1][0]= "mahakompen";
        mhs[1][1]= "kompenmaha";
        mhs[1][2]= "2341720257";
    }

    public static void inputData() {
        // data mhs1
        mhsData[0][0] = "Mahasiswa";

        mhsData[1][0] = "Gheriya Rahima J.";
        mhsData[1][1] = "TI - 1F";
        mhsData[1][2] = String.valueOf(smtSkrg[1]);
        mhsData[1][3] = "2520708876";
        mhsData[1][4] = "Teknologi Informasi";
        mhsData[1][5] = "Teknik Informatika";

        // data mhs2
        mhsData[2][0] = "Lelyta Meyda Ayu";
        mhsData[2][1] = "TI - 1E";
        mhsData[2][2] = String.valueOf(smtSkrg[2]);
        mhsData[2][3]= "2727457149";
        mhsData[2][4] = "Teknologi Informasi";
        mhsData[2][5] = "Teknik Informatika";

        // data mhs3
        mhsData[3][0] = "Rahmalia Mutia F.";
        mhsData[3][1] = "SIB - 1A";
        mhsData[3][2] = String.valueOf(smtSkrg[3]);
        mhsData[3][3] = "2341720257";
        mhsData[3][4] = "Teknologi Informasi";
        mhsData[3][5] = "Sistem Informasi Bisnis";
        }
    //Data dsn1
    public static String dsnData[][]= {
        {"Dosen"},
        {"Vanessa Cristin Natalia, S.Kom., M.Kom", "081918242172", "Ruang Dosen 6"},
        {"Algi Pebrianto, S.Kom., M.Kom", "082134653299", "Ruang Dosen 6"},
        {"Annisa Kurniawati, S.Kom,. M.Kom", "082134653299", "Ruang Dosen 6"}
    };
    //Data adm1
    public static String admData[][]={
        {"Admin"},
        {"Rocky Alessandro K.", "088999777666"},
        {"Erik Ridho F.", "081555777333"},
        {"Salsabila Mahda R.", "081918242172"}
    };

    static  {
    //array alpa mhs1
    alpa[1][1]= 1;
    alpa[1][2]= 4;
    alpa[1][3]= 3;
    alpa[1][4]= 2;
    alpa[1][5]= 0;

    //array alpa mhs2
    alpa[2][1]=0;
    alpa[2][2]=2;
    alpa[2][3]=1;

    //array alpa mhs3
    alpa[3][1]=3;
    alpa[3][2]=1;

    //array tugas tersedia
    //tugas[urutan][
        // judul, 
        // jumlah jam kompen,
        // kuota mahasiswa,
        // tgl, bulan, thn]

    tugas[1][0] = "JIP";
    tugas[1][1] = dsnData[1][0];
    tugas[1][2]= String.valueOf(100);
    tugas[1][3]= String.valueOf(0);
    tugas[1][4]= String.valueOf(20); tugas[1][5]= String.valueOf(9); tugas[1][6]= String.valueOf(2023);
    
    tugas[2][0] = "Editing Word";
    tugas[2][1] = dsnData[1][0];
    tugas[2][2] = String.valueOf(200);
    tugas[2][3] = String.valueOf(1);
    tugas[2][4] = String.valueOf(1); tugas[2][5] = String.valueOf(10); tugas[2][6] = String.valueOf(2023);
    
    tugas[3][0] = "Membantu Penulisan Buku";
    tugas[3][1] = dsnData[2][0];
    tugas[3][2] = String.valueOf(42);
    tugas[3][3] = String.valueOf(1);
    tugas[3][4] = String.valueOf(3); tugas[3][5] = String.valueOf(10); tugas[3][6] = String.valueOf(2023);
    
    tugas[4][0] = "Rekap Nilai";
    tugas[4][1] = dsnData[3][0];
    tugas[4][2] = String.valueOf(20);
    tugas[4][3] = String.valueOf(5);
    tugas[4][4] = String.valueOf(5); tugas[4][5] = String.valueOf(10); tugas[4][6] = String.valueOf(2023);
    
    tugas[5][0] = "Edit form surat";
    tugas[5][1] = dsnData[3][0];
    tugas[5][2] = String.valueOf(20);
    tugas[5][3] = String.valueOf(5);
    tugas[5][4] = String.valueOf(20); tugas[5][5] = String.valueOf(10); tugas[5][6] = String.valueOf(2023);
    }


    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        inputData();
          //hitung kompen, totalkompen, totalalpa
        for (int i = 0; i < smtSkrg.length; i++) {
            for(int j=1; j<alpa[i].length; j++){
            totalAlpa[i] += alpa[i][j];
            kompen[i][j] = alpa[i][j] * (int) Math.pow(2, smtSkrg[i]-j +1);
            totalKompen[i] += kompen[i][j];
            }
        } 
         LogIn();
    }

    public static void LogIn() {
        boolean LogIn = true;
        while(LogIn) {
                System.out.println("-------------------------------");
                System.out.println("|== Sistem Kompen Mahasiswa ==|");
                System.out.println("-------------------------------");
                System.out.print("Masukkan username anda: ");
                String UsnInput = scanner.next();
                if((UsnInput.equalsIgnoreCase("exit")) || UsnInput.equalsIgnoreCase("quit")){
                    System.exit(0);
                }
                System.out.print("Masukkan password anda: ");
                String PWInput = scanner.next();
                boolean sukses=false;
                for(int i=0;i<adm[0].length; i++){
                    if (UsnInput.equals(adm[0][i]) && PWInput.equals(adm[1][i])) {
                        in= i+1;
                        System.out.println("Selamat datang, "+admData[in][0]+"!");
                        sukses=true;
                        MenuAdmin();
                        break;
                    }
                }
                for(int i=0; i<dsn[0].length; i++){
                    if(UsnInput.equals(dsn[0][i]) && PWInput.equals(dsn[1][i])){
                        in= i+1;
                        System.out.println("Selamat datang, "+dsnData[in][0]+"!");
                        sukses=true;
                        MenuDosen();
                        break;
                    }
                }
                for(int i=0; i<mhs[0].length; i++){
                    if(UsnInput.equals(mhs[0][i]) && PWInput.equals(mhs[1][i])){
                        in= i+1;
                        System.out.println("Selamat datang, "+mhsData[in][0]+"!");
                        sukses=true;
                        MenuMahasiswa();
                    break;
                }
            }
                
            if(!sukses){
            System.out.println("Username dan Password yang anda masukkan salah. Silakan coba lagi.");
            continue;
            } else {
            break;
            }
        
    }
}
    private static void MenuAdmin() {
        while (true) {
            System.out.println("\n-------------------------------");
            System.out.println("|== Sistem Kompen Mahasiswa ==|");
            System.out.println("-------------------------------");
            System.out.println("|1. Profile                   |");
            System.out.println("|2. Audit Data Profile        |");
            System.out.println("|3. Input Alpa                |");
            System.out.println("|4. Data Mahasiswa            |");
            System.out.println("|5. Manage Keamanan           |");
            System.out.println("|6. Help                      |");
            System.out.println("|7. Logout                    |");
            System.out.println("|8. Quit                      |");
            System.out.println("-------------------------------");
            System.out.print("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    String userType = "Admin";
                    Profile(userType);
                    break;
                case 2:
                    AuditData();
                    break;
                case 3:
                    InputAlpa();
                    break;
                case 4:
                    DataMahasiswa();
                    break;
                case 5:
                    ManageKeamanan();
                    break;
                 case 6:
                    Helpadmin();
                    break;
                case 7:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    LogIn();
                    break;
                case 8:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan tidak valid.");
                    break;
            }
                
                
        }   
    }

    private static void MenuDosen() {
        while (true) {
            System.out.println("\n-------------------------------");
            System.out.println("|== Sistem Kompen Mahasiswa ==|");
            System.out.println("-------------------------------");
            System.out.println("|1. Profile                   |");
            System.out.println("|2. Input Tugas               |");
            System.out.println("|3. Request Pengerjaan Tugas  |");
            System.out.println("|4. Keamanan                  |");
            System.out.println("|5. Help                      |");
            System.out.println("|6. Contact Admin             |");
            System.out.println("|7. Logout                    |");
            System.out.println("|8. Quit                      |");
            System.out.println("-------------------------------");
            System.out.print("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();
            String userType = "Dosen";

            switch (choice) {
                case 1:
                    Profile(userType);
                    break;
                case 2:
                    InputTugas();
                    break;
                case 3:
                ReqTugas(in);
                break;
                case 4:
                    Keamanan(userType);
                    break;
                case 5:
                    Helpdosen();
                    break;
                case 6:
                    ContactAdmin();
                    break;
                case 7:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    LogIn();
                    break;
                case 8:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan tidak valid.");
                    break;
            }
        }
    }

    private static void MenuMahasiswa() {
        while(true){
            byte mhsChoice;
            System.out.println("\n---------------------------------------");
            System.out.println("|  ==== Sistem Kompen Mahasiswa ====  |");
            System.out.println("---------------------------------------");
            System.out.println("|1. Profile                           |");
            System.out.println("|2. Alpaku                            |");
            System.out.println("|3. Tugas Tersedia                    |");
            System.out.println("|4. History Tugas                     |");
            System.out.println("|5. Peraturan Sistem Kompen Mahasiswa |");
            System.out.println("|6. Keamanan                          |");
            System.out.println("|7. Help                              |");
            System.out.println("|8. Contact Admin                     |");
            System.out.println("|9. Logout                            |");
            System.out.println("|10. Quit                             |");
            System.out.println("--------------------------------------");
            if(mhs[0][in-1].equals(mhsData[in][3]) || mhs[1][in-1].equals(mhsData[in][3])){
                System.out.println("Username atau password anda masih menggunakan NIM,");
                System.out.println("Harap segera ubah username dan password anda pada menu Keamanan.\n");
            }
            System.out.print("Masukkan pilihan anda: ");
            mhsChoice = scanner.nextByte();
            String userType = "Mahasiswa";
            switch (mhsChoice) {
                case 1:
                    Profile(userType);
                break;
                case 2:
                    Alpaku();
                    break;
                case 3:
                    TugasTersedia();
                    break;
                case 4: 
                    HistoryTugas();
                    break;
                case 5:
                    Peraturan();
                    break;
                case 6:
                    Keamanan(userType);
                    break;
                case 7:
                    Helpmahasiswa();
                    break;
                case 8:
                    ContactAdmin();
                    break;
                case 9:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    LogIn();
                break;
                case 10:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Kode yang anda pilih tidak valid.");
                    break;
            }
        }
    
    }
    private static void Profile(String userType) {
        System.out.println("\n----------------------------------------");
        System.out.println("|======= Profile " + userType + " =======|");
        System.out.println("----------------------------------------");
            switch (userType) {
                case "Mahasiswa":
                    System.out.println("Nama            : " + mhsData[in][0]);
                    System.out.println("Kelas           : " + mhsData[in][1]);
                    System.out.println("Semester        : " + mhsData[in][2]);
                    System.out.println("NIM             : " + mhsData[in][3]);
                    System.out.println("Jurusan         : " + mhsData[in][4]);
                    System.out.println("Prodi           : " + mhsData[in][5]);
                    break;
                case "Admin":
                    System.out.println("Nama        :       " + admData[in][0]);
                    System.out.println("No. HP      :       " + admData[in][1]);
                    break;
                case "Dosen":
                    System.out.println("Nama        : " + dsnData[in][0]);
                    System.out.println("No. HP      : " + dsnData[in][1]);
                    System.out.println("Ruangan     : " + dsnData[in][2]);
                    break;
            }
            Pilihan();
    }

    private static void AuditData() {
        System.out.println("-------------------------------");
        System.out.println("|========= Audit Data ========|");
        System.out.println("-------------------------------");
        System.out.println("Pilih data yang akan diedit:");
        System.out.println("1. Admin");
        System.out.println("2. Dosen");
        System.out.println("3. Mahasiswa");
        System.out.println("0. Kembali");
        System.out.print("Masukkan pilihan anda: ");
        int auditMenu= scanner.nextInt();
        String level[][]= new String[10][10];

        if(auditMenu>3){
            System.out.println("Pilihan anda tidak valid.");
            return;
        }

        if(auditMenu==0){
            return;
        }
        if(auditMenu>0 && auditMenu<4){
            if(auditMenu==1) level=admData;
            else if(auditMenu==2) level=dsnData;
            else if(auditMenu==3) level=mhsData;

            System.out.println("-------------------------------");
            System.out.println("|========= Audit Data ========|");
            System.out.println("-------------------------------");
            for(int i=1; i<level.length; i++){
                if(level[i][0]==null){
                    break;
                }
                System.out.println(i+". "+level[i][0]);
                }
            System.out.println("\n0. Kembali");
            System.out.print("Pilih "+level[0][0]+" yang ingin diedit: ");
            int nmEdit= scanner.nextInt();
            if(nmEdit==0) return;
            boolean m12=true;
            while(m12){
                String itemAdm[]= {"Nama", "No. HP"};
                String itemDsn[]= {"Nama", "No. HP", "Ruangan"};
                String itemMhs[]= {"Nama", "Kelas", "Semester","NIM", "Jurusan", "Prodi"};
                System.out.println("-------------------------------");
                System.out.println("|========= Audit Data ========|");
                System.out.println("-------------------------------");
                System.out.println("Pilih item yang akan diedit: ");
                if(auditMenu==1){
                    for(int i=0; i<itemAdm.length; i++){
                        System.out.println((i+1)+". "+itemAdm[i]);
                    } 
                } else if(auditMenu==2){
                    for(int i=0; i<itemDsn.length; i++){
                        System.out.println((i+1)+". "+itemDsn[i]);
                    } 
                }else if(auditMenu==3){
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
                        System.out.println(itemAdm[data-1]+" saat ini: "+admData[nmEdit][data-1]);
                        System.out.print("Masukkan "+itemAdm[data-1]+" yang baru: ");
                    }else if(auditMenu==2){
                        System.out.println(itemDsn[data-1]+" saat ini: "+dsnData[nmEdit][data-1]);
                        System.out.print("Masukkan "+itemDsn[data-1]+" yang baru: ");
                    }else if(auditMenu==3){
                        System.out.println(itemMhs[data-1]+" saat ini: "+mhsData[nmEdit][data-1]);
                        System.out.print("Masukkan "+itemMhs[data-1]+" yang baru: ");
                    }
                    String newItem= scanner.nextLine();
                        if(auditMenu==1){
                            admData[nmEdit][data-1]= newItem;
                        }else if(auditMenu==2){
                            dsnData[nmEdit][data-1]= newItem;
                        }else if(auditMenu==3){
                            if(data==3){
                                if(Integer.valueOf(newItem)>14){
                                    System.out.println("Semester tidak valid.");
                                    continue;
                                }
                                smtSkrg[nmEdit]=Integer.valueOf(newItem);
                                mhsData[nmEdit][data]=newItem;
                                totalAlpa[nmEdit]=0;
                                totalKompen[nmEdit]=0;
                                for(int i=(alpa.length-2); i>smtSkrg[i];i--){
                                    alpa[nmEdit][i]=0;
                                    kompen[nmEdit][i]=0;
                                }
                                for(int i=0; i<(smtSkrg[nmEdit]+1); i++){
                                    for(int j=1; j<alpa[nmEdit].length; j++){
                                    totalAlpa[nmEdit]+= alpa[nmEdit][j];
                                    kompen[nmEdit][j] = alpa[nmEdit][j] * (2 * ((smtSkrg[nmEdit]+1) - j));
                                    totalKompen[nmEdit]+= kompen[nmEdit][j];
                                    }
                                }
                            } else{
                            mhsData[nmEdit][data-1]=newItem;
                            }
                        }
                        System.out.println("Item berhasil diedit!");
                        m12=false;
                        break;
                    }
                }
            }
        }
    
    private static void InputAlpa() {
        System.out.println("===== Input Alpa =====");
        System.out.println("Pilih nama mahasiswa yang akan anda input alpa:");
        for(int i=1; i<mhsData.length; i++){
            if(mhsData[i][0]==null){
                break;
            }
            System.out.println(i+". "+mhsData[i][0]);
        }
        System.out.println("\n0. Kembali");
        System.out.print("Masukkan pilihan anda: ");
        byte inputAlpa = scanner.nextByte();
            if(inputAlpa==0){
                return;
            }
            if(inputAlpa<=mhsData.length){
                boolean case1= true;
                while(case1){
                    System.out.println("\nSemester saat ini: "+smtSkrg[inputAlpa]);
                    System.out.print("Masukkan semester yang akan diinput alpa: ");
                    int smtEdit= scanner.nextInt();
                    if(smtEdit > Integer.valueOf(smtSkrg[inputAlpa])){
                        System.out.println("Semester tidak valid.");
                        continue;
                    }
                    System.out.println("Jumlah jam alpa semester "+smtEdit+" saat ini: "+alpa[inputAlpa][smtEdit]+" jam");
                    System.out.print("Masukkan jumlah jam alpa yang ingin ditambahkan: ");
                    int alpaPlus= scanner.nextInt();

                    alpa[inputAlpa][smtEdit]+=alpaPlus;
                    for(int j=1; j<alpa[inputAlpa].length; j++)
                    if(j!=smtEdit) continue;
                    else if(j==smtEdit){
                        totalAlpa[inputAlpa]+= alpa[inputAlpa][j];
                        kompen[inputAlpa][j] = alpa[inputAlpa][j] * (2 * ((smtSkrg[inputAlpa]+1) - j));
                        totalKompen[inputAlpa]+= kompen[inputAlpa][j];
                    }

                    System.out.println("\nAlpa berhasil ditambahkan!");
                    System.out.println("Jumlah jam alpa "+mhsData[inputAlpa][0]+" semester "+smtEdit+" saat ini adalah: "+ alpa[inputAlpa][smtEdit]+ " jam,");
                    System.out.println("dengan total jam kompen di semester "+smtEdit+" adalah: "+ kompen[inputAlpa][smtEdit]+" jam.");
                    case1= false;
                        break;
                    }
                    totalAlpa[inputAlpa]= 0;
                    totalKompen[inputAlpa]= 0;
                    for(int i=1; i<alpa[inputAlpa].length; i++){
                        totalAlpa[inputAlpa]+= alpa[inputAlpa][i];
                        totalKompen[inputAlpa]+= kompen[inputAlpa][i];
                    }
                        return;
                    }
                    else{
                        System.out.println("Kode yang anda pilih tidak valid.");
        }
    }

    private static void DataMahasiswa() {
        System.out.println("-----------------------------------");
        System.out.println("|========= Data Mahasiswa ========|");
        System.out.println("-----------------------------------");
    
        System.out.println("1. Tampilkan Mahasiswa Teknik Informatika");
        System.out.println("2. Tampilkan Mahasiswa Sistem Informasi Bisnis");
        System.out.println("99. Tambah Mahasiswa");
        System.out.println("0. Kembali");
        System.out.print("Masukkan pilihan anda: ");
        int pilihanProgram = scanner.nextInt();
    
        switch (pilihanProgram) {
            case 0:
                return;
            case 1:
                displayMahasiswaByProgram("Teknik Informatika");
                break;
            case 2:
                displayMahasiswaByProgram("Sistem Informasi Bisnis");
                break;
            case 99:
                // ... (remaining code for adding a new student)
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
    
    private static void displayMahasiswaByProgram(String program) {
        System.out.println("-----------------------------------");
        System.out.println("|========= Data Mahasiswa ========|");
        System.out.println("-----------------------------------");
    
        for (int i = 1; i < mhsData.length; i++) {
            if (mhsData[i][0] == null) {
                break;
            }
    
            // Add a condition to check if the program matches the chosen program
            if (program.equals(mhsData[i][5])) {
                System.out.println("Mahasiswa " + i + ":");
                System.out.println("Nama            : " + mhsData[i][0]);
                System.out.println("Kelas           : " + mhsData[i][1]);
                System.out.println("Semester        : " + mhsData[i][2]);
                System.out.println("NIM             : " + mhsData[i][3]);
                System.out.println("Jurusan         : " + mhsData[i][4]);
                System.out.println("Program Studi   : " + mhsData[i][5]);
                System.out.println("-----------------------------------");
            }
        }
    
        System.out.println();
        System.out.println("99. Tambah Mahasiswa");
        System.out.println("0. Kembali");
        System.out.print("Masukkan pilihan anda: ");
        int pilihmhs = scanner.nextInt();
    

        if (pilihmhs == 0) {
            return;
        } else if (pilihmhs == 99) {
            int kosong=0, usnKosong= 0;
            for(int i=1; i<mhs[0].length; i++){
                if(mhs[0][i]==null){
                        usnKosong=i;
                        break;
                }
            }
            scanner.nextLine();
            System.out.println("\n===== Input Mahasiswa Baru =====");
            System.out.print("Masukkan nama mahasiswa   : ");
            String mhsBaru = scanner.nextLine();
            System.out.print("Masukkan kelas            : ");
            String kelasBaru = scanner.nextLine();
            System.out.print("Masukkan NIM              : ");
            String nimBaru = scanner.nextLine();
            System.out.print("Masukkan semester         : ");
            String smtnew = scanner.nextLine();
            System.out.print("Masukkan jurusan          : ");
            String jurusannew = scanner.nextLine();
            System.out.print("Masukkan prodi            : ");
            String prodinew = scanner.nextLine();

            for(int i=1; i<mhsData.length-1; i++){
                if(mhsData[i][0]==null){
                    kosong=i;
                    break;
                }
            }
            mhsData[kosong][0]= mhsBaru;
            mhsData[kosong][1]= kelasBaru;
            smtSkrg[kosong]= Integer.valueOf(smtnew);
            mhsData[kosong][2] = String.valueOf(smtSkrg[kosong]);
            mhsData[kosong][3]= nimBaru;
            mhs[0][usnKosong]=nimBaru;
            mhs[1][usnKosong]=nimBaru;
            mhsData[kosong][4]= jurusannew;
            mhsData[kosong][5]= prodinew;


            System.out.println("Mahasiswa baru berhasil ditambahkan!");
            return;
        }
    }

    private static void ManageKeamanan() {
        while(true){
        System.out.println("-------------------------------");
        System.out.println("|======= Manage Keamanan =====|");
        System.out.println("-------------------------------");
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
            return;
        }
        System.out.println("-------------------------------");
        System.out.println("|======= Manage Keamanan =====|");
        System.out.println("-------------------------------");
        System.out.println("Pilih akun: ");
        if(aman==1){
            for(int i=0; i<adm[0].length; i++){
                System.out.println((i+1)+". "+adm[0][i]);
            }
        } else if(aman==2){
            for(int i=0; i<dsn[0].length; i++){
                System.out.println((i+1)+". "+dsn[0][i]);
            }
        } else if(aman==3){
            for(int i=0; i<mhs[0].length; i++){
                System.out.println((i+1)+". "+mhs[0][i]);
            }
        }
        System.out.println("\n0. Kembali");
        System.out.print("Masukkan pilihan anda: ");
        int editAcc= scanner.nextInt();
        if(editAcc==0){
            return;
        }
        if(aman==1) {acc[0]=adm[0][editAcc-1]; acc[1]= adm[1][editAcc-1];}
        else if(aman==2) {acc[0]=dsn[0][editAcc-1]; acc[1]= dsn[1][editAcc-1];}
        else if(aman==3) {acc[0]=mhs[0][editAcc-1]; acc[1]= mhs[1][editAcc-1];}

        System.out.println("\n===== Manage Keamanan =====");
        System.out.println("1. Ubah Username");
        System.out.println("2. Ubah Password");
        System.out.println("\n0. Kembali");
        System.out.print("Masukkan pilihan anda: ");
        int editCre= scanner.nextInt();
        if(editCre==0){
            return;
        }
        if(editCre>3){
            System.out.println("Pilihan anda tidak valid.");
            return;
        }
        boolean verif=true;
        scanner.nextLine();
        while(verif){
            System.out.print("\nMasukkan Password anda: ");
            String ver= scanner.nextLine();
            if(ver.equals(adm[1][in-1])){
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
                        adm[editCre-1][editAcc-1]=newUsn;
                    } else if(aman==2){
                        dsn[editCre-1][editAcc-1]=newUsn;
                    } else if(aman==3){
                        mhs[editCre-1][editAcc-1]=newUsn;
                    }
                System.out.println(usnPw[editCre-1]+" "+acc[0]+" berhasil diubah!");
                edit=false;
                break;
                }
            }
        }
    }

    private static void Helpadmin() {
        System.out.println("Tata cara penggunaan Fitur-Fitur Kompen Mahasiswa :\r\n" + //
                "\r\n" + //
                "1. Input Alpa :\r\n" + //
                "-Masuk ke menu \"Input Alpa\" \r\n" + //
                "-Pilih Nama mahasiswa yang ingin di input alpa\r\n" + //
                "-Masukkan Semester yang ingin diinput alpa, sesuai dengan batas dari semester yang ditempuh\r\n" + //
                "-Masukkan jumlah jam alpa yang ingin ditambahkan\r\n" + //
                "-Alpa berhasil ditambahkan dengan total kompen yang telah ditambah\r\n" + //
                "\r\n" + //
                "2. Data Mahasiswa :\r\n" + //
                "-Masuk ke menu \"data mahasiswa\"\r\n" + //
                "-Kemudian akan muncul semua data-data mahasiswa\r\n" + //
                "\r\n" + //
                "3. Manage Keamanan : \r\n" + //
                "-Masuk ke menu \"Manage Kemanan\" \r\n" + //
                "-Setelah masuk, terdapat pilihan 3 akun yang terdiri dari admin, dosen dan mahasiswa\r\n" + //
                "-setelah memilih salah satu dari pilihan akun tersebut, akan muncul kembali 3 akun dari salah satu akun tersebut, pilih salah satu.\r\n" + //
                "-Kemudian pilih ubah username atau password yang ingin dirubah\r\n" + //
                "-jika telah berhasil, maka lakukan LogIn ulang");
                Pilihan();
    }
    private static void Helpdosen() {
        System.out.println("Tata cara penggunaan Fitur-Fitur Kompen Mahasiswa : \r\n"+ //
                "1. Input Tugas :\r\n" + //
                "-Masuk ke menu \"Input Tugas\"\r\n" + //
                "-Setelah itu pilih salah satu dari 5 tugas, atau bisa menambahkan tugas.\r\n" + //
                "-Saat memilih tugas akan muncul detail dari tugas tersebut, seperti nama tugas, pemberi tugas, jumlah kompen, kuota dan tanggal.\r\n" + //
                "-Selain itu juga tugas tersebut bisa di edit dan dihapus.\r\n" + //
                "\r\n" + //
                "2. Kemanan :\r\n" + //
                "-Masuk menu \"Keamanan\"\r\n" + //
                "-pilih salah satu dari \"ubah username\" atau \"ubah password\"\r\n" + //
                "-Ubah salah satu dari keamanan tersebut\r\n" + //
                "-setelah dirubah maka lakukan LogIn ulang untuk masuk ke akun dengan kemanan yang anda ubah tadi\r\n" + //
                "");
                Pilihan();
    }
    private static void Helpmahasiswa() {
        System.out.println("Tata cara penggunaan Fitur-Fitur Kompen Mahasiswa :\r\n" + //
                "1. Alpaku :\r\n" + //
                "-Masuk ke menu \"Alpaku\"\r\n" + //
                "-Kemudian pilih semester yang ingin dilihat kompennya atau bisa pilih rekap tugas kompen\r\n" + //
                "-maka otomatis akan terlihat jumlah jam alpa semester serta total jam tugas kompen per-Semester\r\n" + //
                "\r\n" + //
                "2. Tugas Tersedia :\r\n" + //
                "-Masuk ke menu \"Tugas Tersedia\"\r\n" + //
                "-pilih tugas dari 5 tugas tersebut\r\n" + //
                "-setelah memilih tugas, tugas bisa dikerjakan\r\n" + //
                "\r\n" + //
                "3. History Tugas :\r\n" + //
                "-Masuk ke menu \"History Tugas\"\r\n" + //
                "-pada menu ini lakukan pengerjakan tugas pada menu \"Tugas Tersedia\" untuk bisa melihat tugas mana saja yang sudah dikerjakan.");
                Pilihan();
        }
    private static void InputTugas() {
        for (int i = 0; i < tugas.length; i++) {
            if (tugas[i][3] != null && Integer.parseInt(tugas[i][3]) <= 0) {
                for (int k = i; k < tugas.length - 1; k++) {
                    tugas[k] = tugas[k + 1];
                }
                tugas[tugas.length - 1] = new String[7];
                i--;
            }
        }    

        for (int i = 1; i < tugas.length; i++) {
          if (tugas[i][0] != null){
              continue;
          } else if(tugas[i][0]==null){
              tersedia=i;
              break;
          }
        }
        System.out.println(tersedia);

        boolean list= true;
        while (list) {
                    System.out.println("-------------------------------");
                    System.out.println("|======== Input Tugas ========|");
                    System.out.println("-------------------------------");
                    System.out.println("List tugas:");
                    for (int i = 1; i < tugas.length; i++) {
                        if (tugas[i][0] != null) {
                            System.out.println(i + ". " + tugas[i][0]);
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
                        System.out.println("\n===== Input Tugas =====");
                        System.out.print("Masukkan nama tugas: ");
                        String tugasBaru = scanner.nextLine();
                        tugas[tersedia][0]=tugasBaru;
                        tugas[tersedia][1]= dsnData[in][0];
                        System.out.print("Masukkan jumlah kompen (jam): ");
                        int jamnew= scanner.nextInt();
                        tugas[tersedia][2]= String.valueOf(jamnew);
                        System.out.print("Masukkan jumlah kuota (mhs): ");
                        int mhsnew= scanner.nextInt();
                        tugas[tersedia][3]= String.valueOf(mhsnew);
                        boolean tanggal= true;
                        while(tanggal){
                            int tglNew, blnNew, thnNew;
                        System.out.println("\nMasukkan tanggal post: ");
                        System.out.print("Tanggal (DD): ");
                        tglNew= scanner.nextInt();
                        System.out.print("Bulan (MM): ");
                        blnNew= scanner.nextInt();
                        System.out.print("Tahun (YYYY): ");
                        thnNew= scanner.nextInt();
                        if(thnNew<2000 || blnNew>12 || blnNew<1 || tglNew>31 || tglNew<1){
                            System.out.println("Tanggal tidak valid.");
                            continue;
                        } else{
                            tugas[tersedia][4]= String.valueOf(tglNew);
                            tugas[tersedia][5]= String.valueOf(blnNew);
                            tugas[tersedia][6]= String.valueOf(thnNew);
                            break;
                        }
                    }
                        
                        for (int i = 1; i < tugas.length; i++) {
                          if (tugas[i][0] != null){
                              continue;
                          } else if(tugas[i][0]==null){
                              tersedia=i;
                              break;
                          }
                        }
                        
                        System.out.println("Tugas berhasil ditambahkan!");
                    } else if(pilih1<tersedia){
                        boolean menu1 = true;
                        while (menu1) {
                            System.out.println("-------------------------------");
                            System.out.println("|======= Detail Tugas ========|");
                            System.out.println("-------------------------------");
                            System.out.println("Nama Tugas      : " + tugas[pilih1][0]);
                            System.out.println("Pemberi Tugas   : " + tugas[pilih1][1]);
                            System.out.println("Jumlah Kompen   : " + tugas[pilih1][2] + " jam");
                            System.out.println("Kuota           : " + tugas[pilih1][3] + " mhs");
                            System.out.println("Tanggal         : " + tugas[pilih1][4]+"/"+tugas[pilih1][5]+"/"+tugas[pilih1][6]);
                            System.out.println();
                            System.out.println("1. Edit");
                            System.out.println("2. Hapus");
                            System.out.println("0. Kembali");
                            System.out.print("Masukkan pilihan anda: ");
                            int pilih2 = scanner.nextInt();
        
                            if (pilih2 == 1) {
                                boolean edit = true;
                                while (edit) {
                                    System.out.println("\n===== Mau edit apa? =====");
                                    System.out.println("1. Nama Tugas");
                                    System.out.println("2. Pemberi Tugas");
                                    System.out.println("3. Jumlah Kompen");
                                    System.out.println("4. Kuota");
                                    System.out.println("0. Kembali");
                                    System.out.print("Masukkan Pilihan anda: ");
                                    int pilih3 = scanner.nextInt();
                                    if (pilih3 == 1) {
                                        scanner.nextLine();
                                        System.out.print("Masukkan nama tugas baru: ");
                                        String nmBaru = scanner.nextLine();
                                        tugas[pilih1][0] = nmBaru;
                                        System.out.println("Item berhasil diedit!");
                                        edit = false;
                                    } else if (pilih3 == 2) {
                                        scanner.nextLine();
                                        System.out.print("Masukkan nama pemberi tugas baru: ");
                                        String pmbriBaru = scanner.nextLine();
                                        tugas[pilih1][1] = pmbriBaru;
                                        System.out.println("Item berhasil diedit!");
                                        edit = false;
                                    } else if (pilih3 == 3) {
                                        System.out.print("Masukkan jumlah kompen baru: ");
                                        int jmlBaru = scanner.nextInt();
                                        tugas[pilih1][2] = String.valueOf(jmlBaru);
                                        System.out.println("Item berhasil diedit!");
                                        edit = false;
                                    } else if (pilih3 == 4) {
                                        System.out.print("Masukkan jumlah kuota baru: ");
                                        int kuotaBaru = scanner.nextInt();
                                        tugas[pilih1][3] = String.valueOf(kuotaBaru);
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
                                        tugas[pilih1][0]=null;
                                        tugas[pilih1][1]=null;
                                        tugas[pilih1][2]=null;
                                        tugas[pilih1][3]=null;
                                        tugas[pilih1][4]=null;
                                        tugas[pilih1][5]=null;
                                        tugas[pilih1][6]=null;
                                        for (int i = pilih1; i < tugas.length - 1; i++) {
                                            tugas[i] = tugas[i + 1];
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
    }

    private static void Keamanan(String toChange) {
        while(true){
            System.out.println("-------------------------------");
            System.out.println("|========= Keamanan ==========|");
            System.out.println("-------------------------------");
            System.out.println("1. Ubah Username");
            System.out.println("2. Ubah Password");
            System.out.println("0. Kembali");
            System.out.print("Masukkan pilihan anda: ");
            int aman = scanner.nextInt();
            String usnPw[] = {"Username", "Password"};
        
            if (aman == 0) {
                return;
            }
            boolean verif = true;
            scanner.nextLine();
            while (verif) {
                System.out.print("\nMasukkan Password anda saat ini: ");
                String ver = scanner.nextLine();
                switch (toChange) {
                    case "Dosen":
                        if(ver.equals(dsn[1][in-1])){
                            verif=false;
                        }
                    break;
                    case "Mahasiswa":
                        if (ver.equals(mhs[1][in - 1])) {
                            verif = false;
                        }
                    break;
                    default:
                    System.out.println("Password yang anda masukkan salah.");
                        continue;
            }
        }
        
            boolean edit = true;
            while (edit) {
                System.out.print("Masukkan " + usnPw[aman - 1] + " baru: ");
                String newUsn = scanner.nextLine();
                if(toChange.equals("Dosen")){
                    if(newUsn.equals(dsn[aman - 1][in - 1])){
                        System.out.println(usnPw[aman - 1] + " baru tidak boleh sama.");
                        continue;
                    }
                } else if(toChange.equals("Mahasiswa")){
                    if (newUsn.equals(mhs[aman - 1][in - 1])) {
                        System.out.println(usnPw[aman - 1] + " baru tidak boleh sama.");
                        continue;
                    }
                }
                    if (toChange.equals("Mahasiswa")) {
                        mhs[aman - 1][in - 1] = newUsn;
                    } else if(toChange.equals("Dosen")) {
                        dsn[aman - 1][in - 1] = newUsn;
                    }
                    System.out.println(usnPw[aman - 1] + " berhasil diubah!");
                    edit = false;
                    break;
            }
            return;
        }
    }


    private static void ContactAdmin() {
        System.out.println("-----------------------------------");
        System.out.println("|========= Contact Admin =========|");
        System.out.println("-----------------------------------");
        System.out.println("| Salsabila Mahda  | 081918242172 |");
        System.out.println("| Rocky Alessandro | 081918242172 |");
        System.out.println("| Erik Ridho       | 081918242172 |");
        System.out.println("-----------------------------------");
        Pilihan();
    }

    private static void Alpaku() {
        byte subChoice2;
        boolean alpaku=true;
        int rekap= smtSkrg[in]+1;
        while(alpaku){
            System.out.println("-------------------------------");
            System.out.println("|=========== Alpaku ==========|");
            System.out.println("-------------------------------");
            for(int i=1; i<=smtSkrg[in]; i++){
                System.out.println(i+". "+"Semester "+i);
            }
            System.out.println(rekap+". Rekap Tugas Kompen");
            System.out.println("0. Kembali");
            System.out.print("Masukkan pilihan anda: ");
            subChoice2 = scanner.nextByte();
                if(0<subChoice2 && subChoice2<smtSkrg[in]+1){
                    System.out.println("\n=== Alpaku - Semester "+subChoice2+" ===");
                    System.out.println("Jumlah Alpa Semester "+subChoice2+": " + alpa[in][subChoice2] + " jam");
                    System.out.println("Total jam tugas kompen Semester "+subChoice2+": " + kompen[in][subChoice2] + " jam");
                    Pilihan();
                    }else if(subChoice2==rekap){
                        System.out.println("\n=== Alpaku - Rekap Tugas Kompen ===");
                        System.out.println("Total jam alpa anda     : " + totalAlpa[in] + " jam");
                        System.out.println("Total jam kompen anda   : " + totalKompen[in] + " jam");
                        Pilihan();
                    }else if(subChoice2==0){
                        alpaku= false;
                        break;
                    } else{
                        System.out.println("Kode yang anda pilih tidak valid.");
                        break;
                    }
        }
    }

    private static void TugasTersedia() {
        for (int i = 0; i < tugas.length; i++) {
            if (tugas[i][3] != null && Integer.parseInt(tugas[i][3]) <= 0) {
                for (int k = i; k < tugas.length - 1; k++) {
                    tugas[k] = tugas[k + 1];
                }
                tugas[tugas.length - 1] = new String[10];
                i--;
            }
        }    
        for (int i = 1; i < tugas.length; i++) {
            if (tugas[i][0] == null) {
                tersedia = i;
                break;
            }
        }
    
        boolean tgs = true;
        while (tgs) {
            System.out.println("-------------------------------");
            System.out.println("|====== Tugas Tersedia =======|");
            System.out.println("-------------------------------");
            int j = 1;
            for (int i = 1; i < tugas.length; i++) {
                if (tugas[i][0] != null && Integer.valueOf(tugas[i][3]) > 0) {
                    System.out.println(j + ". " + tugas[i][0]);
                    j++;
                }
            }
    
            System.out.println();
            System.out.println("0. Kembali");
            System.out.print("Pilih tugas: ");
            int pilih1 = scanner.nextInt();
            
            if (pilih1 == 0) {
                break;
            } else if (pilih1 > tersedia || pilih1 >= tugas.length || tugas[pilih1][0] == null) {
                System.out.println("Pilihan tidak valid.");
            } else {
                boolean menu1 = true;
                while (menu1) {
                    System.out.println("-------------------------------");
                    System.out.println("|======= Detail Tugas ========|");
                    System.out.println("-------------------------------");
                    System.out.println("Nama Tugas      : " + tugas[pilih1][0]);
                    System.out.println("Pemberi Tugas   : " + tugas[pilih1][1]);
                    System.out.println("Jumlah Kompen   : " + tugas[pilih1][2] + " jam");
                    System.out.println("Kuota           : " + tugas[pilih1][3] + " mhs");
                    System.out.println("Tanggal         : " + tugas[pilih1][4] + "/" + tugas[pilih1][5] + "/" + tugas[pilih1][6]);
                    System.out.println();
                    System.out.println("1. Kerjakan");
                    System.out.println("0. Kembali");
                    System.out.print("Masukkan pilihan anda: ");
                    int subChoice3 = scanner.nextInt();
                    switch (subChoice3) {
                        case 0:
                            menu1 = false;
                            break;
                        case 1:
                        if(Integer.valueOf(tugas[pilih1][2])>totalKompen[in]){
                            System.out.println("Jumlah kompen tugas yang dipilih melebihi jam kompen anda.");
                            System.out.println("Silakan kerjakan tugas lainnya.");
                            menu1= false;
                            break;
                        }
                            int tglAsk, blnAsk, thnAsk;
                            while (true){
                                System.out.println("\nMasukkan tanggal pengerjaan: ");
                                System.out.print("Tanggal (DD): ");
                                tglAsk = scanner.nextInt();
                                System.out.print("Bulan (MM): ");
                                blnAsk = scanner.nextInt();
                                System.out.print("Tahun (YYYY): ");
                                thnAsk = scanner.nextInt();
                                if(tglAsk>31 || blnAsk>12 || thnAsk<2000){
                                    System.out.println("Masukan tanggal tidak valid. Silakan coba lagi");
                                    continue;
                                }
                                else{
                                    break;
                                }
                            }
                            AddReq(tugas[pilih1], tglAsk, blnAsk, thnAsk, in);
                            tugas[pilih1][3] = String.valueOf(Integer.parseInt(tugas[pilih1][3]) - 1);
                            if(Integer.valueOf(tugas[pilih1][3])<=0){
                                for(int o=0; o<tugas[pilih1].length;o++){
                                    tugas[pilih1][0]=null;
                                }
                                for(int x=pilih1; x<tugas.length-1;x++){
                                    tugas[x]=tugas[x+1];
                                }
                            }
                            System.out.println("Selamat mengerjakan tugas anda! ^^");
                            System.out.println("Jam kompen anda akan dikurangi setelah tugas selesai.");
                            menu1 = false;
                            break;
                        default:
                            System.out.println("Kode yang anda pilih tidak valid.");
                            break;
                    }
                }
            }
        }
    }
    
    private static void HistoryTugas() {
            System.out.println("\n-------------------------------");
            System.out.println("|====== History Tugas ========|");
            System.out.println("-------------------------------");
            boolean ada= false;
            for(int i=1; i<tugasDone[in].length; i++){
                if(tugasDone[in][i][0]==null){
                    continue;
                } else if(tugasDone[in][i][0]!=null){
                    ada=true;
                } 
                } if(!ada){
                    System.out.println("Belum ada tugas kompen yang dikerjakan.");
                    System.out.println("Buka menu Tugas Tersedia untuk melihat tugas kompen yang dapat dikerjakan.");
                } else if(ada){
                    for(int i=1; i<tugasDone[in].length; i++){
                        if(tugasDone[in][i][0]!=null){
                            System.out.println(+i+". "+tugasDone[in][i][0]);
                            System.out.println("Pemberi Tugas       : "+tugasDone[in][i][1]);
                            System.out.println("Jumlah Kompen       : "+tugasDone[in][i][2]+" jam");
                            System.out.println("Tanggal Pengerjaan  : "+tugasDone[in][i][3]+"/"+tugasDone[in][i][4]+"/"+tugasDone[in][i][5]);
                            System.out.println("Tanggal Selesai     : "+tugasDone[in][i][6]+"/"+tugasDone[in][i][7]+"/"+tugasDone[in][i][8]);
                            if(tugasDone[in][i+1][1]!=null){
                                System.out.println();
                            }
                        } else{
                            break;
                        }
                    }
                }
                Pilihan();
    }

    private static void Peraturan() {
        System.out.println("----------------------------------------");
        System.out.println("|= Peraturan Sistem Kompen Mahasiswa = |");
        System.out.println("----------------------------------------");
        System.out.println("1. Kompensasi tidak menghapuskan jumlah ketidakhadiran");
        System.out.println("2. Kompensasi tidak boleh digantikan dalam bentuk uang atau barang ");
        System.out.println("3. Besarnya kompensasi ditentukan berdasarkan jumlah jam alpa dikalikan dua");
        System.out.println("4. Kompensasi dilaksanakan setelah jam pelajaran resmi berakhir atau apa saat liburan.");
        System.out.println("5. Bilamana kompensasi tidak dilaksanakan pada semester yang sama");
        System.out.println("maka jumlah kompensasi dikalikan dua pada semester berikutnya dan demikian seterusnya. ");
        Pilihan();
    }

    private static void Pilihan() {
        System.out.println("\n0. Kembali");
        System.out.println("1. Keluar");
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = scanner.nextByte();
        switch (pilihan) {
                case 0:
                break;
                case 1:
                    System.out.println("Terima kasih telah bertanggung jawab atas tugas kompen anda ^^");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Kode yang anda pilih tidak valid.");
            }
    }

    private static void ReqTugas(int dsnIn){
        while(true){
        System.out.println("\n=== Request Pengerjaan Tugas ===");
        int j=1, batasReq=0;
        boolean noReq= false;
        for(int i=0; i<listReq[dsnIn].length; i++){
            if(listReq[dsnIn][i][0]!= null){
                noReq=false;
                batasReq=i;
                break;
            } else{
                noReq= true;
            }
        }
        if (!noReq) {
            for (int i = 0; i < listReq[dsnIn].length; i++) {
                if (listReq[dsnIn][i][0] == null || listReq[dsnIn][i][0].equals(listReq[dsnIn][i-1][0])) {
                    continue;
                } else {
                    System.out.println(j + ". " + listReq[dsnIn][i][0]);
                    j++;
                }
            }
        } else if(noReq){
            System.out.println("Maaf, belum ada mahasiswa yang mengajukan pengerjaan tugas anda.");
        }
        System.out.println("\n0. Kembali");
        System.out.print("Masukkan pilihan anda: ");
        int pilReq= scanner.nextInt();

        if(pilReq==0){
            return;
        } else if(pilReq<=batasReq){
            boolean inList=true;
            int batasList=0;
            while(inList){
            System.out.println("\n=== List Pengajuan Tugas "+listReq[dsnIn][pilReq][0]+" ===");
            for(int i=0; i<listReq[dsnIn][i].length-1; i++){
                if(listReq[dsnIn][i][0]!= null && listReq[dsnIn][i][0].equals(listReq[dsnIn][i][0])){
                    System.out.println(i+". "+listReq[dsnIn][i][6]);
                    batasList+=i;
                }
            }
            System.out.println("\n0. Kembali");
            System.out.print("Masukkan pilihan anda: ");
            int editReq= scanner.nextInt();

            if(editReq==0){
                return;
            }else if(editReq>batasList){
                System.out.println("Masukan anda tidak valid.");
                continue;
            } else if(editReq<=batasList){
                String[] data = {"Nama", "Kelas", "NIM", "Semester", "Jurusan", "Prodi", "Judul Tugas", "Jumlah Kompen", "Tanggal Pengajuan"};
                System.out.println("=== " + listReq[dsnIn][editReq][6] + " ===");
                
                for (int i = 0; i < data.length; i++) {
                    String label = String.format("%-20s", data[i]);
                    if (i < 8) {
                        System.out.print(label + ": " + listReq[dsnIn][editReq][i]);
                        if(i==7){
                            System.out.print(" jam");
                        }
                        System.out.println();
                    } else if (i == 8) {
                        System.out.print(label + ": ");
                        
                        for (int x = 8; x < listReq[dsnIn][editReq].length; x++) {
                            if (x < listReq[dsnIn][editReq].length) {
                                System.out.print(listReq[dsnIn][editReq][x]);
                                if (x < 10) {
                                    System.out.print("/");
                                }
                            } else {
                                break;
                            }
                        }
                        System.out.println();
                    } else if(i<9){
                    System.out.println(label + ": " + listReq[dsnIn][editReq][i]);
                    }else if(i>data.length){
                        break;
                    }
                }
                                
             System.out.println("\n1. Tandai selesai");
             System.out.println("0. Kembali");
             System.out.print("Masukkan pilihan anda: ");
             int ReqAct= scanner.nextInt();

             if(ReqAct==0){
                return;
             } else if(ReqAct==1){
                 int mhsBaik=0;
                 for(int i=1; i<mhsData.length; i++){
                     if (listReq[dsnIn][editReq][0].equals(mhsData[i][0])){
                         mhsBaik=i;
                         break;
                        }
                    }
                 for(int i=1; i<tugasDone[mhsBaik].length-1; i++){
                    if(tugasDone[mhsBaik][i][0]!=null){
                        continue;
                    }else if(tugasDone[mhsBaik][i][0]==null){
                        int tgl[]= new int[3];
                        tugasDone[mhsBaik][i][0]= listReq[dsnIn][editReq][6];
                        tugasDone[mhsBaik][i][1]= dsnData[dsnIn][0];
                        tugasDone[mhsBaik][i][2]= listReq[dsnIn][editReq][7];
                        tugasDone[mhsBaik][i][3]= listReq[dsnIn][editReq][8];
                        tugasDone[mhsBaik][i][4]= listReq[dsnIn][editReq][9];
                        tugasDone[mhsBaik][i][5]= listReq[dsnIn][editReq][10];
                        while(true){
                            System.out.println("\nMasukkan tanggal tugas selesai: ");
                            System.out.print("Tanggal (DD): ");
                            tgl[0]= scanner.nextInt();
                            System.out.print("Bulan (MM): ");
                            tgl[1]= scanner.nextInt();
                            System.out.print("Tahun (YYYY): ");
                            tgl[2]= scanner.nextInt();
                                if(tgl[0]>31 || tgl[1]>12 || tgl[2]<2000){
                                    System.out.println("Masukan tanggal tidak valid. Silakan coba lagi");
                                    continue;
                                } else{
                                    break;
                                }
                        }
                        tugasDone[mhsBaik][i][6]= String.valueOf(tgl[0]);
                        tugasDone[mhsBaik][i][7]= String.valueOf(tgl[1]);
                        tugasDone[mhsBaik][i][8]= String.valueOf(tgl[2]);
                        System.out.println("Tugas berhasil ditandai selesai!");
                        int tugasKompen = Integer.parseInt(listReq[dsnIn][editReq][7]);
                        if (totalKompen[mhsBaik] <= tugasKompen) {
                            totalKompen[mhsBaik] = 0;
                        } else {
                            totalKompen[mhsBaik] -= tugasKompen;
                        }
                        int minus = Integer.parseInt(listReq[dsnIn][editReq][7]);
                        for (int k = kompen[mhsBaik].length-1; k>=1; k--) {
                            int temp= kompen[mhsBaik][k];
                            if (kompen[mhsBaik][k] > 0 ){
                                if(kompen[mhsBaik][k]<=minus){
                                    kompen[mhsBaik][k]=0;
                                } else{
                                    kompen[mhsBaik][k]= kompen[mhsBaik][k]-minus;
                                }
                                minus= minus-temp;
                            } else if (kompen[mhsBaik][k] == Integer.parseInt(listReq[dsnIn][editReq][7])) {
                                kompen[mhsBaik][k] =0;
                                minus= minus-temp;
                                break;
                            }
                            if(minus<=0){
                                break;
                            }
                        }                            
                        for (int d = 0; d < listReq[dsnIn][editReq].length - 1; d++) {
                                listReq[dsnIn][editReq][d] = listReq[dsnIn][editReq+1][d];
                                listReq[dsnIn][editReq+1][d] = null;
                            }
                            for(int c=listReq[dsnIn].length-1; c>editReq; c--){
                                for(int z= 0;z<listReq[dsnIn][c].length; z++){
                                        listReq[dsnIn][c][z]=null;
                                }
                            }
                    }
                    return;
                }
            }
        }
    }
        } else if(pilReq>batasReq){
            System.out.println("Masukan anda tidak valid.");
            continue;
        }
        break;
    }
    return;
    }

    private static void AddReq(String[] infoTugas, int tglReq, int blnReq, int thnReq, int mhsIn){
        int kosong=0, dosenTgs=0;
        for(int i=1; i<dsnData.length; i++){
            if(infoTugas[1].equals(dsnData[i][0])){
                dosenTgs=i;
        }
    }
            for(int i=1; i<listReq[dosenTgs].length;i++){
                if(listReq[dosenTgs][i][0]!=null){
                    continue;
                } else if(listReq[dosenTgs][i][0]==null){
                    kosong= i;
                    break;
                }
            }
            listReq[dosenTgs][kosong][0]= mhsData[mhsIn][0];
            listReq[dosenTgs][kosong][1]= mhsData[mhsIn][1];
            listReq[dosenTgs][kosong][2]= mhsData[mhsIn][3];
            listReq[dosenTgs][kosong][3]= mhsData[mhsIn][2];
            listReq[dosenTgs][kosong][4]= mhsData[mhsIn][4];
            listReq[dosenTgs][kosong][5]= mhsData[mhsIn][5];
            listReq[dosenTgs][kosong][6]= infoTugas[0];
            listReq[dosenTgs][kosong][7]= infoTugas[2];
            listReq[dosenTgs][kosong][8]= String.valueOf(tglReq);
            listReq[dosenTgs][kosong][9]= String.valueOf(blnReq);
            listReq[dosenTgs][kosong][10]= String.valueOf(thnReq);
    }
}