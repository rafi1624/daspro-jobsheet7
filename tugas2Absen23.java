import java.util.Scanner;

public class tugas2Absen23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi = 0, total = 0;
        do {
            
            System.out.println("Masukkan Jenis Kendaraan: (1 Mobil, 2 Motor,0 Keluar  ) ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2 ) {
                System.out.println("Masukkan Durasi: ");
                durasi = sc.nextInt();

            }if (durasi > 5) {
                total += 12500;
            }if (jenis == 1) {
                total +=durasi * 3000;    
            }else if (jenis == 2) {
                total += durasi * 2000;               
            }
        } while(jenis != 0);
        System.out.println("Total Biaya Parkir: " + total );
    }
}