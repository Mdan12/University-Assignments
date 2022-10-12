/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  :
 *
 *
 *****************************************************************************/
public class BFylki {

  public static void main(String[] args) {
    int n, m;
    m = Integer.parseInt(args[0]);
    n = Integer.parseInt(args[1]);
    boolean[][] s = new boolean[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        s[i][j] = StdRandom.bernoulli();
        if (s[i][j]) {
          System.out.print("* ");
        } else {
          System.out.print("# ");
        }
      }
      System.out.println();
    }
  }
}
