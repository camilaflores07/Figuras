/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras;


public class Figuras {
    
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ANSI_RED+ "* ");    
            }
            System.out.println("");
            
        }
    }
    
}
