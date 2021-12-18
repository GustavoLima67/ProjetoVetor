/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosvetores;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class ExemploVetor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        Scanner sc = new Scanner(System.in);
        int vetA [] = new int[4];
        int i;
        
        // For para Prencher os dados//
        // Entrada de dados//
        for (i=1;i<=3;i++){
            System.out.println("Digite o " +i+ " numero");
            vetA[i] = sc.nextInt();
        }
        // For para exibir os dados//
        // Saida//
        for(i=1;i<=3;i++){
            System.out.println("o VetA("+i+"):"+vetA[i]);
        }
        
    }
    
}
