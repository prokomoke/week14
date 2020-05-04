
package week_12;

import java.util.Scanner;

class formula {

    //1. Method
    public void volume1 (){
        Scanner input = new Scanner (System.in);

    // 2.1 Variabel primitif
        System.out.print("Luas Alas = ");
        int luasAlas = input.nextInt ();
        System.out.print("Tinggi = ");
        int tinggi = input.nextInt ();
        
        System.out.println("volume = " + luasAlas * tinggi);
    }
    
    public void volume2 (){
        Scanner input = new Scanner (System.in);

    // 2.1 Variabel primitif
        System.out.print("Luas Alas = ");
        int luasAlas = input.nextInt ();
        System.out.print("Tinggi = ");
        int tinggi = input.nextInt ();
        
        System.out.println("volume = " + ((luasAlas * tinggi)/3));
    }
    public void volume (){  
        
    // 2.2 Variabel Array
        String [] bangunRuang = new String [] {"Kubus", "Balok", "Prisma segitiga","Prisma segiempat", "tabung", "kerucut", "Limas segitiga", "Limas segiempat"};
        
    // 3. Looping
        for (int index1 = 0; index1 <= 5; index1++){
            System.out.println("Volume "+ bangunRuang[index1]);
            volume1();
            System.out.print("\n");
        }
        
        for (int index1 = 6; index1 < bangunRuang.length; index1++  ){
            System.out.println("Volume "+ bangunRuang[index1]);
            volume2();
            System.out.print("\n");
        }
    }
    
    //1. Method
    public void luas1 (){
        Scanner input = new Scanner (System.in);
        
    // 2.1 Variabel primitif
        System.out.print("Alas/Panjang = ");
        int base = input.nextInt ();
        System.out.print("Tinggi/Lebar = ");
        int height = input.nextInt ();
        
        System.out.println("Luas = " + base * height);
    }
    
    public void luas2 (){
        Scanner input = new Scanner (System.in);
       
    // 2.1 Variabel primitif
        System.out.print("Alas/Panjang = ");
        int base = input.nextInt ();
        System.out.print("Tinggi/Lebar = ");
        int height = input.nextInt ();
        
        System.out.println("Luas = " + ((base * height)/2));
    }
    public void luas (){  
    
    // 2.2 Variabel Array
        String [] bangunDatar = new String [] {"Persegi", "Persegi Panjang", "Jajar Genjang", "Segitiga"};
        
    // 3. Looping
        for (int index2 = 0; index2 <= 3; index2++){
            System.out.println("Luas "+ bangunDatar[index2]+ "\n");
            luas1();
            System.out.print("\n");
        }
        
        for (int index2 = 4; index2 < bangunDatar.length; index2++  ){
            System.out.println("Luas "+ bangunDatar[index2]+ "\n");
            luas2();
            System.out.print("\n");
        }
    }
}


   


