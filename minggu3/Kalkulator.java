import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka kedua : ");
        int b = scanner.nextInt();

        System.out.print("Masukkan angka ketiga : ");
        int c = scanner.nextInt();

        scanner.close();

        Tambah penjumlahan = new Tambah();
        int hasilPenjumlahan = penjumlahan.Tambah(a, b, c);
        System.out.println("Hasil penjumlahan = " + hasilPenjumlahan);

        Kali perkalian = new Kali();
        int hasilPerkalian = perkalian.kali(a, b, c);
        System.out.println("Hasil perkalian = " + hasilPerkalian);
    }
}

class Tambah {
    public int Tambah(int a, int b, int c) {
        return a + b + c;
    }
}

class Kali {
    public int kali(int a, int b, int c) {
        return a * b * c;
    }
}
