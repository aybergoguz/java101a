import java.util.Scanner;

public class Uygulama6{
    
    static void desen(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz : ");
        int sayi=scanner.nextInt();
        int temp=sayi;
        do{
            System.out.print(temp+" ");
            temp-=5;
        }while(temp>=0);
        do{
            System.out.print(temp+" ");
            temp+=5;
        }while(temp<=sayi);
    }
 
    public static void main(String[] args) {

        desen();
   
    }
}