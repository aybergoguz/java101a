import java.util.Scanner;

public class Uygulama2 {
    
    static int fibonacci(int number){
            if(number==1 || number==2){
                return 1;
            }
    
        return fibonacci(number-1)+fibonacci(number-2);
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Kac Tane fibonacci sayisi yazdirmak istiyorsunuz ?");
        int sayi=scanner.nextInt();

        for(int i=1;i<=sayi;i++){
        System.out.println(i+".fibonacci sayisi = "+fibonacci(i));
        }
       }
}