
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : program yang mendefinisikan kepribadian seseorang melalui warna  
 */
public class WarnaKepribadian {

    //ANSII warna java
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BGRED = "\u001B[41m";
    public static final String BGGREEN = "\u001B[42m";
    public static final String BGYELLOW = "\u001B[43m";
    public static final String BGBLUE = "\u001B[44m";
    public static final String BGMAGENTA = "\u001B[45m";

    //Kepribadian warna merah
    public static void ColRed() {
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
        System.out.println("4. Menyukai tantangan");
        System.out.println("5. Kurang sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahnnya akan sulit dikontrol,");
        System.out.println("7. Memiliki energi kehangatan dan cinta.");
    }
    
    //Kepribadian warna hijau
    public static void ColGreen() {
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Teguh pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri,");
        System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
    }
    
    //Kepribadian warna kuning
    public static void ColYellow() {
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
        System.out.println("10. Cenderung penakut.");
    }
    
    //Kepribadian warna biru
    public static void ColBlue() {
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
    }

    //Kepribadian warna ungu
    public static void ColPurple() {
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu, ");
        System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
    }

    public static void main(String[] args) {
        //Variabel Local
        String  pilihan, warnaPribadi, nama, Nama;
        
        //tampilan warna
        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW + "KEPRIBADIANMU " + CYAN + "DARI " + PURPLE + "WARNA " + BLUE + "FAVORITMU");
        System.out.println(BGRED + WHITE + "           MERAH           ");
        System.out.println(BGGREEN + WHITE + "           HIJAU           ");
        System.out.println(BGYELLOW + WHITE + "           KUNING          ");
        System.out.println(BGBLUE + WHITE + "           BIRU            ");
        System.out.println(BGMAGENTA + WHITE + "           UNGU            ");
        
        //input
        Scanner masuk = new Scanner(System.in);

        System.out.print(RESET + "\nPILIH WARNA FAVORITMU : " + RESET);
        pilihan = masuk.nextLine();
        warnaPribadi = pilihan.toUpperCase();

        System.out.print("NAMA KAMU: " + RESET);
        nama = masuk.nextLine();
        Nama = nama.toUpperCase();
        
        //output
        System.out.println("\n===HASIL TEST KEPRIBADIAN " + Nama + "===");
        switch (warnaPribadi) {
            case "MERAH":
                System.out.println(RESET + "Warna Favoritmu adalah : " + RED + warnaPribadi);
                ColRed();
                break;

            case "HIJAU":
                System.out.println("Warna Favoritmu adalah : " + GREEN + warnaPribadi);
                ColGreen();
                break;

            case "KUNING":
                System.out.println("Warna Favoritmu adalah : " + YELLOW + warnaPribadi);
                ColYellow();
                break;

            case "BIRU":
                System.out.println("Warna Favoritmu adalah : " + BLUE + warnaPribadi);
                ColBlue();
                break;

            case "UNGU":
                System.out.println("Warna Favoritmu adalah : " + PURPLE + warnaPribadi);
                ColPurple();
                break;
            default:
                System.out.println("Oops.. Belum teridentifikasi");
                break;
        }

    }

}
