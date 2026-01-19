/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.tabuadametodo;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class TabuadaMetodo {

    public static void main(String[] args) {
        
        Multiplicacao t = new Multiplicacao();
        
        Scanner ler = new Scanner(System.in);
       
        System.out.print("Digite um valor para a tabuada: ");
        int num = ler.nextInt();
        
        t.setValor(num);
        
        System.out.println(t.getTabuada());
    }
}
