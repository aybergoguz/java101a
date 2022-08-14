import java.util.Arrays;
import java.util.Scanner;
public class Dizi04{

    public static void main(String[] args) {



        int [] dizi ={15,12,788,1,-1,-778,2,0 };
        Scanner scanner =new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scanner.nextInt();
        int karsilastirma=Math.abs(sayi-dizi[0]);
        for (int i : dizi){
            if(sayi-i<=0 && (Math.abs(sayi-i)) < karsilastirma){
                karsilastirma=sayi-i;
            }
        }
        System.out.println("girilen sayidan büyük en yakin sayi:\t"+(sayi-karsilastirma));

        int karsilastirma2=Math.abs(sayi-dizi[0]);
        for (int i : dizi){
            if(sayi-i>0 && (Math.abs(sayi-i)) < karsilastirma2){
                karsilastirma2=sayi-i;
            }
        }
        System.out.println("girilen sayidan kücük en yakin sayi:\t"+(sayi-karsilastirma2));


        
    }
}