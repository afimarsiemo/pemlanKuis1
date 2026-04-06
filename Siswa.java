import java.util.Scanner;

public class Siswa {
    private String nama;
    private String nim;
    private double nilai;

    public Siswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public String getkelas() {
        if (nilai >= 85) return "A";
        else if (nilai >= 75) return "B";
        else if (nilai >= 65) return "C";
        else if (nilai >= 50) return "D";
        else return "E";
    }

    

    public void dataSiswa() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Nilai   : " + nilai);
        System.out.println("Kelas   : " + getkelas());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("           IDENTITAS MAHASISWA           ");
        System.out.println("=========================================");
        System.out.println("Nama    : Afimarsiemo Abdhira Mahdi");
        System.out.println("NIM     : 255150707111002");
        System.out.println("Kelas   : TI-A");
        System.out.println("=========================================");
        System.out.println();

        System.out.print("Masukkan nama siswa   : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM          : ");
        String nim = input.nextLine();

        System.out.print("Masukkan nilai        : ");
        double nilai = input.nextDouble();

        Siswa a = new Siswa(nama, nim, nilai);
        a.dataSiswa();

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Update Nilai");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    a.dataSiswa();
                    break;
                case 2:
                    System.out.print("Masukkan nilai baru: ");
                    double nilaiBaru = input.nextDouble();
                    a.nilai = nilaiBaru;
                    System.out.println("Nilai berhasil diupdate!");
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        input.close();
    }
}

