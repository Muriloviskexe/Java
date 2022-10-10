/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex02c;

import javax.swing.JOptionPane;

/**
 *
 * @author Priscila
 */
public class Ex02c {

    public static void main(String[] args) {
       int a, b;
       a = Integer.parseInt (JOptionPane.showInputDialog("Numero 1"));
       b = Integer.parseInt (JOptionPane.showInputDialog("Numero 2"));
       
       if (a>b) {
           System.out.println(a);
    }
    else {
    System.out.println(b);
}
}
}
