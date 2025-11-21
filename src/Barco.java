import java.util.*;

public class Barco {
    private List<Pasajero> pasajeros = new ArrayList<>();

    public Barco(int totalPasajeros) {
        Random random = new Random();
        for (int i = 1; i <= totalPasajeros; i++) {
            int prioridad = 1 + random.nextInt(4); // prioridad 1–4
            pasajeros.add(new Pasajero(i, prioridad));
        }
    }

    public List<Pasajero> getPasajeros() { return pasajeros; }
}
