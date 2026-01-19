/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parouimparmetodo;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ParOuImparMetodo {
    public static void main(String[] args) {
        Situacao s = new Situacao();
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int val = ler.nextInt();
        
        s.setValor(val);
        
        System.out.println("O valor " + val + " é " + s.getSituacao());
    }
}
