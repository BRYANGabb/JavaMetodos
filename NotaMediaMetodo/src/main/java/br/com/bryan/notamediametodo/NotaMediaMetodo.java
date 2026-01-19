/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.notamediametodo;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class NotaMediaMetodo {

    public static void main(String[] args) {
        Media m = new Media();
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o valor da 1° nota: ");
        float nota1 = ler.nextFloat();
        
        System.out.print("Digite o valor da 2° nota: ");
        float nota2 = ler.nextFloat();
        
        m.setValor(nota1, nota2);
        
        System.out.println("Média: " + m.getMedia() + " " + m.getSituacao());
    }
}
