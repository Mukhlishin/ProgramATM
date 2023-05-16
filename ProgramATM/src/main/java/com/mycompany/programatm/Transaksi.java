/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programatm;

/**
 *
 * @author ACER
 */
public class Transaksi {
    private String jenis;
    private double jumlah;
    
    public Transaksi(String jenis, double jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
    }
    
    public String getJenis() {
        return jenis;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public double getJumlah() {
        return jumlah;
    }
    
    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
}

