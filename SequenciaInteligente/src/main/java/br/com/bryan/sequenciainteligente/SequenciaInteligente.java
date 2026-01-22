/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.sequenciainteligente;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class SequenciaInteligente {

    public static void main(String[] args) {
        Sequencia s = new Sequencia();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o 1° valor: ");
        int val1 = ler.nextInt();
        
        System.out.println("Digite o 2° valor: ");
        int val2 = ler.nextInt();
        
        s.setValor(val1, val2);
        
        System.out.println(s.getSequencia());
    }
}
