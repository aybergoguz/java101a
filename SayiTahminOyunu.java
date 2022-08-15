import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu{

   public static void main(String[] args) {

        Random random =new Random();
        int number= random.nextInt(100);
        //int  number  = (int) (Math.random()*100);

        Scanner scanner=new Scanner(System.in);
        int right=0;
        int selceted;
        int [] wrong =new int[5];
        boolean isWin =false;
        boolean isWrong=false;

        while(right<5){
            System.out.println("Lutfen Tahminizi Giriniz");
            selceted=scanner.nextInt();

            if(selceted<0 || selceted >100){
                System.out.println("Lutfen 0 ile 100 arasinda bir deger giriniz");
                if(!isWrong){
                    isWrong=true;
                    System.out.println("Bir kere daha yanlıis sayi girerseniz hakkiniz gidecektir");
                }
                else{
                    right++;
                    System.out.println("tekrar hatali giris\n Kalan hakkiniz:\t"+(5-right));
                }
                continue;
            }
            if(selceted==number){
                System.out.println("Tebrikler Dogru Tahmin Ettiniz !" + number);
                isWin=true;
                break;
            }
            else{
                wrong[right]=selceted;
                right++;
                System.out.println("Yanlıs Tahmin :(");
                    if(number>selceted){
                        System.out.println("sectiginiz sayi kucuk");
                    }
                    else{
                        System.out.println("sectiginiz sayi buyuk");
                    }
                System.out.println("Kalan Hakkiniz : \t" + (5-right));
            }
        }
        if(!isWin){
            System.out.println("Kaybettiniz !!");
            System.out.println("Tahminleriniz :\t"+Arrays.toString(wrong));
            System.out.println("Bulamadiginiz Sayi :\t"+number);
        }
    }
}