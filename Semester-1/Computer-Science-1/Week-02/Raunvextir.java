/******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
 *  T-póstur: mde2@hi.is
 *
 *  Lýsing  : Teknar eru inn tvær kommutölur, nafnvextir og verðbólgustig,
 * Raunvextir eru reiknaðir út og prentaðir
 *
 *
 *****************************************************************************/
public class Raunvextir {
    public static void main(String[] args) {
        double A = Double.parseDouble(args[0]);
        double B = Double.parseDouble(args[1]);
        double C = (((1.0 + (A / 100)) / (1.0 + (B / 100))) - 1.0) * 100;
        System.out.println(C);

    }
}
