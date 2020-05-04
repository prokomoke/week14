
package week_12;

import java.util.Scanner;

// 5. OOP
public class hitung {
    public static void main (String [] args ){
        Scanner input = new Scanner (System.in);
        
        formula hitung = new formula ();

        System.out.print ("Manakah yang ingin anda hitung ? \n" );
        System.out.print("1. Volume bangun ruang \n");
        System.out.print("2. Luas bangun datar \n");
        
        System.out.print ("Pilihan saya = ");
        int pilihan = input.nextInt();
        System.out.print("\n");
        
        //4. Branching
        switch (pilihan){
            case 1:
                System.out.println("MENGHITUNG VOLUME BANGUN RUANG \n");
                hitung.volume();
            break;
            case 2:
                System.out.println("MENGHITUNG LUAS BANGUN DATAR \n");
                hitung.luas();
            break;
        }
    }

}
