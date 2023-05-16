/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programatm;

/**
 *
 * @author ACER
 */

import java.util.ArrayList;
import java.util.List;

public class HistoriTransaksi {
    private List<Transaksi> histori;
    
    public HistoriTransaksi() {
        histori = new ArrayList<>();
    }
    
    public void tambahTransaksi(Transaksi transaksi) {
        histori.add(transaksi);
    }
    
    public void tampilkanHistori() {
        System.out.println("=== HISTORI TRANSAKSI ===");
        for (Transaksi transaksi : histori) {
            System.out.println("Jenis Transaksi: " + transaksi.getJenis());
            System.out.println("Jumlah: " + transaksi.getJumlah());
            System.out.println("---------------------------");
        }
    }
}
