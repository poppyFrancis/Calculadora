/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceg.aprender.calculadora;

import javax.swing.JTextField;

/**
 *
 * @author talles
 */
public class ColocarText {
    
    public static void setText(JTextField conta, boolean setText, String str, String texto){ 
            //Inclui texto dentro de um JTextField. Este método usa a biblioteca Expression de Udo Klimaschewski.
            str = conta.getText() + texto;
            setText = true;
            conta.setText(String.valueOf(str));
            setText = false;
    }
}
