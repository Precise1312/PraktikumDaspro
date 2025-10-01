import java.util.Scanner;

public class tugas3Absen10wifiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama pengguna");

        String pengguna = sc.nextLine();

        if (pengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses wifi untuk dosen diberikan");
        } else {
            System.out.println("masukkan jumlah SKS");
            int SKS = sc.nextInt();
            if (SKS >= 12) {
                System.out.println("Akeses wifi untuk mahasiswa diberikan");
            } else {
                System.out.println("Akses ditolak");
            }
        }

    }
}