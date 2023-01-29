 
 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  : StdDraw notað til þess að teikna Dropbox logoið.
*
*
 *****************************************************************************/
 public class DropboxLogo {
    public static void main(String[] args) {
        StdDraw.setPenColor(61, 154, 232);
        StdDraw.filledSquare(1.0, 1.0, 1.0);
        StdDraw.setPenColor(StdDraw.WHITE);
        double[] xd = { 0.15, 0.3, 0.45, 0.3 };
        double[] yd = { 0.3, 0.2, 0.3, 0.4 };
        double[] yd1 = {0.186, 0.086, 0.186, 0.286};
        double[] cntxd = new double [xd.length];
        double[] cntyd = new double [yd.length];
        double[] xd1 = new double [xd.length];
        //for loop-a notuð til þess að hliðra polygon.
        for (int i = 0; i<xd.length; i++){
            cntxd[i] = xd[i]+0.3;
            cntyd[i] =  yd[i]+0.2;
            xd1[i] = xd[i]+0.15;
        }
        StdDraw.filledPolygon(xd, yd);
        StdDraw.filledPolygon(xd, cntyd);
        StdDraw.filledPolygon(cntxd, yd);
        StdDraw.filledPolygon(cntxd, cntyd);
        StdDraw.filledPolygon(xd1, yd1);
      }

    

}