/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bryan.tabuadametodo;

/**
 *
 * @author bryan
 */
public class Multiplicacao {
    private int num;
    private String formula  = "";
    
    public void setValor(int n){
        num = n;
        int mult;
        String f = "";
        for (int i = 1; i <= 10; i++){
            mult = num * i;
            f += num  + " X " + i + " = " + mult + "\n";
        }
        formula = f;
    }
    public String getTabuada(){
        return formula;
    }
}
