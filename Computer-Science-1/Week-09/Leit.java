 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Leit {
    public static void main(String[] args) {
 
        
      }
    public static int leit(String nafnASkra, String ord) {
        int talningOrda = 0;
        In s = new In(nafnASkra);
        while (s.hasNextLine()) {
            String lina = s.readLine();
            if (lina.contains(ord)){
                talningOrda ++;
            }
        }
        return talningOrda;
    }
    
}