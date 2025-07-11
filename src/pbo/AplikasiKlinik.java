package pbo;

import java.util.Scanner;

public class AplikasiKlinik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pasien[] daftarPasien = new Pasien[100];
        int jumlah = 0;

        while (true) {
            try {
                System.out.println("\n=== MENU KLINIK ===");
                System.out.println("1. Tambah Pasien");
                System.out.println("2. Tampilkan Semua Pasien");
                System.out.println("3. Keluar");
                System.out.print("Pilihan: ");
                int pilihan = Integer.parseInt(input.nextLine());

                if (pilihan == 1) {
                    if (jumlah >= daftarPasien.length) {
                        System.out.println("Kapasitas pasien penuh!");
                        continue;
                    }

                    System.out.print("Nama Pasien: ");
                    String nama = input.nextLine();
                    System.out.print("Umur Pasien: ");
                    int umur = Integer.parseInt(input.nextLine());
                    System.out.print("Penyakit: ");
                    String penyakit = input.nextLine();

                    daftarPasien[jumlah] = new Pasien(nama, umur, penyakit);
                    jumlah++;
                    System.out.println("Pasien berhasil ditambahkan.\n");

                } else if (pilihan == 2) {
                    if (jumlah == 0) {
                        System.out.println("Belum ada data pasien.");
                    } else {
                        for (int i = 0; i < jumlah; i++) {
                            System.out.println("\nPasien ke-" + (i + 1));
                            daftarPasien[i].tampilkanInfo();
                        }
                    }

                } else if (pilihan == 3) {
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                } else {
                    System.out.println("Pilihan tidak tersedia!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harus berupa angka.");
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }

        input.close();
    }
}
