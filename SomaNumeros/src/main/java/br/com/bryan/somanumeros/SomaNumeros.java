/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.somanumeros;
import java.util.Scanner;
/**
 *
 * @author bryan
 */
public class SomaNumeros {

    public static void main(String[] args) {
        Numero n = new Numero();
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num = ler.nextInt();
        
        n.setValor(num);
        
        System.out.println(n.getFormula() + n.getRes());
    }
}
