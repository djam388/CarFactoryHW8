import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Класс Engine с характеристикой "размер педалей"
class Engine {
    private String pedalSize;

    public Engine(String pedalSize) {
        this.pedalSize = pedalSize;
    }

    public String getPedalSize() {
        return pedalSize;
    }

    @Override
    public String toString() {
        return "Engine{pedalSize='" + pedalSize + "'}";
    }
}