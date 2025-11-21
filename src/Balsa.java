public class Balsa {
    private String nombre;
    private int capacidad;
    private double tiempoRescate;

    public Balsa(String nombre, int capacidad, double tiempoRescate) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tiempoRescate = tiempoRescate;
    }

    public String getNombre() { return nombre; }
    public int getCapacidad() { return capacidad; }
    public double getTiempoRescate() { return tiempoRescate; }
}
