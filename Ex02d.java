/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex02d;

import javax.swing.JOptionPane;

/**
 *
 * @author Priscila
 */
public class Ex02d {

    public static void main(String[] args) {
    double n1, n2;
    n1 = Double.parseDouble(JOptionPane.showInputDialog("Numero 1: "));
    n2 = Double.parseDouble(JOptionPane.showInputDialog("Numero 2: "));
        if (n1<n2) {
            JOptionPane.showMessageDialog(null, "O menor número é: " + (.2f + n1));
        }
        else {
            JOptionPane.showMessageDialog(null,"O menor número é: " + (.2f + n2));
        }
        }
   
}
