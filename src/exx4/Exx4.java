/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exx4;

import java.util.Scanner;

/**
 *
 * @author Gustavo.R
 */
public class Exx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
 double deposito,valorrend,juros;
 System.out.print("Rendimento após um mês.");
 
 System.out.print("\n\nInfomer o valor a ser depositado:");
 deposito = input.nextDouble();
 juros = ((deposito*0.70)/100);
valorrend=(juros+deposito);
System.out.print("\n\nO rendimento "+valorrend +"R$");



    }
}
    