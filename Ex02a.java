/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex02a;

import javax.swing.JOptionPane;

/**
 *
 * @author Priscila
 */
public class Ex02a {

    public static void main(String[] args) {
        double n1, n2, n3, m;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));
        m = (n1+n2+n3)/3;
        System.out.println("Sua média é" + m);
        
        if (m > 6) {
            System.out.println("Você está aprovado!");
        }
        else {
            System.out.println("Você está reprovado");
        }
    }
}
