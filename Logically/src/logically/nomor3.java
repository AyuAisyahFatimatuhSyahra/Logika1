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
public class nomor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        int bil;
        int i = 0; 
        int jumlah = 0;

        System.out.println("MENGHITUNG PENJUMLAHAN DARI ANGKA 1-N");
        System.out.println("=====================================");
        System.out.println("Inputkan Bilangan = ");
        bil = scan.nextInt();

        while (i <= bil) {
            jumlah = jumlah + i;
            i++;
        }
        System.out.println("=========> " + jumlah);
    }
    }
    

