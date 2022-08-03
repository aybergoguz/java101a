package array;
import java.util.Arrays;

public class Main{

    public static void main(String [] args) {

        int[] list ={1,2,3,4};
        int[] list2={213,231,213,2134,424,232,};
        HelperArray helperArray=new HelperArray();
        helperArray.print(list);
        System.out.println();
        helperArray.print(list2);
        System.out.println();
        System.out.println(Arrays.toString(list));
    }
}