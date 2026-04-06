import java.util.Scanner;

public class Tabungan {
    private String nama;
    private int saldo;

    public Tabungan(String nama, int saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public void setor(int jumlah) {
        saldo += jumlah;
        System.out.println("Setoran berhasil. Saldo saat ini    : " + saldo);
    }

    public void tarik(int jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup untuk penarikan.");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo saat ini  : " + saldo);
        }
    }

    public void cekSaldo() {
        System.out.println("Nama    : " + nama);
        System.out.println("Saldo saat ini  : " + saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("           IDENTITAS MAHASISWA           ");
        System.out.println("=========================================");
        System.out.println("Nama    : Afimarsiemo Abdhira Mahdi");
        System.out.println("NIM     : 255150707111002");
        System.out.println("Kelas   : TI-A");
        System.out.println("=========================================");
        System.out.println();
        
        System.out.print("Masukkan nama pemilik tabungan    : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan saldo awal    : ");
        int saldoAwal = scanner.nextInt();

        Tabungan tabungan = new Tabungan(nama, saldoAwal);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Setor");
            System.out.println("2. Tarik");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah setoran    : ");
                    int jumlahSetor = scanner.nextInt();
                    tabungan.setor(jumlahSetor);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah penarikan    : ");
                    int jumlahTarik = scanner.nextInt();
                    tabungan.tarik(jumlahTarik);
                    break;
                case 3:
                    tabungan.cekSaldo();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}