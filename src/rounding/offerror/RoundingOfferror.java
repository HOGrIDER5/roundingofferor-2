/*
Amer Stas
2/21/2020
This program will show the rounding off error in java.
 */
package rounding.offerror;
import javax.swing.*;                                  
public class RoundingOfferror {
    public static void main(String[] args) {
    String input;
    double num;
    double num2;
    double num3;
    double error;
    input = JOptionPane.showInputDialog (" Please Enter a number"); // shows the panel so the user can enter a number
    num = Double.parseDouble(input);                                // Turns the input into a double from string
    num2= Math.sqrt(num);                                           // Takes the sqaure root of the input 
    num3 = Math.pow(num2, 2);                                       // Squares the sqaure root of the input
    System.out.println(" The sqaure of the sqaure root is " + num3);
    error = (num-num3);                                             // Finds the rounding error            
    System.out.println(" The rounding off error is " + error );
     }
    
}
