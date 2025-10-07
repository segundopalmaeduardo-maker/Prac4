public class TestComplejidad {

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3};
        int objetivo = 8;
        int n = 10;

        System.out.println("==============================================");
        System.out.println("        DEMOSTRACIÓN DE COMPLEJIDAD");
        System.out.println("==============================================\n");

        // =====================================================
        // SECCIÓN 1: COMPLEJIDAD TEMPORAL
        // =====================================================
        System.out.println("=== COMPLEJIDAD TEMPORAL ===");

        long inicio = System.nanoTime();
        int resultadoConstante = ComplejidadTemporal.accesoConstante(array);
        long fin = System.nanoTime();
        System.out.println("Acceso constante O(1): " + resultadoConstante +
                " - Tiempo: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        int resultadoLineal = ComplejidadTemporal.sumaLineal(array);
        fin = System.nanoTime();
        System.out.println("Suma lineal O(n): " + resultadoLineal +
                " - Tiempo: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        int resultadoBinario = ComplejidadTemporal.busquedaBinaria(
                Arrays.copyOf(array, array.length), objetivo);
        fin = System.nanoTime();
        System.out.println("Búsqueda binaria O(log n): índice " + resultadoBinario +
                " - Tiempo: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        ComplejidadTemporal.bubbleSort(Arrays.copyOf(array, array.length));
        fin = System.nanoTime();
        System.out.println("Bubble Sort O(n²): completado - Tiempo: " + (fin - inicio) + " ns");

        System.out.println("\n");

        // =====================================================
        // SECCIÓN 2: COMPLEJIDAD ESPACIAL
        // =====================================================
        System.out.println("=== COMPLEJIDAD ESPACIAL ===");

        int maximo = ComplejidadEspacial.encontrarMaximo(array);
        System.out.println("Máximo del array O(1): " + maximo);

        int[] duplicado = ComplejidadEspacial.duplicarArray(array);
        System.out.println("Array duplicado O(n): " + Arrays.toString(duplicado));

        int[][] matrizIdentidad = ComplejidadEspacial.crearMatrizIdentidad(4);
        System.out.println("Matriz identidad 4x4 O(n²):");
        for (int[] fila : matrizIdentidad) {
            System.out.println(Arrays.toString(fila));
        }

        int factRec = ComplejidadEspacial.factorialRecursivo(5);
        int factIter = ComplejidadEspacial.factorialIterativo(5);
        System.out.println("Factorial recursivo O(n): " + factRec);
        System.out.println("Factorial iterativo O(1): " + factIter);

        System.out.println("\n");

        // =====================================================
        // SECCIÓN 3: EFICIENCIA ALGORITMOS
        // =====================================================
        System.out.println("=== EFICIENCIA DE ALGORITMOS (FIBONACCI) ===");

        inicio = System.nanoTime();
        int fibIter = EficienciaAlgoritmos.Fibonacci.fibIterativo(n);
        fin = System.nanoTime();
        System.out.println("Fibonacci iterativo O(n): " + fibIter +
                " - Tiempo: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        int fibMemo = EficienciaAlgoritmos.Fibonacci.fibMemoization(n);
        fin = System.nanoTime();
        System.out.println("Fibonacci memoization O(n): " + fibMemo +
                " - Tiempo: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        int fibExp = EficienciaAlgoritmos.Fibonacci.fibExponencial(10);
        fin = System.nanoTime();
        System.out.println("Fibonacci exponencial O(2ⁿ): " + fibExp +
                " - Tiempo: " + (fin - inicio) + " ns");

        System.out.println("\n=== ANÁLISIS DE CASOS ===");
        EficienciaAlgoritmos.AnalisisCasos.algoritmoAdaptativo(array);

        System.out.println("\n==============================================");
        System.out.println("  EJECUCIÓN FINALIZADA - DEMO COMPLETA");
        System.out.println("==============================================");
    }
}


// ===============================================================
// =============== CLASE: COMPLEJIDAD TEMPORAL ===================
// ===============================================================
class ComplejidadTemporal {

    public static int accesoConstante(int[] array) {
        return array[0];
    }

    public static int sumaLineal(int[] array) {
        int suma = 0;
        for (int valor : array) {
            suma += valor;
        }
        return suma;
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int busquedaBinaria(int[] array, int objetivo) {
        Arrays.sort(array);
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (array[medio] == objetivo) return medio;
            if (array[medio] < objetivo) izquierda = medio + 1;
            else derecha = medio - 1;
        }
        return -1;
    }

    public static int fibonacciExponencial(int n) {
        if (n <= 1) return n;
        return fibonacciExponencial(n - 1) + fibonacciExponencial(n - 2);
    }
}
