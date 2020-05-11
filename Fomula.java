
package geometri;

class Formula {

    // 1. Method
    public void barisan (int a, int n ){
  
    // 2.2 Variabel Array
       int [] perulangan = new int [n];

    // 3. Looping
        for (int index = 1; index <= perulangan.length; index++){
            System.out.println("Banyak bakteri pada menit ke-" + index + " adalah = "+ (Math.pow(2, index)*a));
            System.out.print("\n");
        }
    }
    
    public void deret(int a, int n){
       System.out.println("Jumlah bakteri setelah " + n + " menit adalah = " + a*(Math.pow(2, n)-1));
    }

}
