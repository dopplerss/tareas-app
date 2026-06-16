public class Tarea {
    // Atributos (características)
    String nombre;
    boolean completada;
    int prioridad;

    // Constructor (se llama cuando creas una tarea)
    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.completada = false;  // Siempre inicia incompleta
    }

    // Métodos (acciones)
    public void marcarComoCompletada() {
        this.completada = true;
    }

    public void mostrar() {
        String estado = completada ? "[X]" : "[ ]";
        System.out.println(estado + " " + nombre + " (Prioridad: " + prioridad + ")");
    }

    public boolean esUrgente() {
        return prioridad >= 8;
    }

    public void aumentarPrioridad() {
        if (this.prioridad < 10 ) {
            this.prioridad++;
        }


    }
}