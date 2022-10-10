/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex01c;

import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class Ex01c {

    public static void main(String[] args) {
      double Santigo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário atual:\n"));
      double porc = Santigo * 0.25;
      double Satual = porc + Santigo;
      JOptionPane.showMessageDialog(null, "Seu novo salário é: \n"+Satual);
     
      
      
    
    }
}
