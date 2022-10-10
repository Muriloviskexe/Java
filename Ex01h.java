/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex01h;

import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class Ex01h {

    public static void main(String[] args) {
    double km = Double.parseDouble(JOptionPane.showInputDialog("Insira a distancia em Km:\n"));
    double litros = Double.parseDouble(JOptionPane.showInputDialog("Insria a quantide Km por litro que seu carro faz: \n"));
    double res = litros / km;
    JOptionPane.showMessageDialog(null, "Seu carro vai gastar:\n"+ res+ " litros de gasolina nesse percurso");
    
    }
}
