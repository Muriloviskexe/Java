/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex01d;

import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class Ex01d {

    public static void main(String[] args) {
      double Santigo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário atual:\n"));
      double desconto = Santigo * 0.07;
      double aumento = Santigo * 0.05;
      double Satual = Santigo + aumento - desconto;
      JOptionPane.showMessageDialog(null, "Seu novo salário é: \n"+Satual + "\n Com desconto de:\n "+ desconto+ "\n E aumento de:\n "+aumento);
      
      
    }
}
