/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceg.aprender.calculadora;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author talles
 */
public class VerificarConta {
    
    public static boolean verificar(String text){ /*Verifica se a String é uma expressão válida. Este método usa a biblioteca Expression de Udo Klimaschewski.*/
        try{
            Expression expression = new Expression(text);
            BigDecimal bigDecimal = expression.eval(); // se o numero for inválido. entra em um erro e vai pro catch
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
      public static String[] tirarRaiz(String texto) { // pega os numeros que estao dentro de raiz
        ArrayList<String> digitos = new ArrayList<>();
        StringBuilder guardar = new StringBuilder();
        boolean encontrouRaiz = false;
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (encontrouRaiz) {
                if (Character.isDigit(caractere) || caractere == '.' || caractere == '(' || caractere == '+' || caractere == '-') {
                    guardar.append(caractere);
                } else if (guardar.length() > 0) {
                    digitos.add(guardar.toString());
                    guardar.setLength(0);
                }
            }
            if (caractere == '√') {
                encontrouRaiz = true;
            }
        }
        if (guardar.length() > 0) {
            digitos.add(guardar.toString());
        }
        return digitos.toArray(new String[0]);
    }
}
