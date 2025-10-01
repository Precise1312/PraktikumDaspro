import java.util.Scanner;

public class tugas2Absen10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka yang kamu mau");
        int angka = sc.nextInt();

        if (angka % 2 == 0){
            System.out.println("angka tersebut GENAP");
        }
        else {
            System.out.println("angka tersebut GANJIL");
        }
    }

}