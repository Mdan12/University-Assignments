/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Klasi sem lýsir lagi. Tilviksbreytur eru titill lags, flytjandi lags
 *  og hve vinsæll hann er. Hægt er að spila lagið og þá hækkar spilun þess (vinsældir)
 *  Einnig er hægt að fá streng sem sýnir innihald lagsins og hægt að fá
 *  bara spilunina (vinsældir) *
 *
 *****************************************************************************/

public class Lag {
    // Tilviksbreytur
    private String titill;  // titill lags
    private String flytjandi; // Flytjandi lags
    private int spilun;     // Vinsældir lags


    /**
     * Smiður lags
     *
     * @param t titill lags
     * @param f flytjandi
     * @param s vinsældir
     */
    public Lag(String t, String f, int s) {
        titill = t;
        flytjandi = f;
        spilun = s;
    }

    // skilar vinsældum lags
    public int getSpilun() {
        return spilun;
    }

    // spila lag og þá aukast vinsældir
    public void spila() {
        spilun++;
    }

    // skilar innihaldi hlutar sem streng
    public String toString() {
        return "Lag{" +
                "titill='" + titill + '\'' +
                ", flytjandi='" + flytjandi + '\'' +
                ", spilun=" + spilun +
                '}';
    }

    public static void main(String[] args) {
        Lag lag1 = new Lag("700 þúsund stólar", "GDRN og Magnús Jóhann", 1500);
        lag1.spila();
        System.out.println (lag1);
    }
}
