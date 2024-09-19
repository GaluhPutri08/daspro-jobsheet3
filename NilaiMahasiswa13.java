import java.util.Scanner;

public class NilaiMahasiswa13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Deklarasi variabel
        String nama, nim;
        char kelas;
        Byte nomorAbsen;
        Double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        // Input data mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        nama = input.nextLine();
        
        System.out.print("Masukkan NIM mahasiswa: ");
        nim = input.nextLine();
        
        System.out.print("Masukkan kelas mahasiswa: ");
        kelas = input.nextLine().charAt(0);

        System.out.print("Masukkan nomor absen mahasiswa: ");
        nomorAbsen = input.nextByte();

        // Input nilai
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = input.nextDouble();
        
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextDouble();
        
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = input.nextDouble();

        // Hitung nilai akhir
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        // Output nilai akhir
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nomor Absen: " + nomorAbsen);
        System.out.println(String.format("Nilai Akhir: %.2f%n", nilaiAkhir));
    }
}