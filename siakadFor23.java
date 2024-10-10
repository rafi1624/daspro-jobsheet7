import java.util.Scanner;

public class siakadFor23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        double nilai, tertinggi = 0, terendah = 100;
        for (int i =1; i <= 10; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
                
            }
            if (nilai >= 60) {
                jumlahLulus++; 
                
            }
            else{
                jumlahTidakLulus++;
            }
        }
        System.out.println("Jumlah Mahasiswa Lulus: " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jumlahTidakLulus);
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
    } 
}