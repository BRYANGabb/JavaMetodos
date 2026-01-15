/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.potencia;
import java.util.Scanner;
/**
 *
 * @author bryan
 */
public class Potencia {

    public static void main(String[] args) {
        Multiplicacao m = new Multiplicacao();
        
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite a base: ");
        int base = ler.nextInt();
        
        System.out.print("Digite o expoente: ");
        int exp = ler.nextInt();
        
        m.setValor(base, exp);
        
        System.out.println(m.getFormula() + m.getResultado());
    }
}
