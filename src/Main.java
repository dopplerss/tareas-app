import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Crear ArrayList de tareas
        ArrayList<Tarea> listaTareas = new ArrayList<>();

        // 2. Agregar tareas (sin límite)
        listaTareas.add(new Tarea("Aprender Java", 9));
        listaTareas.add(new Tarea("Hacer ejercicio", 5));
        listaTareas.add(new Tarea("Leer un libro", 3));
        listaTareas.add(new Tarea("Practicar Git", 7));  // Nueva tarea sin problema

        // llamamos al metodo
        agregarTareasEjemplo(listaTareas);

        // 3. Mostrar todas usando for-each
        System.out.println("=== MIS TAREAS ===");
        for (Tarea t : listaTareas) {
            t.mostrar();
        }

        // 4. Mostrar solo urgentes
        System.out.println("\n=== TAREAS URGENTES ===");
        for (Tarea t : listaTareas) {
            if (t.esUrgente()) {
                t.mostrar();
            }
        }

        // 5. Completar la primera tarea
        System.out.println("\n✅ Completando tarea 1...");
        listaTareas.get(0).marcarComoCompletada();
        listaTareas.get(0).mostrar();

        // 6. Tamaño de la lista
        System.out.println("\nTotal de tareas: " + listaTareas.size());

        // 7. Eliminar una tarea (por índice)
        System.out.println("\n🗑️ Eliminando tarea 3...");
        listaTareas.remove(2);  // Elimina "Leer un libro" (índice 2)

        // 8. Buscar por nombre
        System.out.println("\n🔍 Buscando tarea con 'Git'...");
        for (Tarea t : listaTareas) {
            if (t.nombre.contains("Git")) {
                System.out.println("¡Encontrada!");
                t.mostrar();
            }
        }

        // 9. Mostrar lista final
        System.out.println("\n=== LISTA FINAL (" + listaTareas.size() + " tareas) ===");
        for (Tarea t : listaTareas) {
            t.mostrar();
        }

        System.out.println("\n=== CONTADOR DE TAREAS COMPLETADAS ===");
        int contador = 0;
        for (Tarea t : listaTareas) {
            if (t.completada){
                contador++;
            }
        }
        System.out.println("Tareas completadas: " + contador);
        System.out.println("Tareas pendientes: " + (listaTareas.size() - contador));
        System.out.println("Total de tareas: " + listaTareas.size());
    }

    public static void agregarTareasEjemplo(ArrayList<Tarea> lista) {
        lista.add(new Tarea("Tarea A", 8));
        lista.add(new Tarea("Tarea B", 4));
        lista.add(new Tarea("Tarea C", 10));
    }

}