/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praticando02identificandoocha;

import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Praticando02IdentificandoOCha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int T = teclado.nextInt();
        int A = teclado.nextInt(); 
        int B = teclado.nextInt(); 
        int C = teclado.nextInt(); 
        int D = teclado.nextInt(); 
        int E = teclado.nextInt();
        //System.out.println(T);
        int conc = 0;
        if (A == T) conc++;
        if (B == T) conc++;
        if (C == T) conc++;
        if (D == T) conc++;
        if (E == T) conc++;
        System.out.print(conc);
    }
        
}
    

