/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex02e;

import javax.swing.JOptionPane;

/**
 *
 * @author Priscila
 */
public class Ex02e {

    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
            if (n % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par");
            }
            else {
                JOptionPane.showMessageDialog(null, "O número é ímpar");
            }
    }
}
