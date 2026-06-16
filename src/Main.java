
public class Main {
    public static void main(String[] args) {
        // 1. Variables simples
        String nombreTarea = "Aprender Java";
        boolean estaCompletada = false;
        int prioridad = 5;  // del 1 al 10

        // 2. Imprimir
        System.out.println("Tarea: " + nombreTarea);
        System.out.println("¿Completada? " + estaCompletada);
        System.out.println("Prioridad: " + prioridad);

        // 3. Modificar y volver a imprimir
        estaCompletada = true;
        System.out.println("\nDespués de estudiar:");
        System.out.println("¿Completada? " + estaCompletada);

        // 4. Array de tareas
        String[] tareas = {
                "Estudiar Java",
                "Hacer ejercicio",
                "Leer un libro"
        };

        // 5. Bucle for
        System.out.println("\n=== Mi lista de tareas ===");
        for (int i = 0; i < tareas.length; i++) {
            System.out.println((i + 1) + ". " + tareas[i]);
        }

        // 6. Condicional con prioridad
        if (prioridad > 7) {
            System.out.println("\n⚠️ Tarea URGENTE: " + nombreTarea);
        } else {
            System.out.println("\n✓ Tarea normal: " + nombreTarea);
        }

    }
}