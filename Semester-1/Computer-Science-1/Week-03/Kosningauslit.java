import java.util.Arrays;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2(hjá)hi.is
 *
 *  Lýsing  :
 *
 *
 *****************************************************************************/
public class Kosningauslit {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fjoldiFlokka = Integer.parseInt(s.nextLine());
        String[] ollKjordaemi = s.nextLine().split(" ");
        int[] atkvaediEftirKjordaemi = new int[ollKjordaemi.length];
        int[] atkvaediEftirFlokka = new int[fjoldiFlokka];
        while (s.hasNextLine()) {
            var lina = s.nextLine().split(" ");
            int flokkur = Integer.parseInt(lina[0]);
            String kjordaemi = lina[1];
            int atkvaedi = Integer.parseInt(lina[2]);
            atkvaediEftirFlokka[flokkur - 1] += atkvaedi;
            int abba = ixFerdamati(kjordaemi, ollKjordaemi);
            atkvaediEftirKjordaemi[abba] += atkvaedi;
        }
        System.out.println(Arrays.toString(atkvaediEftirFlokka));
        System.out.println(Arrays.toString(atkvaediEftirKjordaemi));
    }

    public static int ixFerdamati(String s, String[] safn) {
        for (int i = 0; i < safn.length; i++) {
            if (s.equals(safn[i]))
                return i;
        }
        return -1;
    }
}
