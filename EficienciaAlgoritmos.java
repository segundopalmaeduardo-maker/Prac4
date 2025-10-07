import java.util.Arrays;

class EficienciaAlgoritmos {

    public static class Fibonacci {

        public static int fibExponencial(int n) {
            if (n <= 1) return n;
            return fibExponencial(n - 1) + fibExponencial(n - 2);
        }

        public static int fibMemoization(int n) {
            int[] memo = new int[n + 1];
            Arrays.fill(memo, -1);
            return fibMemoHelper(n, memo);
        }

        private static int fibMemoHelper(int n, int[] memo) {
            if (n <= 1) return n;
            if (memo[n] != -1) return memo[n];
            memo[n] = fibMemoHelper(n - 1, memo) + fibMemoHelper(n - 2, memo);
            return memo[n];
        }

        public static int fibIterativo(int n) {
            if (n <= 1) return n;
            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }
}    
