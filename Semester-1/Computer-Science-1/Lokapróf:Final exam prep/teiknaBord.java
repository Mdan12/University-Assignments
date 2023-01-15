 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class teiknaBord {
    public static void teikna(int n){
        for(int i = 0; i<n; i++){
            System.out.println();
            for (int j = 0; j<n; j++){
                if ((j+i)%2==0) System.out.print(" * ");
                else System.out.print("---");
            }
        }

    }
    public static void main(String[] args) {
        teikna(5);
      }
}