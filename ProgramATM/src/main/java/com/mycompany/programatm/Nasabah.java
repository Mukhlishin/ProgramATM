/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programatm;

/**
 *
 * @author ACER
 */
    public class Nasabah {
    private String nama;
    private String nomorRekening;
    
    public Nasabah(String nama, String nomorRekening) {
        this.nama = nama;
        this.nomorRekening = nomorRekening;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNomorRekening() {
        return nomorRekening;
    }
    
    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }
}

