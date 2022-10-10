/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex01b;

import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class Ex01b {

    public static void main(String[] args) {
    double v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota: "))*3;
    double v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota: "))*3;
    double v3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua ultima nota: "))*4;
    double res123 = (v1+v2+v3)/10;
    JOptionPane.showMessageDialog(null,"O produto entre eles é : "+res123);
    }
}
