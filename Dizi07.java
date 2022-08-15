import java.util.Arrays;
import java.util.Scanner;

public class Dizi07{

    public static void main(String[] args)  {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen dizinin boyutunu giriniz");
        int diziBoyutu=scanner.nextInt();
        int [] dizi= new int[diziBoyutu];
        for (int i =0; i<diziBoyutu;i++){
            Scanner scanner2=new Scanner(System.in);
            System.out.println("Lutfen "+(i+1)+". sayiyi giriniz");
            dizi[i]=scanner2.nextInt();
        }

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
       
    }
}