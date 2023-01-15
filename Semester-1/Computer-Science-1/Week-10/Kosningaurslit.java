 import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  :
*
*
 *****************************************************************************/

public class Kosningaurslit {
    public static void main(String[] args) {
        int x = 0;
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        int fjoldaFlokka = Integer.parseInt(s.nextLine());
        int[] flokkar = new int[fjoldaFlokka];
        int[] atkvaediFlokka = new int[fjoldaFlokka];
        while (x < fjoldaFlokka) {
            flokkar[x] = x + 1;
            x++;
        }
        String[] kjoerdaemi = s.nextLine().split(" ");
        int[] atkvaediKjordaemi = new int[kjoerdaemi.length];
        while (s.hasNext()) {
            String[] lina = s.nextLine().split(" ");
            int flokkur = Integer.parseInt(lina[0]);
            String kjordami = lina[1];
            int atkvaedi = Integer.parseInt(lina[2]);
            for (int y = 0; y < flokkar.length; y++) {
                if (flokkar[y] == flokkur) {
                    atkvaediFlokka[y] += atkvaedi;
                }
            }
            for (int z = 0; z < kjoerdaemi.length; z++) {
                if (Objects.equals(kjoerdaemi[z], kjordami)) {
                    atkvaediKjordaemi[z] += atkvaedi;
                }
            }
            System.out.println("Atkvæði flokka " + Arrays.toString(atkvaediFlokka));
            System.out.println("Atkvæði kjördæma " + Arrays.toString(atkvaediKjordaemi));
        }
    }
}

