 import java.util.Arrays;
 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
public class SpilAHendi {
  //Búum til private tilvik þar sem við erum með
  // Spil=Hvaða spil er á hendi
  // Hversu mörg spil við erum með á hendi
  // Hversu mörg spil meigum við vera með á hendi

  private Spil[] spilAHendi;
  private int i;
  private final int MAX;

  // Þessi smiður seigir okkur hversu mörg spil við erum með á hendi
  // Og hvaða spil við erum með á hendi.

  public static void main(String[] args) {

  }

  public SpilAHendi(int n) {
      spilAHendi = new Spil[n];
      i = 0;
      MAX = n - 1;
  }

  // Þessi smiður bætir við spili.
  public void baetaVidSpili(Spil s) {
      if (!erSpilAHendi(s) && i <= MAX) {
          spilAHendi[i++] = s;
      }
  }


  // Þessi smiður skoðar hvaða spil eru á hendi
  private boolean erSpilAHendi(Spil s) {
      for (Spil spilid : spilAHendi) {
          if (spilid != null && spilid.equals(s)) {
              return true;
          }
      }
      return false;
  }


  // Þetta fall tekur spil af hendi. Tekur bæði spilið og fallið af.
  public Spil takaSpilAfHendi() {
      if (i > 0) {
          return spilAHendi[--i];
      }
      return null;
  }


  public String toString() {
      return "SpilAHendi{" + "ahendi=" + Arrays.toString(spilAHendi) + ", fjoldi=" + i + ", max="
              + MAX + "}";
  }


}
