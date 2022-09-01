/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Forritið tekur inn tvær heiltölur af skipanlínu, byrjunarhæð í metrum og
 *  lokahæð í metrum og reiknar út hækkun  og prentar út á staðalúttak.
 *
 *
 *****************************************************************************/
public class Haekkun {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(b - a);
    }
}
