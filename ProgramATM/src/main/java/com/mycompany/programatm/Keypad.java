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

public class Keypad {
    private Scanner scanner;
    
    public Keypad() {
        scanner = new Scanner(System.in);
    }
    
    public int getInput() {
        return scanner.nextInt();
    }
}

