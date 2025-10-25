import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<KendaraanListrik> kendaraanList = new ArrayList<>();

        kendaraanList.add(new MobilListrik("Mobil Listrik", 80, 20, 10));
        kendaraanList.add(new MotorListrik("Motor Listrik", 30, 10, 5));
        kendaraanList.add(new MobilListrik("Mobil Listrik", 60, 45, 12));
        kendaraanList.add(new MotorListrik("Motor Listrik", 25, 20, 4));

        double totalWaktu = 0;
        double totalEnergi = 0;
        for (KendaraanListrik k : kendaraanList) {
            double waktu = k.hitungWaktuPengisian();
            double energi = k.hitungEnergiDibutuhkan();
            System.out.println(k.getNama() + " => waktu : " + waktu + " jam, energi : " + energi + " kWh");
            totalWaktu += waktu;
            totalEnergi += energi;
        }
        System.out.println("Total waktu pengisian seluruh kendaraan: " + totalWaktu + " jam");
        System.out.println("Total energi dibutuhkan: " + totalEnergi + " kWh");
    }
}
