/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex01e;

import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class Ex01e {

    public static void main(String[] args) {
        /* a area do retangulo é base * altura
    */
    double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do seu retangulo:\n"));
    double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do seu retangulo:\n"));
    double area = base * altura ;
    JOptionPane.showMessageDialog(null, "A area do seu retangulo é:\n"+area);
    }
}
