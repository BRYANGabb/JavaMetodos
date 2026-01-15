/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bryan.potencia;

/**
 *
 * @author bryan
 */
public class Multiplicacao {
    private int base;
    private int exp;
    private int resultado;
    private String formula = "";
    
    public void setValor(int b, int e){
        base = b;
        exp = e;
        int m = 1;
        for (int i= 1; i < e; i++){
            m *= b;
            formula += b + " X ";
        }
        resultado = m * base;
        formula += base + " = ";
    }
    
    public int getResultado(){
        return resultado;
    }
    
    public String getFormula(){
        return formula;
    }
}
