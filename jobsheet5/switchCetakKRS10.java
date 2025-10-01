import java.util.Scanner;

public class switchCetakKRS10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        switch (semester) {
     case 1:
            System.out.println("KRS Semester 1 ditampulkan");
            break;
     case 2:
            System.out.println("KRS Semester 2 ditampulkan");
            break;
     case 3:
            System.out.println("KRS Semester 3 ditampulkan");
            break;
     case 4:
            System.out.println("KRS Semester 4 ditampulkan");
            break;
     case 5:
            System.out.println("KRS Semester 5 ditampulkan");
            break;
     case 6:
            System.out.println("KRS Semester 6 ditampulkan");
            break;
     case 7:
            System.out.println("KRS Semester 7 ditampulkan");
            break;
     case 8:
            System.out.println("KRS Semester 8 ditampulkan");
            break;
        default:
            System.out.println("Semester tidak valid");
        }
    }
    
}
