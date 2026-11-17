/**
 * Actividad 2
 * Compara experimentalmente un algoritmo lineal O(n) con uno
 * cuadrático O(n²), midiendo el tiempo de ejecución en nanosegundos.
 */
public class ComparacionAlgoritmos {

    public static void main(String[] args) {

        // Tamaños de entrada que se van a probar
        int[] tamanos = {100, 1_000, 5_000, 10_000};

        // Encabezado de la tabla de resultados
        System.out.println("n\tO(n) ns\tO(n²) ns");

        for (int n : tamanos) {

            // Medición del algoritmo lineal O(n)
            long inicioLineal = System.nanoTime();
            algoritmoLineal(n);
            long finLineal = System.nanoTime();
            long tiempoLineal = finLineal - inicioLineal;

            // Medición del algoritmo cuadrático O(n²)
            long inicioCuadratico = System.nanoTime();
            algoritmoCuadratico(n);
            long finCuadratico = System.nanoTime();
            long tiempoCuadratico = finCuadratico - inicioCuadratico;

            // Fila de resultados: n, tiempo lineal, tiempo cuadrático
            System.out.println(
                n + "\t" + tiempoLineal + "\t" + tiempoCuadratico
            );
        }
    }

    /**
     * Algoritmo A - O(n): un solo ciclo de n iteraciones.
     */
    public static long algoritmoLineal(int n) {
        long contador = 0;
        for (int i = 0; i < n; i++) {
            contador++;
        }
        return contador;
    }

    /**
     * Algoritmo B - O(n²): dos ciclos anidados, n × n iteraciones.
     */
    public static long algoritmoCuadratico(int n) {
        long contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                contador++;
            }
        }
        return contador;
    }
}
