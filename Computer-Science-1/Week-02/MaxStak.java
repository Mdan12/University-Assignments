/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Tekur inn þrjár heiltölur af skipanalínu og prentar út stærstu
 * heiltöluna
 *
 *
 *****************************************************************************/
public class MaxStak {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println(Math.max(a, Math.max(b, c)));
    }
}
