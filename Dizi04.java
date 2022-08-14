import java.io.OutputStream;

import java.util.Arrays;
public class Dizi04{

    public static void main(String[] args) {

        int [] list ={56, 34, 1, 8, 101, -2, -33};
        int min = list[0];
        int max = list[0];

        for(int i : list) {
            if(i < min)
                min=i;
            if(i>max) {
                max=i;
            }
        }
        System.out.println("minimum : \t)"+ min);
        System.out.println("maximum : \t"+max);

        Arrays.sort(list);
        System.out.println("en kücük ikinci:\t"+list[1]);
        System.out.println("en büyük ikinci:\t"+list[list.length-2]);

        
    }
}