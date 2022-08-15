public class Dizi08{

    public static void main(String[] args) {
        
        int [] dizi ={10,20,20,10,10,20,5,20};
        int [] tekrar=new int [dizi.length];
        
        for(int i=0;i<dizi.length;i++)
            tekrar[i]=1;

        for(int i=0; i<dizi.length;i++){
            for(int j=0;j<dizi.length;j++){
                if( (i != j)&& (dizi[i] == dizi[j]) ){
                    tekrar[i]++;
                    dizi[j]=0;
                }
            }
            if(dizi[i] != 0)
            System.out.println(dizi[i] + " sayisi " + tekrar[i] + " kere tekrar edildi.");
        }
        

    }

}