import java.util.Scanner;

public class Uygulama5 {
    
    static void usAlma(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Asal olup olmadigini merak ettiginiz sayiyi giriniz");
        int sayi=scanner.nextInt();
        int kontrol=0;
        for (int j = 1; j <= sayi; j++) {
            if ( sayi % j != 0) {
                kontrol++;
            }
        }
        if(kontrol== (sayi-2)){
            System.out.print(sayi+" sayisi ASALDIR !");
        }
        else{
            System.out.print(sayi+" sayisi ASAL degildir !");
        }
    }
 
    public static void main(String[] args) {

    usAlma();
   
       }
}