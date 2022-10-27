/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Aðferðir til að gera krossgátu
 *
 *
 *****************************************************************************/

public class Krossgata {

    /**
     * Finnur hvort til er sameiginlegur bókstafur í orðunum s1 og s2
     * og skilar hlut af klasanum TvoOrd sem
     * hefur orðin tvö og sæti sameiginlega bókstafsins.
     * Ef engin sameiginlegur stafur finnst þá skilar aðferðin null hlut
     *
     * @param s1 orð
     * @param s2 orð
     * @return hlutur af klasanum TvoOrd sem hefur orðin tvö og sæti
     * sameiginlega bókstafsins
     */
    public static TvoOrd samiStafur(String s1, String s2) {
        int a, b;
        a = 0;
        b = 0;
        for (int i = 0; i<s1.length(); i++){
            for (int j = 0; i<s2.length(); j++){
                if (s1.charAt(i)==s2.charAt(j)){
                    a = s1.charAt(i);
                    b = s2.charAt(j);
                }
                else {
                    return null;
                }
            }
        }
        TvoOrd bla = new TvoOrd(s1, a, s2, b);
        return bla;
    }

    /**
     * Finnur tvö mismunnandi í fylki af orðum  sem hafa sameiginlegan staf og
     * skilar hlut af klasanum TvoOrd sem inniheldur orðin tvö og
     * sætin með sameiginlega stafnum
     *
     * @param ordK fylki af orðum
     * @return hlutur af klasanum TvoOrd sem hefur orðin tvö og sæti
     * sameiginlega bókstafsins. Ef engin sameiginlegur stafur finnst
     * þá skilar aðferðin null hlut
     */
    public static TvoOrd finnaOrd(String[] ordK) {
        return null;
    }

    /**
     * Finnur fyrsta orð í  fylkinu ordK sem hafa sameiginlegan bókstaf með s
     * Skilar orðunum tveimur með sætum sameiginlega bókstafsins.
     * Ef engin sameiginlegur stafur finnst þá skilar aðferðin null hlut
     *
     * @param ordK fylki af orðum
     * @param s    orð
     * @return hlutur af klasanum TvoOrd sem hefur orðin tvö og sæti
     * sameiginlega bókstafsins. skilar null ef enginn sameiginlegur
     */
    public static TvoOrd finnaOrd(String[] ordK, String s) {
        for (int i = 0; i < ordK.length; i++) {
            TvoOrd t = samiStafur(ordK[i], s);
            if (t != null)
                return t;
        }
        return null;
    }

    public static void main(String[] args) {
        String[] strengir = { "afmæli", "bál", "bók", "aldur" };
        StdOut.println(finnaOrd(strengir));
    }
}


