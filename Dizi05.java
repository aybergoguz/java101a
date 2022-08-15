public class Dizi05{

    public static void main(String[] args) {

        String[][] letter1  = new String [7][4];
        for(int i =0; i < letter1.length; i++){
            for(int j=0; j<letter1[i].length; j++){

                if(i==0 || i==3 || i==6){
                    letter1[i][j]=" * ";
                }
                else if(j==0 || j==3){
                    letter1[i][j]=" * ";
                }
                else
                    letter1[i][j]="   ";
            }

        }

        for(String[] row1 : letter1){
            for(String col1 : row1){
                System.out.print(col1);
            }
            System.out.println();
        } 

        System.out.println("\n ============ \n");
        

        String[][] letter  = new String [6][4];
        for(int i =0; i < letter.length; i++){
            for(int j=0; j<letter[i].length; j++){

                if(i==0 || i==2){
                    letter[i][j]=" * ";
                }
                else if(j==0 || j==3){
                    letter[i][j]=" * ";
                }
                else
                    letter[i][j]="   ";
            }

        }

        for(String[] row : letter){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        } 
        
    }
}