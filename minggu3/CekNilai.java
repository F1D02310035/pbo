import java.util.Scanner;

public class CekNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silahkan inputkan nilai Anda: ");
        int nilai = scanner.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai Anda tidak valid!"); // pak pahrul irfan said "biasain taruh negasi dulu, supaya ga ngecek berulang lagi"
        } else if (nilai >= 85) {
            System.out.println("Anda mendapat nilai A. U're Bestt!");
        } else if (nilai >= 70) {
            System.out.println("Anda mendapat nilai B. Tingkatkan lagi yaaw!");
        } else if (nilai >= 60) {
            System.out.println("Anda mendapat nilai C. Tolong berusaha lagii yaww!");
        } else if (nilai >= 50) {
            System.out.println("Anda mendapat nilai D. Jangan putus asa, ayooo kita belajar lagi!");
        } else {
            System.out.println("Anda mendapat nilai E. Kayaknya kamu perlu banyak latihan!");
        }

        scanner.close();
    }
}
