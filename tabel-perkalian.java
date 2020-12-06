package tabelperkalian;

import java.util.Scanner;

public class tabelPerkalian {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai yang akan dikalikan");
        System.out.print("Nilai A : ");
        int baris = input.nextInt();
        System.out.print("Nilai B : ");
        int kolom = input.nextInt();        
        
				int[][] angka = new int[baris][kolom];
        
        System.out.println("Tabel Perkalian "+ baris + " x " + kolom);
        System.out.println("");

        for(int a = 0; a <=((kolom*5)+10);a++)
        System.out.print("=");
        

				System.out.println("");
        System.out.print("|");
        
		 		System.out.printf("%4s",'x');
        System.out.printf("%4s",'|');
        
				for(int a = 1; a <= kolom; a++){
            System.out.printf("%5d",a);
        }
        
				System.out.printf("%2s",'|');
        System.out.println("");
       
       for(int a = 0; a <=((kolom*5)+10);a++)
        	System.out.print("=");
        	System.out.println("");
        
       
        perkalian(angka);
        
        for(int a = 0; a < angka.length; a ++){
            System.out.print("|");
            System.out.printf("%4d",(a +1));
            System.out.printf("%4s",'|');
            for(int b = 0; b < angka[a].length; b++){
                System.out.printf("%5d",angka[a][b]);
            }  
            
            System.out.println(" |");
        }
        
        for(int a = 0; a <=((kolom*5)+10);a++)
        	System.out.print("=");
        	System.out.println("");

    }
   
        public static int perkalian(int[][] angka){
            int hasil = 0;
            for(int a = 0; a < angka.length; a ++){
            for(int b = 0; b < angka[a].length; b++){
               angka[a][b] = (a + 1) * (b + 1);
               hasil = angka[a][b];

            } 
        }
            return hasil; 
        }

}
