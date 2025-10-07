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
