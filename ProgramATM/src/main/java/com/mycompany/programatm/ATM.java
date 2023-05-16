/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programatm;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class ATM {
    private int pin;
    private double saldo;
    private Nasabah nasabah;
    private HistoriTransaksi historiTransaksi;

    public ATM() {
        this.pin = 123456;
        this.saldo = 1000000.0;
        this.nasabah = new Nasabah("Mukhlishin", "123456789");
        this.historiTransaksi = new HistoriTransaksi();
    }
    
    public void start() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SELAMAT DATANG DI ATM ===");
        System.out.print("Masukkan nomor PIN Anda: ");
        int inputPIN = scanner.nextInt();
        
        if (cekPIN(inputPIN)) {
            System.out.println("\n=== MENU ATM ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Transfer");
            System.out.println("5. Lihat Histori Transaksi");
            System.out.println("6. Keluar");
            
            System.out.print("Pilih menu (1-6): ");
            int menu = scanner.nextInt();
            
            switch (menu) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    tarikTunai();
                    break;
                case 3:
                    setorTunai();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    lihatHistoriTransaksi();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan ATM. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        } else {
            System.out.println("PIN yang Anda masukkan salah. Transaksi dibatalkan.");
        }
        
        scanner.close();
    }
    
    private boolean cekPIN(int inputPIN) {
        return inputPIN == this.pin;
    }
    
    private void cekSaldo() {
        System.out.println("Saldo Anda adalah: Rp. " + this.saldo);
    }
    
    private void tarikTunai() {
        System.out.print("Masukkan jumlah penarikan tunai: ");
        Scanner scanner = new Scanner(System.in);
        double jumlah = scanner.nextDouble();
        
        if (jumlah <= saldo) {
            this.saldo -= jumlah;
            System.out.println("Penarikan tunai berhasil. Sisa saldo Anda adalah: Rp. " + this.saldo);
            historiTransaksi.tambahTransaksi(new Transaksi("Tarik Tunai", jumlah));
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }
    
    private void setorTunai() {
        System.out.print("Masukkan jumlah setor tunai: ");
        Scanner scanner = new Scanner(System.in);
        double jumlah = scanner.nextDouble();
        
        this.saldo += jumlah;
        System.out.println("Setor tunai berhasil. Saldo Anda saat ini: Rp. " + this.saldo);
        historiTransaksi.tambahTransaksi(new Transaksi("Setor Tunai", jumlah));
    }
    
    private void

transfer() {
System.out.print("Masukkan jumlah transfer: ");
Scanner scanner = new Scanner(System.in);
double jumlah = scanner.nextDouble();

    if (jumlah <= saldo) {
        System.out.print("Masukkan nomor rekening tujuan: ");
        String rekening = scanner.next();
        
        // Logika transfer
        System.out.println("Transfer sebesar Rp. " + jumlah + " ke rekening " + rekening + " berhasil.");
        this.saldo -= jumlah;
        historiTransaksi.tambahTransaksi(new Transaksi("Transfer", jumlah));
    } else {
        System.out.println("Saldo tidak mencukupi.");
    }
}

private void lihatHistoriTransaksi() {
    historiTransaksi.tampilkanHistori();
}
}
