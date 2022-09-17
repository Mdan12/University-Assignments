/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Les inn tvær heiltölur aTala og bil af skipanalínu.  
 * Fyrri talan er Unicode (Tenglar á ytra svæði.) (ascii) kóðinn fyrir char breytuna a
 * aTala+bil er Unicode kóðinn fyrir char breytuna b og
 * aTala+2*bil er Unicode kóðinn fyrir char breytuna c.
 * Forritið prentar út stafarunu sem lítur svona út
 * abcba
 *
 *
 *****************************************************************************/
public class ABBA {
    public static void main(String[] args) {
        int aTala = Integer.parseInt(args[0]);
        int bil = Integer.parseInt(args[1]);
        int a = aTala;
        int b = aTala + bil;
        int c = aTala + 2 * bil;
        System.out.println("" + (char) (a) + (char) b + (char) c + (char) (b) + (char) (a));

    }
}

