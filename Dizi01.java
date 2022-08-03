public class Dizi01{
    public static void main(String[] args) {

        int [][] matris = new int [3][4];
        int number=1;
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris[i].length; j++){
                matris[i][j]=number++;
            }
        }
        for(int i=0;i<matris.length;i++){
            for(int j=0; j<matris[i].length; j++){
                System.out.print(matris[i][j]+"\t");        
            }
            System.out.println();
        }
        
    }
}