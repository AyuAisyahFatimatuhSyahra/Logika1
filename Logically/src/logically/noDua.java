/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logically;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class noDua{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float bil1, hasil;
 
    Scanner scan = new Scanner (System.in);
    System.out.println("program ganjil genap");
    System.out.println("Masukkan bilangan=");
    bil1= scan.nextFloat();
 
    if (bil1%2==0)
        System.out.println("Ini adalah bilangan genap");
 
    else if (bil1%2!=0)
        System.out.println ("Ini adalah bilangan ganjil");
    }
    
}