
package geometri;

import java.util.Scanner;

// 5. OOP
public class Hitung {
    public static void main (String [] args ){
        Scanner input = new Scanner (System.in);
        
        Formula hitung = new Formula ();
        
        System.out.print("PERKEBANGBIAKAN AMOEBA \n");
        
        System.out.print("Waktu (dalam menit) = ");
    // 2.1 Variabel Primitif
        int time = input.nextInt();
        System.out.print("Banyak Amoeba mula-mula = ");
        int sukuPertama = input.nextInt();
        System.out.print("\n");       
       
        System.out.print ("Manakah yang ingin anda hitung ? \n" );
        System.out.print("1. Banyak bakteri dalam tiap menitnya selama n menit \n");
        System.out.print("2. Jumlah bakteri dalam n menit \n");
        System.out.print("3. Hitung Semua \n");
        
        System.out.print ("Pilihan saya = ");
        int pilihan = input.nextInt();
        System.out.print("\n");
        
    //4. Branching
        switch (pilihan){
            case 1:
                System.out.print("PENAMBAHAN AMOEBA TIAP MENIT \n");
                System.out.print("---------------------------- \n");              
                hitung.barisan(sukuPertama,time);
        break;
            case 2:
                hitung.deret(sukuPertama,time);            
        break;
            case 3:
                hitung.barisan(sukuPertama, time);
                hitung.deret(sukuPertama, time);
        break;
        }
    }

}
