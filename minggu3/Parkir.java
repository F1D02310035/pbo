import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa kali Anda parkir menggunakan sepeda? ");
        int parkirSepeda = scanner.nextInt();

        System.out.print("Berapa kali Anda parkir menggunakan motor? ");
        int parkirMotor = scanner.nextInt();

        System.out.print("Berapa kali Anda parkir menggunakan mobil? ");
        int parkirMobil = scanner.nextInt();

        int totalHariParkir = parkirSepeda + parkirMotor + parkirMobil;
        System.out.println("Jadi total hari Anda parkir minggu ini adalah " + totalHariParkir + "hari");

        int biayaSepeda = parkirSepeda * 1000;
        int biayaMotor = parkirMotor * 2000;
        int biayaMobil = parkirMobil * 5000;
        int totalBiaya = biayaSepeda + biayaMotor + biayaMobil;

        System.out.println("Total perhitungan:");
        System.out.println("(" + parkirSepeda + " * 1000) + (" + parkirMotor + " * 2000) + (" + parkirMobil + " * 5000) = " + totalBiaya);

        System.out.println("Sehingga total biaya parkir yang harus Anda bayar sebesar " + totalBiaya);

        scanner.close();
    }
}

