import java.util.Scanner;

public class tugas3Absen10Perpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah kamu punya kartu mahasiswa? (true/false)");
        boolean kartuMahasiswa = sc.nextBoolean();
        System.out.println("Apakah kamu sudah registrasi? (true/false)");
        boolean registrasi = sc.nextBoolean();

        if (kartuMahasiswa == true || registrasi == true) {
            System.out.println("boleh masuk");
        } else {
            System.out.println("ditolak masuk");
        }
    }
}