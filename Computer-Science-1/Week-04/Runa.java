 /******************************************************************************
 *  Nafn    : Magnús Daníel Budai Einarsson
*  T-póstur: mde2(hjá)hi.is
*
*  Lýsing  : main fall í klasanum Runa sem tekur inn heiltölu >0 af skipanalínu, 
* setur í breytuna tala, og prentar út runu sem samanstendur af 0 og 1. Runan er af lengd tala. 
* Ef i (þar sem 1 <= i <= tala ) gengur upp í tala,  prentar forritið út 1 í sæti i í rununni, annars prentar forritið út 0 í sæti i.   
* Í lokin prentar forritið út summuna af þessari runu í nýja línu
*
*
 *****************************************************************************/
public class Runa {
    public static void main(String[] args) {
        try {int summa, tala, runa;
        tala = Integer.parseInt(args[0]);
        summa = 0;
        for (int i = 1; i <= tala; i++){
            if (tala % i == 0){
                summa += 1;
                System.out.print(1);
            } else {
                summa += 0; 
                System.out.print(0);
            }
        }
        System.out.println("");
        System.out.println(summa);
    } catch (NumberFormatException e) {
        System.out.print("Ólöglegt snið tölu");
    }
    }
}
