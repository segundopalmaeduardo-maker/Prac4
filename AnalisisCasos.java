public class AnalisisCasos {

        public static void algoritmoAdaptativo(int[] array) {
            if (estaOrdenado(array)) {
                System.out.println("Array ordenado - usando búsqueda binaria (O(log n))");
            } else {
                System.out.println("Array no ordenado - ordenando primero (O(n log n))");
                
            }
        }

        private static boolean estaOrdenado(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }
