 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Printnum {
    public static void main(String[] args) {
        System.out.println(printNum(3));
      }
    public static String printNum(int n) {
        if (n==0) return "";
        else return  n + " " + printNum(n-1).toString();
    }
}