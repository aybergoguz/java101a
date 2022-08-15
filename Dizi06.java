import java.util.Arrays;

public class Dizi06{

    static boolean isFind(int[] arr ,int value){
        for(int i :arr){
            if(i==value){
                return false;
            }
        }  

        return true;
    }
    

    public static void main(String[] args) {


        int [] list ={3,7,3,3,2,9,2,10,21,10,6,1,33,4,4,9,1};
        int[] duplicate =new int [list.length];
        int startIndex=0;

        for (int i=0; i<list.length; i++){
            for (int j=0; j<list.length;j++){
                if(i!=j && list[i]==list[j]){
                    if(isFind(duplicate, list[i]) && (list[i] % 2==0)){
                        duplicate[startIndex++]=list[i];
                    }
                break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));

        for(int value : duplicate){
            if(value!=0){
                System.out.print(value+" ");
            }
        }

        
    }
}