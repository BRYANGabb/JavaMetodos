/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bryan.notamediametodo;

/**
 *
 * @author bryan
 */
public class Media {
    private float nota1 = 0;
    private float nota2 = 0;
    private float m ;
    private String sit;
    
    public void setValor(float n1, float n2){
        nota1 = n1;
        nota2 = n2;
    }
    public float getMedia(){
        return m = (nota1 + nota2) / 2;
        
        
    }
    public String getSituacao(){
        if (getMedia() >= 7){
            return sit = "Aprovado";
        } else if (getMedia() >= 4){
            return sit = "Recuperação";
        } else{
            return sit = "Reprovado";
        }
    }
}
