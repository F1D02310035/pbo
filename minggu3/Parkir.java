import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa hari total Anda parkir dalam minggu ini? ");
        int totalHari = scanner.nextInt();
        scanner.nextLine(); 

        int hariSepeda = 0;
        int hariMotor = 0;
        int hariMobil = 0;

        for (int i = 1; i <= totalHari; i++) { //for dipake pas iterasinya udah pasti
            boolean valid = false;
            while (!valid) {
                System.out.print("Hari " + i + ", jenis kendaraan Anda (sepeda/motor/mobil): ");
                String kendaraan = scanner.nextLine().toLowerCase();

                if (!kendaraan.equals("sepeda") && !kendaraan.equals("motor") && !kendaraan.equals("mobil")) {
                    System.out.println("Input invalid!");
                } else {
                    if (kendaraan.equals("sepeda")) {
                        hariSepeda++;
                    } else if (kendaraan.equals("motor")) {
                        hariMotor++;
                    } else if (kendaraan.equals("mobil")) {
                        hariMobil++;
                    }
                    valid = true;
                }
            }
        }

        int totalBiaya = (hariSepeda * 1000) + (hariMotor * 2000) + (hariMobil * 5000);

        System.out.println("\nRincian parkir:");
        System.out.println("Sepeda: " + hariSepeda + " hari");
        System.out.println("Motor: " + hariMotor + " hari");
        System.out.println("Mobil: " + hariMobil + " hari");
        System.out.println("Total biaya parkir yang harus Anda bayar sebesar: " + totalBiaya);

        scanner.close();
    }
}
