/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bryan.somanumeros;

/**
 *
 * @author bryan
 */
public class Numero {
    
    private int num;
    private int resultado;
    private String formula;
    
    public void setValor(int n){
        num = n;
        int soma = 0;
        String f = "";
        for (int i = 1; i < num; i++){
            soma += i;
            f += i + " + ";
        }
        resultado = soma + num;
        formula = f + num + " = ";
    }
    
    public int getRes(){
        return resultado;
    }
    
    public String getFormula(){
        return formula;
    }
}
