import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class jolatre {
    public static void main(String[] args) {
        int n = 5;
        double p = 0.1;
        for (int i =0; i<n; i++){
            for (int j=0; j<n*2-1; j++){
                if (j>=n-i-1 && j<=n+i-1){
                    if (StdRandom.bernoulli(p)){
                        System.out.print("1 \t");
                    }
                    else
                        System.out.print("5 \t");
                }
                else
                    System.out.print("0 \t");
            }  
            System.out.println(); 
        }     
    }
}