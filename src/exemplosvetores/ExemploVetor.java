/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosvetores;

/**
 *
 * @author Gustavo
 */
public class ExemploVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        int i;
        String vetA[] = new String[3];
        
        vetA[0]="Ana";
        vetA[1]="Gustavo";
        vetA[2]="Carlos";
        for(i=0;i<vetA.length;i++){
            System.out.println("Exibir o nome"+vetA[1]);
        }
    }
    
}
