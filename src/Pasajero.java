public class Pasajero {
    private int id;
    private int prioridad; // 1 niños, 2 adultos, 3 ancianos, 4 tripulación

    public Pasajero(int id, int prioridad) {
        this.id = id;
        this.prioridad = prioridad;
    }

    public int getId() { return id; }
    public int getPrioridad() { return prioridad; }
}
