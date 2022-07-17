import java.util.Scanner;

public class Uygulama4 {
    static int sonuc=1;
    static int usAlma(int taban ,int us){
        if(taban==0){
                return 0;
        }
        if(us==0){
                return 1;
        }
        sonuc*=taban;
        usAlma(taban, (us-1));
        return sonuc;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Tabani Giriniz : ");
        int taban=scanner.nextInt();
        System.out.println("Ussu Giriniz : ");
        int us=scanner.nextInt();

        System.out.println(taban+" uzeri "+us+" esittir :"+usAlma(taban, us));
   
       }
}