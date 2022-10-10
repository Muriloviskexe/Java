/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex02o;

import javax.swing.JOptionPane;

/**
 *
 * @author Priscila
 */
public class Ex02o {

    public static void main(String[] args) {
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Insira sua Idade:"));
        
        if (a >= 0 && a <= 10) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: Infantil");
        }
        else if (a >= 11 && a <= 14){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Junior");
                    }
        else if (a >= 15 && a <= 20){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Adolescente");
                    }
        else if (a >= 21 && a <= 35){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Jovem");
                    }
        else if (a > 35){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Master");
                    }
        }
    }
