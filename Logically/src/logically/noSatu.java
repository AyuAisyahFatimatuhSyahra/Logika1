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
public class noSatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         float bil1, bil2, terbesar;
        System.out.println("Menentukan bilangan terbesar ");
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan bilangan 1= ");
        bil1= scan.nextFloat();
        System.out.print ("Masukkan bilangan 2= ");
        bil2= scan.nextFloat();
     
        terbesar= bil1;
     
        if (terbesar < bil2)
            terbesar=bil2;
        System.out.print("Bilangan terbesar adalah "+terbesar);
    }
 
}