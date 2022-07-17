import java.util.Scanner;

public class Uyglama1 {
    
    static boolean isPalindrom(int number){
        int temp=number,reverseNumber=0,lastnumber;
        while(temp !=0){
            //System.out.println("==============");
            //System.out.println("Sayi :"+temp);
            lastnumber= temp %10;
            //System.out.println("Son Basamak:"+lastnumber);
            reverseNumber=reverseNumber*10 +lastnumber;
            //System.out.println("Yeni sayi:"+reverseNumber);
            temp/=10;
        }
        if(number==reverseNumber)
            return true;
        else 
            return false;
        
    }
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int sayi=scanner.nextInt();

        if(isPalindrom(sayi)==true)
            System.out.println(sayi +" : Palindrom Sayidir");
        else
            System.out.println(sayi + " : Palindrom Sayi Degildir.");

    }
}