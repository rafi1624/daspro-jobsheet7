import java.util.Scanner;

public class tugas1Absen23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        double hargaTiket = 50000;
        double totalHarga = 0;
        int totalTiketTerjual = 0;

        while (true) {
            System.out.print("Masukkan Jumlah Tiket yang Dibeli (Ketik -1 untuk Membatalkan): ");
            jumlahTiket = sc.nextInt();

            
            if (jumlahTiket == -1) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan Jumlah Tiket Lagi ");
                continue; 
            }
            totalTiketTerjual += jumlahTiket;
            double hargaDiskon = hargaTiket * jumlahTiket;

            if (jumlahTiket > 10) {
                hargaDiskon *= 0.85; 
            } else if (jumlahTiket > 4) {
                hargaDiskon *= 0.90; 
            }

            totalHarga += hargaDiskon;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp " + hargaDiskon);
        }
        System.out.println("\nTotal tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan penjualan tiket: Rp " + totalHarga);
    }
}