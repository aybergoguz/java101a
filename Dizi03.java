import java.net.SocketTimeoutException;

public class Dizi03{
    public static void main(String[] args) {

        int[] list = {1,2,3,4};
        double avarage=0.0;
        double sum=0.0;
        for(int i=0; i<list.length;i++){
            sum+=list[i];
        }
        avarage= sum / list.length;
        System.out.println(sum);
        System.out.println(avarage);

        double sum1=0.0;
        for(int i=0; i<list.length;i++){
            sum1 += (1.0 / list[i]);
        }
        double harmonik= list.length / sum1;
        System.out.println(harmonik);


        
    }
}