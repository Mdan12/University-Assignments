package hi.vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Vidskiptavinur {
    /**
     * @param name getters for the name of the user
     * @param adress getters for the address of the users
     */
    public Vidskiptavinur(String name, String adress) {
        this.name.set(name);
        this.adress.set(adress);
    }

    public static String getName() {
        return name.get();
    }

    public static StringProperty nameProperty() {
        return name;
    }
    private static StringProperty name= new SimpleStringProperty();

    public static String getAdress() {
        return adress.get();
    }

    public static StringProperty adressProperty() {
        return adress;
    }

    private static StringProperty adress= new SimpleStringProperty();

    }
