/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bryan.sequenciainteligente;

/**
 *
 * @author bryan
 */
public class Sequencia {
    private int v1;
    private int v2;
    private String seq;
    
    public void setValor(int v1, int v2){
        this.v1 = v1;
        this.v2 = v2;
        String s = "";
        for (int i = v1; i <= v2; i++ ){
            if ((i % 3 == 0) && (i % 5 == 0)){
                s += "XY" + " ";
            } else if (i % 5 == 0){
                s += "Y" + " ";
            } else if (i % 3 == 0){
                s += "X" + " ";
            } else {
                s += i + " ";
            }
        }
        seq = s;
    }
    public String getSequencia(){
        return seq;
    }
    
}
