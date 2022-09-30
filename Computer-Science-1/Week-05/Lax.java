import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;
 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2@hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/
 public class Lax {
    public static void main(String[] args) {
        double weight = Double.parseDouble(args[0]);
        int length = Integer.parseInt(args[1]);
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        int fishLost = 0;
        int fishAll = 0;
        while(s.hasNext()){
            double weight1 = s.nextDouble();
            int length1 = s.nextInt();
            if (weight1 > weight || length1>length){
                fishLost ++;
            }
            fishAll ++;
            
            
        }
        double fishAverage = (double) fishLost / fishAll*100;
        System.out.print(fishLost + " " + fishAverage);
      }
}