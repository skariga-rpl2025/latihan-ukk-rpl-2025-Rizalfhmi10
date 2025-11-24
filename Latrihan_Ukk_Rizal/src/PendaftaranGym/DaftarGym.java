/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PendaftaranGym;

import java.util.Scanner;

/**
 *
 * @author Lab Studio
 */
public class DaftarGym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahAnggota = 0;
        String lagi;

        System.out.println("=== PROGRAM PENDAFTARAN ANGGOTA GYM ===");

        do {
            // Meminta nama anggota
            System.out.print("Masukkan nama anggota: ");
            String nama = input.nextLine();
            jumlahAnggota++;

            // Menanyakan apakah ingin daftar lagi
            System.out.print("Daftar anggota lagi? [ya/tidak]> ");
            lagi = input.nextLine().trim();

        } while (lagi.equalsIgnoreCase("ya"));

        // Output total anggota
        System.out.println("\nTotal anggota yang didaftarkan hari ini: " + jumlahAnggota);

        input.close();
    }
}
