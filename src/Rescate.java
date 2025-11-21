import java.util.*;

public class Rescate {
    private List<Balsa> balsas;
    private PriorityQueue<Pasajero> colaPrioridad;

    public Rescate(List<Balsa> balsas, List<Pasajero> pasajeros) {
        this.balsas = balsas;
        // prioridad menor = más urgente
        this.colaPrioridad = new PriorityQueue<>(Comparator.comparingInt(Pasajero::getPrioridad));
        colaPrioridad.addAll(pasajeros);
    }

    public void run() {
        while (!colaPrioridad.isEmpty()) {
            for (Balsa balsa : balsas) {
                List<Integer> ids = new ArrayList<>();
                for (int i = 0; i < balsa.getCapacidad() && !colaPrioridad.isEmpty(); i++) {
                    ids.add(colaPrioridad.poll().getId());
                }
                if (!ids.isEmpty()) {
                    System.out.println("Balsa " + balsa.getNombre() + " rescata: " + ids);
                }
            }
        }
    }
}
