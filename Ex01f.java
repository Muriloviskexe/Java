package com.mycompany.ex01f;

import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class Ex01f {

    public static void main(String[] args) {
    /* base * altura / 2 é a area do triangulo
    */
    double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do seu triagulo:\n"));
    double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do seu triangulo:\n"));
    double area = base * altura / 2;
    JOptionPane.showMessageDialog(null, "A area do seu trinagulo é:\n"+area);
    
    
    
    
            
         }
}