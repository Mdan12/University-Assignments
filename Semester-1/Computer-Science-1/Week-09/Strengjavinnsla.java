 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Strengjavinnsla {
    public static String skiptaUt(String s, String u, String v) {
        return s.replaceAll(u, v);
    }
    public static void main(String[] args) {
        String s = "Á hrekkjavöku er grín og gaman og nammi";
        String nyttS = skiptaUt(s, "og", "eða");
        System.out.println(nyttS);
      }
}