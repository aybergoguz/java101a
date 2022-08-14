public class Dizi03{
    public static void main(String[] args) {

        int[] list = {3,5,2,3,7,9,4,2,15,13,24};
        double avarage=0.0;
        double sum=0.0;
        for(int i=0; i<list.length-1;i++){
            sum+=list[i];
        }
        avarage= sum / list.length;
        System.out.println(sum);
        System.out.println(avarage);

        
    }
}