import java.util.Scanner;

public class Odev31 {
    
    static boolean isPalindrom(int number){
        int temp=number,reverseNumber=0,lastnumber;
        while(temp !=0){
            System.out.println("==============");
            System.out.println("Sayi :"+temp);
            lastnumber= temp %10;
            System.out.println("Son Basamak:"+lastnumber);
            reverseNumber=reverseNumber*10 +lastnumber;
            System.out.println("Yeni sayi:"+reverseNumber);
            temp/=10;
        }
        if(number==reverseNumber)
            return true;
        else 
            return false;
    }
    public static void main(String[] args) {

        isPalindrom(9889);



    }
}