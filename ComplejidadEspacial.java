class ComplejidadEspacial {

    public static int encontrarMaximo(int[] array) {
        if (array.length == 0) return -1;
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }

    public static int[] duplicarArray(int[] array) {
        int[] copia = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copia[i] = array[i] * 2;
        }
        return copia;
    }

    public static int[][] crearMatrizIdentidad(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (i == j) ? 1 : 0;
            }
        }
        return matriz;
    }

    public static int factorialRecursivo(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursivo(n - 1);
    }

    public static int factorialIterativo(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
