 import java.util.ArrayList;
 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class leitaOrd {
    
    public static void main(String[] args) {
        String s = "hjol";
        String t = "jol";
        int a = LeitaOrd(s, t);
        System.out.println(a);
      }
    public static int LeitaOrd (String s, String t) {
        int times = 0;
        int index = s.indexOf(t, 0);

        while (index>=0){
            index = s.indexOf(t, index +1 );
            times++;
        }
        return times;
    }
}