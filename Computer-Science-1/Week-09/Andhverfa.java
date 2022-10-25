import java.awt.Color;
/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Andhverfa {
    public static Color andhverfa(Color c){
        Color a = new Color(255-c.getRed(), 255-c.getGreen(), 255-c.getBlue());
        return a;
    }
    public static void main(String[] args) {
        Color c1 = new Color (100, 150, 30);
        Color c2 = andhverfa(c1);
        System.out.println(c2);
      }
}