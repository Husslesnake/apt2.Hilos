import java.util.*;

public class Main {
    public static void main(String[] args) {
        Barco alianza = new Barco(352);

        List<Balsa> balsas = Arrays.asList(
                new Balsa("Acasta", 1, 0.5),
                new Balsa("Banff", 2, 1),
                new Balsa("Cadiz", 3, 2),
                new Balsa("Deimos", 4, 4),
                new Balsa("Expedición", 5, 8)
        );

        Rescate rescate = new Rescate(balsas, alianza.getPasajeros());
        rescate.run();
    }
}
