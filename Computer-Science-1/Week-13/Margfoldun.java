 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Margfoldun {
    public static void main(String[] args) {
        System.out.println(margfoldun(0, 3));
      }
    public static int margfoldun(int a, int b) {
        if (a==0 || b==0) return 0;
        return b + ((a-1)*b);
    }
}