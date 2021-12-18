/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosvetores;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class ExemploVetor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
       
        Scanner sc = new Scanner(System.in);
       int i;      
       int vetA[] = new int[4];
       int vetB[] = new int[4];
       int vetC[] = new int[4];
       
        for(i=1;i<=3;i++){
            System.out.println("Digite VetorA["+i+"]:");
            vetA[i] = sc.nextInt();
        }
            for(i=1;i<=3;i++){
            System.out.println("Digite VetorB["+i+"]:");
            vetB[i] = sc.nextInt();
        }
            //Processamento//
              for(i=1;i<=3;i++){
        System.out.println(vetC[i] = vetA[i]+vetB[i]);
              }
  }
}