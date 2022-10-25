import java.awt.Color;
import java.io.File;
 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class ColorBrot {
    public static Picture reiknaMandelBrot(Square s, int n, int iterations, Color[] colors){
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                double x = s.getX0(col, n);
                double y = s.getY0(row, n);
                Complex z0 = new Complex(x, y);
                int t = mand(z0, iterations - 1);
                picture.set(col, n - 1 - row, colors[t]);
            }
        }
        return picture;
    }

    public static Square lesaMidja(String skra){
        In midja = new In(new File(skra));
        double a = midja.readDouble();
        double b = midja.readDouble();
        int c = midja.readInt();
        Square kassi = new Square(a,b,c);
        return kassi;
    }

    public static Color[] lesaColors(String skra, int itranir){
        In mandel = new In(new File(skra));
        Color[] colors = new Color[itranir];
        for (int i=0; i<itranir; i++){
        int a = mandel.readInt();
        int b = mandel.readInt();
        int c = mandel.readInt();
        colors[i] = new Color(a, b, c);
        }
        return colors;
    }
    // return number of iterations to check if c = a + ib is in Mandelbrot set
    public static int mand(Complex z0, int d) {
        Complex z = z0;
        for (int t = 0; t < d; t++) {
            if (z.abs() > 2.0) return t;
            z = z.times(z).plus(z0);
        }
        return d;
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int ITERS = Integer.parseInt(args[1]);
        Color[] colors = lesaColors("/Users/magnusde93/University-Assignments/Computer-Science-1/Week-09/mandel.txt", ITERS);
        Square kassi = lesaMidja("/Users/magnusde93/University-Assignments/Computer-Science-1/Week-09/midja.txt");
        Picture picture = reiknaMandelBrot(kassi, N, ITERS, colors);
        picture.show();
    }
}