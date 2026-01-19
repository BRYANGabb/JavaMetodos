/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parouimparmetodo;

/**
 *
 * @author bryan
 */
public class Situacao {
    private String sit = "";
    public void setValor(int val){
        if (val % 2 == 0){
            sit = "Par";
        } else {
            sit = "Impar";
        }
    }
    public String getSituacao(){
        return sit;
    }
}
