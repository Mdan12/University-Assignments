import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Tekur inn tvær double args og leyfir svo input frá user en prentar
 *   bara það sem er ekki á milli tveggja args.
 *
 *****************************************************************************/
public class FilterOut {

  public static void main(String[] args) {
    double nedri = Double.parseDouble(args[0]);
    double efri = Double.parseDouble(args[1]);
    Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
    s.useLocale(Locale.US);
    while (s.hasNext()) {
      double choice = s.nextDouble();
      if (choice < nedri || choice > efri) {
        System.out.print(choice + " ");
      }
    }
  }
}
