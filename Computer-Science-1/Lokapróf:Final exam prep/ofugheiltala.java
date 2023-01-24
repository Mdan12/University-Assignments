 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class ofugheiltala {
    public static void main(String[] args) {
        int tala = 12345;
        String talasplit = tala + "";
        String[] talasplit1 = talasplit.split("");
        for (int i = 1; i<=talasplit1.length; i++){
            System.out.print(talasplit1[talasplit.length()-i]);
        }
      }
}