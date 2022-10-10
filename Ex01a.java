/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex01a;

import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class Ex01a {

    public static void main(String[] args) {
    double v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
    double v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero: "));
    double v3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um ultimo numero: "));
    double res123 = v1*v2*v3;
    JOptionPane.showMessageDialog(null,"O produto entre eles é : "+res123);
    
    }
}
